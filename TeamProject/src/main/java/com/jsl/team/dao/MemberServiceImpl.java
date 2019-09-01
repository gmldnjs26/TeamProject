package com.jsl.team.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsl.team.dto.MemberVO;
import com.jsl.team.dto.ReserveInfoVO;
import com.jsl.team.paging.CriteriaVO;
import com.jsl.team.service.MemberService;


@Service(value="memberService")
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDAO memberDAO;
	
	// 일반 
	@Override
	public void insertMember(MemberVO vo) {
		memberDAO.insertMember(vo);
	}
	@Override
	public MemberVO idCheck(String mber_id) {
		return memberDAO.idCheck(mber_id);
	}
	@Override
	public MemberVO login(Map<String, Object> map) {
		return memberDAO.login(map);
	}
	@Override
	public void updateMembership(ReserveInfoVO vo) {
		memberDAO.updateMembership(vo);
	}
	
	// 관리자
	@Override
	public List<MemberVO> getCurPageMemberList(CriteriaVO cri) {
		return memberDAO.getCurPageMemberList(cri);
	}
	
	@Override
	public int getTotalRecord() {
		return memberDAO.getTotalRecord();
	}
	
	@Override
	public MemberVO getSearchMember(String mber_id) {
		return memberDAO.getSearchMember(mber_id);
	}
	
	@Override
	public void updateMember(MemberVO vo) {		
		memberDAO.udpateMember(vo);
	}
	
	@Override
	public List<MemberVO> getSearchMemberList(String search_id) {
		return memberDAO.getSearchMemberList(search_id);
	}
}
