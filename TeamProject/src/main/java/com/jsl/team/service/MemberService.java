package com.jsl.team.service;

import java.util.List;
import java.util.Map;

import com.jsl.team.dto.MemberVO;
import com.jsl.team.dto.ReserveInfoVO;
import com.jsl.team.paging.CriteriaVO;

public interface MemberService {
	// 일반
	public void insertMember(MemberVO vo); // 회원가입

	public MemberVO idCheck(String mber_id); // 아이디 체크

	public MemberVO login(Map<String, Object> map); // 로그인
	
	public void updateMembership(ReserveInfoVO vo); // 예약시 마일리지, 예약횟수, 예약금액 update 하기

	// 관리자
	public List<MemberVO> getCurPageMemberList(CriteriaVO cri); // 현재 페이지 멤버 리스트 가져오기

	public MemberVO getSearchMember(String mber_id); // 검색한 아이디 멤버 가져오기

	public int getTotalRecord(); // 멤버 레코드 총갯수 가져오기

	public void updateMember(MemberVO vo); // 멤버 관리자가 정보 수정
	
	public List<MemberVO>getSearchMemberList(String search_id);
}
