package com.nuri.collection.ex2;

import java.util.ArrayList;

public class StudentView {

	// 매서드 명 view
	// 학생 한명 출력
	public void view(Student student) {
		System.out.println("이름 : " + student.getName());
		System.out.println("번호 : " + student.getNum());
		System.out.println("국어점수 : " + student.getKor());
		System.out.println("영어점수 : " + student.getEng());
		System.out.println("수학점수 : " + student.getMath());
		System.out.println("총점 : " + student.getSum());
		System.out.println("평균 : " + student.getAvg());
	}
	
	
	// 매서드 명 view
	// 학생들의 정보를 출력

	public void view(ArrayList<Student> students) {
		for(int i =0; i<students.size();i++) {
			System.out.println("이름 : " + students.get(i).getName());
			System.out.println("국어점수 : " + students.get(i).getKor());
			System.out.println("영어점수 : " + students.get(i).getEng());
			System.out.println("수학점수 : " + students.get(i).getMath());
			System.out.println("총점 : " + students.get(i).getSum());
			System.out.println("평균 : " + students.get(i).getAvg());
		}
	}

}
