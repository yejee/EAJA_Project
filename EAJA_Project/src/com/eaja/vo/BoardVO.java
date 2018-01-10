package com.eaja.vo;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class BoardVO {
	private int seq;
	private String title;
	private String content;
	private String writer;
	private Date wdate;
	private int view_cnt;
	private List<ReplyVO> replylist;
	private ImageFileVO image;
}
