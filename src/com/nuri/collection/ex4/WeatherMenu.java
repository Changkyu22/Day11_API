package com.nuri.collection.ex4;

import java.util.HashMap;

public class WeatherMenu {
	
	private WeatherService weatherService;
	private WeatherView weatherView;
	
	public WeatherMenu() {
		weatherService = new WeatherService();
		weatherView = new WeatherView();
	}
	// 매서드 명 start
	// 1. 날씨정보 초기화 - init 실행(WeatheService)
	// 2. 날씨정보 추가 - addweather
	// 3. 전체날씨정보 - view
	// 4. 지역날씨검색 - findWeather, view 실행
	// 5. 프로그램종료

	public void start() {
		HashMap<String, Weather> map = weatherService.init();
		// weatherView.view(map);
		
		Weather weather = weatherService.findWeather(map);
		if(weather != null) {
			weatherView.view(weather);	
		}else {
			weatherView.view("해당 지역의 정보가 없습니다.");
		}
	}
}
