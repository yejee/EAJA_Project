package com.eaja.service;

import java.util.List;

import com.eaja.vo.BoardVO;

public interface BoardService {
	int insertBoard(BoardVO board); // 글 작성하기
	List<BoardVO> listAllBoard(); // 글 목록보기 + Paging
	BoardVO selectBoard(int bseq); //글 상세보기
	List<BoardVO> searchBoard(String title, String content, String writer); // 조건으로 글 검색
	int updateBoard(BoardVO board); // 글 수정하기
	int deleteBoard(BoardVO board); // 글 삭제하기
	int insertViewCountUp(int bseq); // 조회수UP
	int insertThumbCountUp(int bseq); // 좋아요UP
	//File Upload
	//File Download
}
