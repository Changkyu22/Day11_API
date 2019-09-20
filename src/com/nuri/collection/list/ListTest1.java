package com.nuri.collection.list;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {

		// 1,2,3

		ArrayList ar = new ArrayList();

		ar.add(1);
		ar.add('c');
		ar.add(3);
		ar.add("four");
		
		ar.add(1, "two");
		ar.set(1, 10000);
		
		ar.remove(1);
		// ar.clear();
		
		// int num = ar.get(0); // error
		int num=10;
		Integer n = num; // auto boxing
		ar.add(n); // not error that reason why "auto boxed"
		num = (int)ar.get(0);
		String name = (String)ar.get(3);

		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}
