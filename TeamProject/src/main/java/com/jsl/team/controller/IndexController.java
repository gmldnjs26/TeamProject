package com.jsl.team.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {
	
	@RequestMapping(value = "notice.do")
	public String notice() {
		return "center/notice";
	}
	
	@RequestMapping("index.do")
	public String index() {
		System.out.println("index 호출");
		return "index";
	}
	@RequestMapping("calendar.do")
	public void calendar(@RequestParam(value="calen")String date,@RequestParam(value="depart")String depart) {
		System.out.println(date);
		System.out.println(depart);
	}
	@RequestMapping("company.do")
	public String company() {
		return "company/company";
	}
	@RequestMapping("event.do")
	public String event() {
		return "company/event";
	}
	@RequestMapping("tour.do")
	public String tour() {
		return "company/tour";
	}
	@RequestMapping("map.do")
	public String map() {
		return "company/map";
	}
}
