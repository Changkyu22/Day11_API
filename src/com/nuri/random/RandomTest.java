package com.nuri.random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int num = random.nextInt();
		
		num =random.nextInt(20);
		
		System.out.println(num);
	}
}
