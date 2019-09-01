package com.jsl.team.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsl.team.dto.MemberVO;
import com.jsl.team.dto.ReserveInfoVO;
import com.jsl.team.paging.CriteriaVO;

@Repository(value = "memberDAO")
public class MemberDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// 일반
	public void insertMember(MemberVO vo) {
		mybatis.insert("MemberDAO.insertMember", vo);
	}
	
	public MemberVO idCheck(String mber_id) {
		return mybatis.selectOne("MemberDAO.idCheck", mber_id);
	}
	public MemberVO login(Map<String,Object>map) {
		return mybatis.selectOne("MemberDAO.login", map);
	}
	public void updateMembership(ReserveInfoVO vo) {
		mybatis.update("MemberDAO.updateMembership", vo);
	}
	
	// 관리자
	public List<MemberVO>getCurPageMemberList(CriteriaVO cri){
		return mybatis.selectList("MemberDAO.getCurPageMemberList",cri);
	}
	
	public MemberVO getSearchMember(String mber_id) { // detail 정확한 아이디 검색
		return mybatis.selectOne("MemberDAO.getSearchMember", mber_id);
	}
	
	public List<MemberVO> getSearchMemberList(String search_id){
		return mybatis.selectList("MemberDAO.getSearchMemberList",search_id);
	}
	
	public int getTotalRecord() {
		return mybatis.selectOne("MemberDAO.getTotalRecord");
	}
	
	public void udpateMember(MemberVO vo) {
		mybatis.update("MemberDAO.updateMember", vo);
	}
}
