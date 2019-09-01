package com.jsl.team.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsl.team.dto.SpaInVO;
import com.jsl.team.dto.SpaOutVO;

@Repository(value="spaDAO")
public class SpaDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<SpaInVO>getSpaInList(){
		return mybatis.selectList("SpaDAO.getSpaInList");
	}
	public List<SpaOutVO>getSpaOutList(){
		return mybatis.selectList("SpaDAO.getSpaOutList");
	}
}
