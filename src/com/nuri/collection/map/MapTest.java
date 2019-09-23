package com.nuri.collection.map;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {
	
	public static void main(String[] args) {
		// map
		// Key : String
		// Value : Object
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("nuri", 1);
		map.put("nul", 2);
		map.put("nuring", 1);
		
		System.out.println(map.get("nuri"));
		System.out.println(map.get("nul"));
		System.out.println(map.get("nuring"));
		
		map.put("nuri", 200); // 값의 중복은 허용하지만, 키 값의 중복은 허용 X, 결과값은 수정됨.
		System.out.println(map.get("nuri"));
		
		// 반복문을 돌리려면,
		
		// 1. Key
		// 	Iterator(반복자) - 또 다른 Collection의 종류 => Key들을 뽑아오는 반복함수
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(map.get(key));
			
			
		}
		
		
		
	}

}
