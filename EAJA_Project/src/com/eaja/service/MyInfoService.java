package com.eaja.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.eaja.vo.AnnualCompanyInfoVO;
import com.eaja.vo.CompanyVO;
import com.eaja.vo.CustomInfoVO;
import com.eaja.vo.MemberVO;
import com.eaja.vo.MyCompanyVO;
import com.eaja.vo.NewsVO;
import com.eaja.vo.RecruitVO;

public interface MyInfoService {
	List<NewsVO> selectNewsList(HttpSession session); // 뉴스정보 리스트
	int insertNews(NewsVO news);// 뉴스정보 입력
	int updateNews(NewsVO news);// 뉴스정보 수정
	int deleteNews(NewsVO news);// 뉴스정보 삭제
	List<RecruitVO> listRecruitAPI(CompanyVO com);// 채용 공고 리스트
	List<CustomInfoVO> listCustomInfo();// User Custom 정보 리스트
	int insertCustomInfo(CustomInfoVO custom);// User Custom 정보 입력
	int updateCustomInfo(CustomInfoVO custom); // User Custom 정보 수정
	int deleteCustomInfo(CustomInfoVO custom);//User Custom 정보 삭제
	List<MyCompanyVO> listMyCompany(MemberVO member); // MY기업리스트
}