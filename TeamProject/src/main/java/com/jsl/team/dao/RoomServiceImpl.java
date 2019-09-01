package com.jsl.team.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsl.team.dto.RoomVO;
import com.jsl.team.service.RoomService;

@Service(value = "roomService")
public class RoomServiceImpl implements RoomService{
	@Autowired
	private RoomDAO roomDAO;
	
	@Override
	public List<RoomVO> getRoomList() {
		return roomDAO.getRoomList();
	}
	
	@Override
	public RoomVO getRoomSub(int r_code) {
		return roomDAO.getRoomSub(r_code);
	}
}
