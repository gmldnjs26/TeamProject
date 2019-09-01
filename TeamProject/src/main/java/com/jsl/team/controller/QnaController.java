package com.jsl.team.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsl.team.dto.MemberVO;
import com.jsl.team.dto.QnaVO;
import com.jsl.team.service.QnaService;

@Controller
public class QnaController {
	@Autowired
	private QnaService qnaService;

	@RequestMapping("qna_list.do")
	public String getLoginMemberQnaList(Model model, HttpSession session) {
		MemberVO memberVO = (MemberVO) session.getAttribute("loginMember");
		if (memberVO == null)
			return "need_login";
		else {
			model.addAttribute("qnaList", qnaService.getLoginUserQnaList(memberVO.getMber_id()));
			return "qna/qna_list"; // 이름 나중에 고치기
		}
	}

	@RequestMapping("qna_write_form.do")
	public String qna_write_form() {
		return "qna/qna_write";
	}

	@RequestMapping("qna_write.do")
	public String qna_write(QnaVO vo) {
		vo.setA_content("");
		vo.setA_title("");
		qnaService.insertQna(vo);
		return "redirect:qna_list.do";
	}
	@RequestMapping("qna_delete.do")
	public String qna_delete(int q_code) {
		qnaService.deleteQna(q_code);
		System.out.println("削除");
		return "redirect:qna_list.do";
	}

	@RequestMapping("qna_view.do")
	public String qna_view(Model model, @RequestParam("q_code") int q_code) {
		model.addAttribute("qnaVO", qnaService.getQnaDetail(q_code));
		return "qna/qna_view";
	}
	@RequestMapping("qna_modify_form.do")
	public String qna_modify_form() {
		return "/qna/qna_modify";
	}

}
