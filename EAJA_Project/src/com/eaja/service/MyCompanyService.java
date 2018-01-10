package com.eaja.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.eaja.vo.AnnualCompanyInfoVO;
import com.eaja.vo.CompanyVO;
import com.eaja.vo.CustomInfoVO;
import com.eaja.vo.NewsVO;
import com.eaja.vo.RecruitVO;

public interface MyCompanyService {
	void moveMyCompanyPage(HttpSession session);// 마이기업페이지로 이동하기
	CompanyVO companyInfo(CompanyVO com); // 기업 개요
	AnnualCompanyInfoVO companyAnnualInfo(CompanyVO com); // 연간 정보 
	List<NewsVO> selectNewsList(HttpSession session); // 유저가 가져왔던 뉴스정보 리스트
	int insertNews(NewsVO news);// 새로운 뉴스정보 입력
	List<RecruitVO> recruitAPI(CompanyVO com);// 채용 공고 리스트
	List<CustomInfoVO> customInfoList();// User Custom 정보 리스트
	int insertCustomInfo(CustomInfoVO custom);// User Custom 정보 입력
}
