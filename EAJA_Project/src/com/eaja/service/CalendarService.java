package com.eaja.service;

import java.util.List;

import com.eaja.vo.CalendarVO;

public interface CalendarService {
	List<CalendarVO> ListAllCalendar(); // 일정 전체보기
	int insertCalendar(CalendarVO cal); // 일정 등록
	int updateCalendar(CalendarVO cal); // 일정 수정
	int deleteCalendar(int cal_seq); // 일정 삭제
}
