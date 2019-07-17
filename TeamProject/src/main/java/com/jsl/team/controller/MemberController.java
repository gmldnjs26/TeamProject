package com.jsl.team.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsl.team.dto.MemberVO;

@Controller
public class MemberController {
	@RequestMapping("join_form.do")
	public String join_form() {
		return "member/join_form";
	}
	@RequestMapping("login_form.do")
	public String login_form() {
		return "login/login";
	}
	
	@RequestMapping("join.do")
	public void join(@RequestParam(value ="mber_id" )String id){
		System.out.println(id);
		
	}
	@RequestMapping("idCheck.do")
	public @ResponseBody Map<String,Object> idCheck(Model model,@RequestParam(value ="mber_id" )String id) {
		Map<String,Object>map = new HashMap<String,Object>();
		map.put("result", 1);
		return map;
	}
}
