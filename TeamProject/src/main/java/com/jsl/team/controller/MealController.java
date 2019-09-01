package com.jsl.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsl.team.service.MealService;

@Controller
public class MealController {
	@Autowired
	private MealService mealService;
	
	@RequestMapping("meal_sub.do")
	public String getMeal(Model model,@RequestParam(value="m_code")int m_code) {
		model.addAttribute("mealVO", mealService.getMeal(m_code));
		System.out.println(mealService.getMeal(m_code).getM_content());
		return "meal/meal_sub";
	}
}
