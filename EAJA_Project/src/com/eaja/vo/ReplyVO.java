package com.eaja.vo;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyVO {
	private int rseq;
	private int bseq;
	private String content;
	private String writer;
	private Date date;
}
