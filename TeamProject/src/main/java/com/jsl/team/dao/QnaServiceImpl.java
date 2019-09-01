package com.jsl.team.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsl.team.dto.QnaVO;
import com.jsl.team.paging.CriteriaVO;
import com.jsl.team.service.QnaService;

@Service(value="qnaService")
public class QnaServiceImpl implements QnaService{
	@Autowired
	private QnaDAO qnaDAO;
	// 일반 부분
	@Override
	public List<QnaVO> getLoginUserQnaList(String mber_id) {
		return qnaDAO.getLoginMemberQnaList(mber_id);
	}
	@Override
	public void deleteQna(int q_code) {
		qnaDAO.deleteQna(q_code);
	}
	@Override
	public void insertQna(QnaVO vo) {
		qnaDAO.insertQna(vo);
	}
	
	
	// 관리자 부분
	@Override
	public List<QnaVO> getQnaList(CriteriaVO cri) {
		return qnaDAO.getQnaList(cri);
	}
	
	@Override
	public QnaVO getQnaDetail(int q_code) {
		return qnaDAO.getQnaDetail(q_code);
	}
	
	@Override
	public List<QnaVO> getSearchQnaList(String q_title) {
		return qnaDAO.getSearchQnaList(q_title);
	}
	
	@Override
	public int getQnaTotalRecord() {
		return qnaDAO.getQnaTotalRecord();
	}
	@Override
	public void repWrite(QnaVO vo) {
		qnaDAO.repWrite(vo);
	}

}
