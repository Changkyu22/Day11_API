package com.nuri.calendar;

import java.util.Calendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); // = new GregorianCalendar();
		// 현재 시간
		
		int hour = cal.get(Calendar.HOUR); // 12시간 기준
		hour = cal.get(Calendar.HOUR_OF_DAY); // 24시간 기준
		System.out.println(hour);
		
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);
		
		int sec = cal.get(Calendar.SECOND);
		System.out.println(sec);
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int mon = cal.get(Calendar.MONTH); // 1월 0. 2월 1 ... 12월 11
		System.out.println(mon+1);
		
		int date = cal.get(Calendar.DATE);
		System.out.println(date);
		
		int d = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(d);
		
		
		
		
		
	}

}
