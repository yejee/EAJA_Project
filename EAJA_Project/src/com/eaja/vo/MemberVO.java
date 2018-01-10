package com.eaja.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class MemberVO implements Serializable{
	private int no;
	private String email;
	private String pw;
	private String name;
	private String gender;
	private String birthday;
	private String region;
	private String major;
	private List<BoardVO> boardlist;
	private List<ReplyVO> replylist;
	private List<MyCompanyVO> companylist;
	private ScheduleVO mycal;
}
