package com.jsl.team.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsl.team.dto.MealVO;
import com.jsl.team.service.MealService;

@Service(value="mealService")
public class MealServiceImpl implements MealService{
	@Autowired
	private MealDAO mealDAO;
	
	// 사용자
	@Override
	public List<MealVO> getMealList() {
		return mealDAO.getMealList();
	}
	
	// 관리자
	@Override
	public MealVO getMeal(int m_code) {
		return mealDAO.getMeal(m_code);
	}
}
