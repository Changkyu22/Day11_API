package com.nuri.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
	private ArrayList<Student> students;
	private StudentService ss;
	private StudentView sv;
	private Scanner sc;
	
	public StudentMenu() {
		students = new ArrayList<Student>();
		ss = new StudentService();
		sv = new StudentView();
		sc = new Scanner(System.in);
	}
	
	public void start() {
		
		boolean check=true;
		
		while(check) {
			System.out.println("1. 학생정보등록");
			System.out.println("2. 학생전체정보");
			System.out.println("3. 학생정보조회");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 프로그램종료");
			int select = sc.nextInt();
			Student student = null;
			
			switch (select){
			case 1:
				ss.studentInput(students);
				break;
			case 2:
				sv.view(students);
				break;
			case 3:
				student = ss.studentSearch(students);
				sv.view(student);
				break;
			case 4:
				student = ss.studentSearch(students);
				ss.studentDelete(students, student);
				break;
			default:
				check= !check;
				break;
			}
		}
		
		
		//1. 학생정보등록
		//2. 학생전체정보
		//3. 학생정보조회-이름으로 검색
		//4. 학생정보삭제
		//5. 프로그램종료
		
	}

}