package com.jsl.team.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsl.team.dto.MealVO;

@Repository(value="mealDAO")
public class MealDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public MealVO getMeal(int m_code) {
		return mybatis.selectOne("MealDAO.getMeal",m_code);
	}
	
	public List<MealVO>getMealList(){
		return mybatis.selectList("MealDAO.getMealList");
	}
}
