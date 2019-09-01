package com.jsl.team.service;

import java.util.List;
import java.util.Map;

import com.jsl.team.dto.PaymentVO;
import com.jsl.team.dto.ReserveVO;
import com.jsl.team.dto.ReserveViewVO;
import com.jsl.team.paging.CriteriaVO;

public interface ReserveService {
	//사용자

	public void insertReserve(ReserveVO vo);
	
	public void insertPayment(PaymentVO vo);
	
	public List<ReserveVO>getReserveAllList();
	
	public List<ReserveVO>getRoomReservedList(int r_code); // 해당방의 예약리스트
	
	
	// 관리자
	public ReserveVO getReserveVO(int re_code);
	
	public List<ReserveViewVO>getReserveViewList(CriteriaVO cri);
	
	public List<ReserveViewVO>getSearchReserveViewList(String search_id);
	
	public int getReserveTotalRecord();
	
	public int updateReserveStatus(Map<String,Object>allData);
	
	public int deleteReserve(int re_code);
}