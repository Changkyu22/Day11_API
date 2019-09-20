package com.nuri.stringtokenizer;

import java.util.ArrayList;

import java.util.StringTokenizer;


public class Test1 {
	
	public static void main(String[] args) {
		// 파싱
		String str = "iu,27,suzi,24,choa,30,,hani,25";
	
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken(); // 문자열 파싱하는 함수
			String age = st.nextToken();
			System.out.println(s);
			//System.out.println(age);
		}
		
		
		
	}

}
