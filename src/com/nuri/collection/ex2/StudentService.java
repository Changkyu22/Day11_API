package com.nuri.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
	private Scanner sc;
	
	public StudentService() {
		sc = new Scanner(System.in);
	}
	//메서드명 studentSearch
	//학생의이름을 입력 받아서. 이름이 같은 학생을 리턴 
	public Student studentSearch(ArrayList<Student> students) {
		System.out.println("이름 입력");
		String name = sc.next();
		Student student=null;
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getName().equals(name)) {
				student=students.get(i);
				break;
			}
		}
		
		return student;
		
	}
	
	//메서드명은 studentInput
	//학생의 정보 입력
	public void studentInput(ArrayList<Student> students) {
		sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("이름 입력");
		student.setName(sc.next());
		System.out.println("번호 입력");
		student.setNum(sc.nextInt());
		System.out.println("국어 입력");
		student.setKor(sc.nextInt());
		System.out.println("영어 입력");
		student.setEng(sc.nextInt());
		System.out.println("수학 입력");
		student.setMath(sc.nextInt());
		student.setSum(student.getKor()+student.getEng()+student.getMath());
		student.setAvg(student.getSum()/3.0);
		students.add(student);
	}

}