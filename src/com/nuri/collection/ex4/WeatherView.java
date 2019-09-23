package com.nuri.collection.ex4;

import java.util.HashMap;
import java.util.Iterator;

public class WeatherView {
	
	// 매서드 명 view
	// 날씨 전체 정보 출력
	
	public void view(String str) {
		System.out.println(str);
	}
	
	
	public void view(HashMap<String, Weather> map) {
		// 1단계 - 키들을 모을 Iterator 생성
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String k = it.next();
			Weather weather = map.get(k);
			
			System.out.println("City : " + weather.getCity());
			System.out.println("Gion : " + weather.getGion());
			System.out.println("Hum : " + weather.getHumidity());
			System.out.println("Status : " + weather.getStatus());
		}
	}
	
	public void view(Weather weather) {
		System.out.println("City : " + weather.getCity());
		System.out.println("Gion : " + weather.getGion());
		System.out.println("Hum : " + weather.getHumidity());
		System.out.println("Status : " + weather.getStatus());
		
		
	}
	// 매서드 명 view
	// 날씨 하나 정보 출력

}
