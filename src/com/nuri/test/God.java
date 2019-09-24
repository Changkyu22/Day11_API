package com.nuri.test;

public class God {
	
	private String name;
	private static God god;
	
	public God() {
		// TODO Auto-generated constructor stub
	}
	
	// 싱글톤(디자인패턴)
	public static God makeGod() {
		if(God.god != null) {
			return God.god;
		}else {
			return new God();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
