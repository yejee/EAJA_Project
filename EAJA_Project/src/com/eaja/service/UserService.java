package com.eaja.service;

import java.util.List;

import com.eaja.vo.BoardVO;
import com.eaja.vo.ScheduleVO;
import com.eaja.vo.MemberVO;
import com.eaja.vo.MyCompanyVO;

public interface UserService {
	int insertMember(MemberVO member); // 회원가입
	MemberVO selectMember(int mseq); // 회원정보 상세보기
	int updateMember(MemberVO member); // 회원정보 수정
	int deleteMember(MemberVO member); // 회원정보 삭제(탈퇴)
}
