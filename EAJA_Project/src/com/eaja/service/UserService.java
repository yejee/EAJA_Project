package com.eaja.service;

import java.util.List;

import com.eaja.vo.BoardVO;
import com.eaja.vo.CalendarVO;
import com.eaja.vo.MemberVO;
import com.eaja.vo.MyCompanyVO;

public interface UserService {
	int insertMember(MemberVO member); // 회원가입
	void moveMyPage(); // MY페이지로 이동
	MemberVO selectMember(int mseq); // 회원정보 상세보기
	int updateMember(MemberVO member); // 회원정보 수정
	int deleteMember(MemberVO member); // 회원정보 삭제(탈퇴)
	List<BoardVO> MyBoardList(MemberVO member); // MY게시판 글 목록
	CalendarVO MyCalendar(MemberVO member); // MY캘린더
	List<MyCompanyVO> MyCompanyList(MemberVO member); // MY기업리스트
}
