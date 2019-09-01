package com.jsl.team.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsl.team.dto.PaymentVO;
import com.jsl.team.dto.ReserveVO;
import com.jsl.team.dto.ReserveViewVO;
import com.jsl.team.paging.CriteriaVO;

@Repository(value = "reserveDAO")
public class ReserveDAO {
	@Autowired
	private SqlSessionTemplate mybatis;

	public List<ReserveVO> getReserveAllList() {
		return mybatis.selectList("ReserveDAO.getReserveAllList");
	}

	public List<ReserveViewVO> getReserveViewList(CriteriaVO cri) { // 예약 리스트 가져와서 관리자 페이지에 뿌려주기위해 페이징해서
		return mybatis.selectList("ReserveDAO.getReserveViewList", cri);
	}

	public int getReserveTotalRecord() { // 총 예약 갯수 구하기
		return mybatis.selectOne("ReserveDAO.getReserveTotalRecord");
	}

	public List<ReserveViewVO> getSearchReserveViewList(String search_id) { // 고객 아이디로 검색한 예약리스트를 가져와 관리자페이지에 뿌려주기
		return mybatis.selectList("ReserveDAO.getSearchReserveViewList", search_id);
	}

	public int updateReserveStatus(Map<String, Object> allData) {
		return mybatis.update("ReserveDAO.updateReserveStatus", allData);
	}

	public int deleteResreve(int re_code) {
		return mybatis.delete("ReserveDAO.deleteReserve", re_code);
	}

	public List<ReserveVO> getRoomReservedList(int r_code) { // 해당방 예약리스트 가죠오기
		return mybatis.selectList("ReserveDAO.getRoomReservedList", r_code);
	}
	public ReserveVO getReserveVO(int re_code) {
		return mybatis.selectOne("ReserveDAO.getReserveVO", re_code);
	}
	public void insertReserve(ReserveVO vo) {
		mybatis.insert("ReserveDAO.insertReserve", vo);
	}
	public void insertPayment(PaymentVO vo) {
		mybatis.insert("PaymentDAO.insertPayment", vo);
	}
}
