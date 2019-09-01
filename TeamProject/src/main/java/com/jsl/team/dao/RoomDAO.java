package com.jsl.team.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsl.team.dto.RoomVO;

@Repository("roomDAO")
public class RoomDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<RoomVO>getRoomList(){
		return mybatis.selectList("RoomDAO.getRoomList");
	}
	
	public RoomVO getRoomSub(int r_code) {
		return mybatis.selectOne("RoomDAO.getRoomSub", r_code);
	}
}
