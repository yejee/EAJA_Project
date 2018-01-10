package com.eaja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.eaja.vo.BoardVO;

@Controller
public class BoardController{
	// 글 목록보기 + Paging
	public ModelAndView listBoard() {
		// 메롱 이건 테스트야
		return null;
	}
	// 검색조건으로 글 목록 보기
	public ModelAndView searchListBoard() {
		return null;
		
	}
 	// 글 상세보기 + 조회수UP(biz)
	public ModelAndView selectBoard() {
		return null;
	}
	// 좋아요UP
	public ModelAndView insertThumbCountUp() {
		return null;
	}
	// 글 작성하기
	public ModelAndView insertBoard(@ModelAttribute BoardVO board) {
		return null;
	}
	// 글 수정하기
	public ModelAndView updateBoard() {
		return null;
		
	}
	// 글 삭제하기
	public ModelAndView deleteBoard() {
		return null;
	}
	// File UP
	// File Download
}
