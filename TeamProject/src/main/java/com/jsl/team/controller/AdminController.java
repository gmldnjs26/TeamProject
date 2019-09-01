package com.jsl.team.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
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
import com.jsl.team.dto.QnaVO;
import com.jsl.team.dto.ReserveInfoVO;
import com.jsl.team.dto.ReserveViewVO;
import com.jsl.team.paging.CriteriaVO;
import com.jsl.team.paging.PageMaker;
import com.jsl.team.service.MemberService;
import com.jsl.team.service.QnaService;
import com.jsl.team.service.ReserveService;

@Controller
@SessionAttributes("admin")
public class AdminController {
	@Autowired
	private MemberService memberService;

	@Autowired
	private ReserveService reserveService;

	@Autowired
	private QnaService qnaService;
	
	@RequestMapping("admin_login.do")
	public String admin_login(@RequestParam(value = "id") String id, @RequestParam(value = "pwd") String pwd,
			Model model, CriteriaVO cri, HttpSession session) { // cri 생성자 호출
		session.removeAttribute("loginMember"); // 로그인 했던거 지움
		if (id.equals("admin") && pwd.equals("1234")) {
			model.addAttribute("admin", "admin");
			return "redirect:admin_member_list.do";
		} else {
			model.addAttribute("message", "間違い管理者の情報");
			return "admin/main2";
		}
	}

	@RequestMapping("admin_logout.do")
	public String admin_logout(HttpSession session) {
		session.removeAttribute("admin");
		return "redirect:index.do";
	}

	/*------------------------------------------------------------------멤버 부분----------------------------------------------------------------------*/

	@RequestMapping("admin_member_list.do")
	public String admin_member_list(CriteriaVO cri, Model model) { // cri -> 현페,페보갯수
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(memberService.getTotalRecord());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", cri.getPage());
		map.put("perPageNum", cri.getPerPageNum());
		model.addAttribute("memberList", memberService.getCurPageMemberList(cri));
		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("page", cri.getPage());
		return "admin/member/memberList";
	}

	@RequestMapping("admin_member_detail.do")
	public String admin_memeber_detail(Model model, @RequestParam(value = "mber_id") String mber_id,
			@RequestParam(value = "page") int page) {
		model.addAttribute("memberVO", memberService.getSearchMember(mber_id));
		model.addAttribute("page", page);
		return "admin/member/memberDetail";
	}

	@RequestMapping("admin_member_update_form.do")
	public String admin_member_update_form(Model model, @RequestParam(value = "id") String mber_id,
			@RequestParam(value = "page") int page) {
		model.addAttribute("memberVO", memberService.getSearchMember(mber_id));
		model.addAttribute("page", page);
		return "admin/member/memberUpdate";
	}

	@RequestMapping("admin_member_update.do")
	public String admin_member_update(MemberVO vo, Model model, @RequestParam(value = "page") int page) {
		if (vo.getDm_recptn_yn() == null) // 체크박스는 체크 안되면 null 로 와서
			vo.setDm_recptn_yn("N");
		if (vo.getEmail_recptn_yn() == null)
			vo.setEmail_recptn_yn("N");
		if (vo.getSms_recptn_yn() == null)
			vo.setSms_recptn_yn("N");
		memberService.updateMember(vo);
		System.out.println("Member Update Success!");
		model.addAttribute("page", page); // 페이지 정보 담아서 해당 페이지로 이동
		return "redirect:admin_member_list.do";
	}

	@RequestMapping("admin_memeber_search.do")
	public String member_search(Model model, @RequestParam("search_id") String search_id,
			@RequestParam("page") int page) {
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		memberList = memberService.getSearchMemberList(search_id);
		if (memberList.size() != 0) {
			model.addAttribute("memberList", memberList);
			model.addAttribute("page", page);
			return "admin/member/memberList";
		} else {
			System.out.println("실패 들어옴");
			return "admin/member/search_fail";
		}
	}

	/*------------------------------------------------------------------예약 부분----------------------------------------------------------------------*/

	@RequestMapping("admin_reserve_list.do")
	public String getReserveViewList(Model model, CriteriaVO cri) {
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(reserveService.getReserveTotalRecord());

		List<ReserveViewVO> list = new ArrayList<ReserveViewVO>();

		String[] re_status_val = { "입금대기", "예약완료", "예약취소", "숙박종료" };
		model.addAttribute("reserveList", reserveService.getReserveViewList(cri));
		model.addAttribute("re_status_val", re_status_val);
		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("page", cri.getPage());
		return "admin/reserve/reserveList";
	}

	@RequestMapping("admin_re_status_change.do")
	@ResponseBody
	public Map<String, Object> re_status_change(Model model, @RequestBody Map<String, Object> allData) { // 예약 상태
																											// 바꾸기(ajax)
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", reserveService.updateReserveStatus(allData)); // 이렇게 날려도 DB NUMBER 자료형에 맵핑이 잘된다.
		return map;
	}

	@RequestMapping("admin_reserve_search.do")
	public String reserve_search(Model model, @RequestParam("search_id") String search_id) {
		List<ReserveViewVO> reserveList = new ArrayList<ReserveViewVO>();
		reserveList = reserveService.getSearchReserveViewList(search_id);
		if (reserveList.size() != 0) {
			model.addAttribute("reserveList", reserveList);
			return "admin/reserve/reserveList";
		} else {
			return "admin/reserve/search_fail";
		}
	}

	@RequestMapping("admin_reserve_delete.do")
	public String reserve_delete(@RequestParam("re_code") int re_code, Model model) {
		if (reserveService.deleteReserve(re_code) == 1)
			return "admin/reserve/delete_success";
		else
			return "admin/reserve/delete_fail";
	}

	@RequestMapping("admin_memo_form.do")
	public String reserve_memo(@RequestParam("re_code") int re_code, Model model) {
		model.addAttribute("reserveVO", reserveService.getReserveVO(re_code));
		return "admin/reserve/memo";
	}

	/*------------------------------------------------------------------질문 부분----------------------------------------------------------------------*/
	@RequestMapping("admin_rep_write.do")
	public String repWrite(QnaVO vo) {
		qnaService.repWrite(vo);
		return "redirect:admin_qna_list.do";
	}

	@RequestMapping("admin_qna_list.do")
	public String getQnaList(Model model, CriteriaVO cri) {
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(qnaService.getQnaTotalRecord());
		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("page", cri.getPage());
		model.addAttribute("qnaList", qnaService.getQnaList(cri));
		return "admin/qna/qnaList";
	}

	@RequestMapping("admin_qna_detail.do")
	public String getQnaDetail(Model model, @RequestParam("q_code") int q_code) {
		model.addAttribute("qnaVO", qnaService.getQnaDetail(q_code));
		return "admin/qna/qnaDetail";
	}

	@RequestMapping("admin_qna_search.do")
	public String getSearchQnaList(Model model, @RequestParam(value = "search_title") String q_title) {
		model.addAttribute("qnaList", qnaService.getSearchQnaList(q_title));
		return "admin/qna/qnaList";
	}
}
