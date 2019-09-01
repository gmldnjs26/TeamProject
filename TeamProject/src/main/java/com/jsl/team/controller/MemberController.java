package com.jsl.team.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.jsl.team.dto.MemberVO;
import com.jsl.team.service.MemberService;
import com.jsl.team.service.ReserveService;

@Controller
@SessionAttributes(value = "loginMember")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private ReserveService reserveService;

	@RequestMapping("join_form.do")
	public String join_form() {
		return "member/join_form";
	}

	@RequestMapping("login_form.do")
	public String login_form() {
		return "member/login";
	}

	@RequestMapping("join.do")
	public String join(MemberVO vo,Model model) {
		if (vo.getDm_recptn_yn() == null) // 체크박스는 체크 안되면 null 로 와서
			vo.setDm_recptn_yn("N");
		if (vo.getEmail_recptn_yn() == null)
			vo.setEmail_recptn_yn("N");
		if (vo.getSms_recptn_yn() == null)
			vo.setSms_recptn_yn("N");
		memberService.insertMember(vo);
		return "member/join_success";
	}

	@RequestMapping("idCheck.do")
	public @ResponseBody Map<String, Object> idCheck(Model model, @RequestParam(value = "mber_id") String mber_id) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (memberService.idCheck(mber_id) == null) {
			map.put("result", 1);
		} else
			map.put("result", 0);
		return map;
	}

	@RequestMapping("login.do")
	public String login(@RequestParam(value = "mber_id") String mber_id, @RequestParam(value = "mber_pw") String pw,
			Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("mber_id", mber_id);
		map.put("pw", pw);
		MemberVO member = memberService.login(map);
		// 아이디가 맞으면
		if (member != null) {
			if(member.getGrade() >= 4) {
				return "admin/main2";
			}else {
				model.addAttribute("loginMember", member);
				return "index";
			}
		} else// 아이디나 비밀번호가 틀리면
			return "member/login_fail";
	}

	@RequestMapping("logout.do")
	public String logout(SessionStatus sessionStatus) {
		sessionStatus.setComplete(); // 세션 비워버리기
		return "redirect:index.do";
	}
	
	@RequestMapping("mypage.do")
	public String mypage(Model model,HttpSession session) {
		MemberVO vo = (MemberVO)session.getAttribute("loginMember");
		if (vo == null) // 로그인 하지 않은사람은 로그인으로 이동
			return "need_login";
		model.addAttribute("reserveList", reserveService.getSearchReserveViewList(vo.getMber_id()));
		return "member/mypage";
	}
}
