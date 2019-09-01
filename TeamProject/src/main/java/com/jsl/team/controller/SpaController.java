package com.jsl.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsl.team.service.SpaService;

@Controller
public class SpaController {
	@Autowired
	private SpaService spaService;
	
	@RequestMapping("spa_list.do")
	public String getSpaLis(Model model) {
		model.addAttribute("spa_in", spaService.getSpanInList());
		model.addAttribute("spa_out", spaService.getSpanOutList());
		return "spa/spa_list";
	}
}
