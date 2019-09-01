package com.jsl.team.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsl.team.dto.PaymentVO;
import com.jsl.team.dto.ReserveVO;
import com.jsl.team.dto.ReserveViewVO;
import com.jsl.team.paging.CriteriaVO;
import com.jsl.team.service.ReserveService;

@Service(value = "reserveSerive")
public class ReserveServiceImpl implements ReserveService {
	@Autowired
	private ReserveDAO reserveDAO;

	@Override
	public void insertReserve(ReserveVO vo) {
		reserveDAO.insertReserve(vo);
	}
	@Override
	public void insertPayment(PaymentVO vo) {
		reserveDAO.insertPayment(vo);
	}
	@Override
	public List<ReserveVO> getReserveAllList() {
		return reserveDAO.getReserveAllList();
	}
	@Override
	public List<ReserveVO> getRoomReservedList(int r_code) {
		return reserveDAO.getRoomReservedList(r_code);
	}

	// 관리자
	@Override
	public List<ReserveViewVO> getReserveViewList(CriteriaVO cri) {
		return reserveDAO.getReserveViewList(cri);
	}

	@Override
	public int getReserveTotalRecord() {
		return reserveDAO.getReserveTotalRecord();
	}

	@Override
	public List<ReserveViewVO> getSearchReserveViewList(String search_id) {
		return reserveDAO.getSearchReserveViewList(search_id);
	}

	@Override
	public int updateReserveStatus(Map<String, Object> allData) {
		return reserveDAO.updateReserveStatus(allData);
	}
	
	@Override
	public int deleteReserve(int re_code) {
		return reserveDAO.deleteResreve(re_code);
	}
	@Override
	public ReserveVO getReserveVO(int re_code) {
		return reserveDAO.getReserveVO(re_code);
	}
}
