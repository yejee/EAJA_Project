package com.eaja.vo;

import java.util.Date;

import lombok.Data;

@Data
public class GroupVO {
	private int no;
	private String name; // Group Name
	private String owner; // 소유주
	private String president; // 회장
	private Date edate;
	private String main_comp;
	private String main_biz;
	private String group_cate; // 그룹 구분
	private String address;
}
