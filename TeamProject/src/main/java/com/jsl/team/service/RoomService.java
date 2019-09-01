package com.jsl.team.service;

import java.util.List;

import com.jsl.team.dto.RoomVO;

public interface RoomService {
	public List<RoomVO>getRoomList(); // 방리스트 가져오기
	
	public RoomVO getRoomSub(int r_code); // 방 하나 가져오기
}
