package com.jsl.team.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.jsl.team.dto.MemberVO;
import com.jsl.team.dto.PaymentVO;
import com.jsl.team.dto.ReserveInfoVO;
import com.jsl.team.dto.ReserveVO;
import com.jsl.team.dto.RoomVO;
import com.jsl.team.service.MealService;
import com.jsl.team.service.MemberService;
import com.jsl.team.service.ReserveService;
import com.jsl.team.service.RoomService;

@Controller
@SessionAttributes(value = "ReserveInfo")
public class ReserveController {
	@Autowired
	private ReserveService reserveService;
	@Autowired
	private RoomService roomService;
	@Autowired
	private MealService mealService;
	@Autowired
	private MemberService memberService;

	final static String DATE_PATTERN = "yyyy-MM-dd";

	@RequestMapping(value = "reserve_search_date.do")
	public String getReserveSerachDate(Model model, @RequestParam("depart") String check_in,
			@RequestParam("return") String check_out, HttpSession session) throws ParseException {
		if(session.getAttribute("loginMember") == null)
			return "need_login";
		Map<Integer, List<String>> re_map = reserved_days(reserveService.getReserveAllList());
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
		Date ckIn = sdf.parse(check_in);
		Date ckOut = sdf.parse(check_out);
		Date curDay = ckIn;
		List<String> re_list = new ArrayList<String>(); // 체크인 ~ 체크아웃 모든 날짜들

		while (curDay.compareTo(ckOut) <= 0) { // re_list -> 체크인 ~ 체크아웃 날짜들은 다 잘 들어감
			re_list.add(sdf.format(curDay));
			Calendar c = Calendar.getInstance();
			c.setTime(curDay);
			c.add(Calendar.DAY_OF_MONTH, 1);
			curDay = c.getTime();
		}

		List<RoomVO> roomList = new ArrayList<RoomVO>();
		roomList = roomService.getRoomList();
		for (int i = 1; i <= 8; i++) {
			if (re_map.get(i).size() == 0)
				continue;
			for (int k = 0; k < re_list.size(); k++) {
				if (re_map.get(i).indexOf(re_list.get(k)) != -1) {
					for (int a = 0; a < roomList.size(); a++) {
						if (roomList.get(a).getR_code() == i)
							roomList.remove(a);
					}
				}
			}
		}

		model.addAttribute("roomList", roomList);
		model.addAttribute("check_in", check_in);
		model.addAttribute("check_out", check_out);
		return "rooms/room_list";
	}

	// 예약 2단계 넘어가기
	@RequestMapping("reserve_step2.do")
	public String reserveStep2(Model model, @RequestParam("depart") String check_in,@RequestParam("r_code")int r_code,
			@RequestParam("return") String check_out,@RequestParam("r_price")int r_price, @RequestParam("r_title") String r_title) throws ParseException {
		ReserveInfoVO reserveInfo = new ReserveInfoVO();
		reserveInfo.setCheck_in((java.sql.Date.valueOf(check_in)));
		reserveInfo.setCheck_out((java.sql.Date.valueOf(check_out)));
		reserveInfo.setR_price(r_price);
		reserveInfo.setR_code(r_code);
		reserveInfo.setR_title(r_title);
		model.addAttribute("ReserveInfo", reserveInfo);
		model.addAttribute("mealList", mealService.getMealList());

		return "reserve/reserve_step2";
	}
	
	@RequestMapping("reserve_step3.do")
	public String reserveStep3(Model model, @RequestParam(value="m_code", required = false) int m_code, HttpSession session,
										@RequestParam(value="m_price",required = false) int m_price, @RequestParam("m_title") String m_title) {
		ReserveInfoVO vo = (ReserveInfoVO) session.getAttribute("ReserveInfo");
		
		vo.setM_code(m_code); // m_code 그냥 받아들이나?
		vo.setM_price(m_price); // 식사 가격 받아들이기
		vo.setM_title(m_title);
		vo.setTax_price(0);
		vo.setSum_price(0);
		model.addAttribute("ReserveInfo", vo);
		return "reserve/reserve_step3";
	}
	
	@RequestMapping("re_cal.do")
	@ResponseBody
	public Map<String,Object> re_cal(Model model,HttpSession session,@RequestBody int num_people){ // String 으로도 받아진다 신기방기
		ReserveInfoVO vo = (ReserveInfoVO)session.getAttribute("ReserveInfo");
		MemberVO mVo = (MemberVO)session.getAttribute("loginMember");
		Map<String, Object> map2 = new HashMap<String, Object>();
		int total_price = (vo.getM_price()+vo.getR_price())*num_people;
		int tax_price = total_price/13;
		int mileage = total_price/20;
		int membership = 0;
		if(mVo.getGrade() == 1)
			membership = (int) (total_price*0.03);
		else if(mVo.getGrade() == 2)
			membership = (int) (total_price*0.05);
		else
			membership = (int) (total_price*0.07);
		
		
		vo.setSum_price(total_price+tax_price-membership); // 총가격+세금 -멤버쉽할인
		vo.setTax_price(tax_price);
		vo.setMileage(mileage);
		vo.setMembership(membership);
		vo.setNum_people(num_people);
		
		model.addAttribute("ReserveInfo", vo);
		map2.put("result", 1);
		map2.put("sum_price", vo.getSum_price());
		map2.put("tax_price", vo.getTax_price());
		map2.put("mileage",vo.getMileage());
		map2.put("membership",vo.getMembership());
		return map2;
		
	}
	@RequestMapping("reserve_insert.do")
	public String reserve_insert(Model model,@RequestParam("pay_way")String pay_way,@RequestParam("re_memo")String re_memo,HttpSession session) {
		System.out.println(pay_way);
		ReserveInfoVO vo = (ReserveInfoVO)session.getAttribute("ReserveInfo");
		ReserveVO reserveVO = new ReserveVO();
		PaymentVO paymentVO = new PaymentVO();
		MemberVO memberVO = (MemberVO)session.getAttribute("loginMember");
		vo.setMber_id(memberVO.getMber_id());
		reserveVO.setCheck_in(vo.getCheck_in());
		reserveVO.setCheck_out(vo.getCheck_out());
		reserveVO.setM_code(vo.getM_code());
		reserveVO.setMber_id(memberVO.getMber_id());
		reserveVO.setNum_people(vo.getNum_people());
		reserveVO.setR_code(vo.getR_code());
		reserveVO.setRe_memo(re_memo);
		reserveService.insertReserve(reserveVO); // 예약 넣기 완료
		paymentVO.setMber_id(memberVO.getMber_id());
		paymentVO.setPay_price(vo.getSum_price());
		paymentVO.setPay_way(pay_way);
		reserveService.insertPayment(paymentVO); // 결제 넣기 완료
		
		memberService.updateMembership(vo);
		// 멤버 마일리지및 예약 횟수 예약 금액 추가 하기
		
		session.removeAttribute("ReserveInfo"); // 예약세션 제거
		return "reserve/reserve_success";
	}

	public static Map<Integer, List<String>> reserved_days(List<ReserveVO> list) throws ParseException {
		Map<Integer, List<String>> re_map = new HashMap<Integer, List<String>>();

		for (int i = 0; i < 9; i++)
			re_map.put(i, new ArrayList<String>());
		for (int i = 0; i < list.size(); i++) {
			String inputStartDate = String.valueOf(list.get(i).getCheck_in());
			String inputEndDate = String.valueOf(list.get(i).getCheck_out());
			SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
			Date startDate = sdf.parse(inputStartDate);
			Date endDate = sdf.parse(inputEndDate);
			Date currentDate = startDate;
			while (currentDate.compareTo(endDate) <= 0) {
				re_map.get(list.get(i).getR_code()).add(sdf.format(currentDate));
				Calendar c = Calendar.getInstance();
				c.setTime(currentDate);
				c.add(Calendar.DAY_OF_MONTH, 1);
				currentDate = c.getTime();
			}
		}
		return re_map;
	}
}
