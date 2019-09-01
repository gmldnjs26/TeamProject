package com.jsl.team.service;

import java.util.List;
import java.util.Map;

import com.jsl.team.dto.QnaVO;
import com.jsl.team.paging.CriteriaVO;

public interface QnaService {
	// 일반 부분
	public List<QnaVO>getLoginUserQnaList(String mber_id); // 로그인 사용자 정보 가져오기
	
	public void insertQna(QnaVO vo);
	
	public void deleteQna(int q_code);
	
	
	// 관리자 부분
	public List<QnaVO>getQnaList(CriteriaVO cri); // 모든 질문 리스트 가져오기
	
	public QnaVO getQnaDetail(int q_code); // 질문 수정 위해 한 질문 가져오기 또는 질문 보기ㅣ
	
	public List<QnaVO>getSearchQnaList(String q_title);
	
	public int getQnaTotalRecord();
	
	public void repWrite(QnaVO vo);
	
}
