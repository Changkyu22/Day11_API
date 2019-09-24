package com.nuri.calendar;

import java.util.Calendar;

public class CalendarTest3 {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		// 택배 배달,,
		// 현재의 년, 월, 일
		
		int year = calendar.get(Calendar.YEAR);
		int mon = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		System.out.println(year + "년" + mon + "월" + date + "일");
		
		// calendar.set(Calendar.DATE, date+2);	
		// calendar.roll(Calendar.DATE, 10);
		calendar.add(Calendar.DATE, 10);
		year = calendar.get(Calendar.YEAR);
		mon = calendar.get(Calendar.MONTH)+1;
		date = calendar.get(Calendar.DATE);
		System.out.println(year + "년" + mon + "월" + date + "일");
		
		
		// 2일 후 년, 월, 일
		
		
		
		
	}

}
