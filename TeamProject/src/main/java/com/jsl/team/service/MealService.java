package com.jsl.team.service;

import java.util.List;

import com.jsl.team.dto.MealVO;

public interface MealService {
	public MealVO getMeal(int m_code); // 식사 한개 가져오기
	
	public List<MealVO>getMealList(); // 식사 다 가져오기
}
