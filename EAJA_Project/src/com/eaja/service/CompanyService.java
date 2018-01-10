package com.eaja.service;

import java.util.List;

import com.eaja.vo.AnnualCompanyInfoVO;
import com.eaja.vo.CompanyVO;
import com.eaja.vo.NewsVO;
import com.eaja.vo.RecruitVO;

public interface CompanyService {
	//CompanyController
	CompanyVO companyInfo(CompanyVO com); // 기업 개요
	AnnualCompanyInfoVO companyAnnualInfo(CompanyVO com); // 연간 정보
	List<NewsVO> newsAPI(CompanyVO com); // 네이버 뉴스 API
	List<RecruitVO> recruitAPI(CompanyVO com); // 사람인 채용공고 API
	String downloadPaper(CompanyVO com, String title); // 보고서 다운로드
	int favCompany(CompanyVO com); // 기업 즐겨찾기
	
	//CompanySearchController
	CompanyVO searchCompany(String title); // 기업명으로 기업 검색
	List<CompanyVO> listFilterCompany(); // filter적용한 기업 리스트
}