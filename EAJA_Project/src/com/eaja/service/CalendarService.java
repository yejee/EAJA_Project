package com.eaja.service;

import java.util.List;

import com.eaja.vo.ScheduleVO;

public interface CalendarService {
	List<ScheduleVO> ListAllCalendar(); // 일정 전체보기
	int insertCalendar(ScheduleVO cal); // 일정 등록
	int updateCalendar(ScheduleVO cal); // 일정 수정
	int deleteCalendar(int cal_seq); // 일정 삭제
}
