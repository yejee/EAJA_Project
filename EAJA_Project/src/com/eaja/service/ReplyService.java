package com.eaja.service;

import java.util.List;

import com.eaja.vo.ReplyVO;

public interface ReplyService {
	int insertReply(ReplyVO reply); // 댓글 작성하기
	List<ReplyVO> listAllReply(); // 댓글 목록보기 + Paging
	int updateReply(ReplyVO reply); //댓글 수정하기 - ID검증
	int deleteReply(ReplyVO reply); //댓글 삭제하기 - ID검증
}
