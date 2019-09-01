package com.jsl.team.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsl.team.dto.QnaVO;
import com.jsl.team.paging.CriteriaVO;

@Repository(value="qnaDAO")
public class QnaDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<QnaVO>getQnaList(CriteriaVO cri){
		return mybatis.selectList("QnaDAO.getQnaList",cri);
	}
	
	public List<QnaVO>getLoginMemberQnaList(String mber_id){
		return mybatis.selectList("QnaDAO.getLoginMemberQnaList", mber_id);
	}
	public List<QnaVO>getSearchQnaList(String q_title){
		return mybatis.selectList("QnaDAO.getSearchQnaList", q_title);
	}	
	public QnaVO getQnaDetail(int q_code) {
		return mybatis.selectOne("QnaDAO.getQnaDetail",q_code);
	}
	public int getQnaTotalRecord() {
		return mybatis.selectOne("QnaDAO.getQnaTotalRecord");
	}
	public void insertQna(QnaVO vo) {
		mybatis.insert("QnaDAO.insertQna", vo);
	}
	public void deleteQna(int q_code) {
		mybatis.delete("QnaDAO.deleteQna", q_code);
	}
	public void repWrite(QnaVO vo) {
		mybatis.update("QnaDAO.repWrite", vo);
	}
}
