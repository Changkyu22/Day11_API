package com.nuri.collection.ex4;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class WeatherService {

	private StringBuffer sb;
	private Scanner sc;

	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-");
		sb.append("Daejoen-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");
		sc = new Scanner(System.in);
		System.out.println(sb);
	}
	// 날씨정보를 파싱해서 날씨 객체 정보 만들기
	// 매서드명 init
	public HashMap<String, Weather> init() {
		StringTokenizer st= new StringTokenizer(sb.toString(), "-");

		HashMap<String, Weather> map = new HashMap<String, Weather>();

		while(st.hasMoreTokens()) {
			Weather weather = new Weather();
			weather.setCity(st.nextToken());
			weather.setGion(Double.parseDouble(st.nextToken()));
			weather.setHumidity(Integer.parseInt(st.nextToken()));
			weather.setStatus(st.nextToken());

			map.put(weather.getCity(), weather);
			//map.put(weather.getGion(), weather);
			//map.put(weather.getHumidity(), weather);
			map.put(weather.getStatus(), weather);			

		}

		return map;
	}
	// HashMap에 추가
	// Key는 도시명, Value는 weather
	// HashMap return

	public Weather findWeather(HashMap<String, Weather> map) {
		// 도시명을 입력받아서 해당 Weather 검색
		// weather를 return

		System.out.println("도시명을 입력하세요.");
		String city = sc.next();
		Weather weather = map.get(city);

		return weather;
	}

	// 도시명 입력바아서 해당 정보(weather)를 삭제
	// 삭제되었으면 "삭제성공", 안되면  "삭제실패".
	public Weather deleteWeather(HashMap<String, Weather> map) {
		System.out.println("삭제할 도시명을 입력하세요.");
		String city = sc.next();	
		Weather weather = map.remove(city);

		return weather;
	}

	public void addWeather(HashMap<String, Weather> map) {
		System.out.println("추가할 도시명을 입력하세요.");
		Weather weather = new Weather();
		System.out.println("도시명을 입력하세요");
		weather.setCity(sc.next());
		System.out.println("기온을 입력하세요");
		weather.setGion(sc.nextInt());
		System.out.println("습도를 입력하세요");
		weather.setHumidity(sc.nextInt());
		System.out.println("상태를 입력하세요");
		weather.setStatus(sc.next());
		
		
		
	}
	// 매서드 명 addWeather
	// 날씨 정보를 입력받아서 추가 (지역, 기온, 습도, 상태)





}


