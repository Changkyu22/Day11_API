package com.nuri.collection.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductMain {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		Computer computer = new Computer();
		NoteBook noteBook = new NoteBook();
		
		ArrayList<? extends Computer> ar = new ArrayList<Computer>();
		// computer와 computer를 상속받은 타입을 모두 모으겠다.
		
		// ar.add(computer);
		
		// Generic
		//ArrayList<Product> ar = new ArrayList<Product>();
		//ar.add(tv);
		//ar.add(computer);
		
		//ArrayList<Product> ar2 = new ArrayList<Product>();
		
		// 가능 : ArrayList<ArrayList<Product>> ar3 = new ArrayList<ArrayList<Product>>();
		
		// 가능 : HashMap<String, ArrayList<Product>> map = new HashMap<String, ArrayList<Product>>();
		
		
		
	}

}
