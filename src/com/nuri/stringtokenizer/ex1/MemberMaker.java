package com.nuri.stringtokenizer.ex1;

import java.util.StringTokenizer;

public class MemberMaker {

	private String memberInfo;

	public MemberMaker() {
		this.memberInfo="iu-iu-27-choa-choa-28-suji-suji-30";
	}


	public void makerMember() {
		// memberInfo에 있는 내용을 파싱해서 
		// Member 객체를 생성해서 모든 정보를 출력

		StringTokenizer st = new StringTokenizer(this.memberInfo, "-");
		
		Member [] members = new Member[3];
		int index = 0;
		
		while(st.hasMoreTokens()) {
			Member member = new Member();
			member.setId(st.nextToken());
			member.setName(st.nextToken());
			member.setAge(Integer.parseInt(st.nextToken()));
			members[index] = member;
			index++;
			
		}
		
		for(int i=0; i<members.length;i++) {
			System.out.println("ID : " + members[i].getId());
			System.out.println("NAME : " + members[i].getName());
			System.out.println("AGE : " + members[i].getAge());
		}
		
		
	}

}
		//String [] info = memberInfo.split("-");
		
		//for(int i=0; info.length;i++) {
		//	Member member = new Membwe();
		//	member.setId(info[i]);
		//	member.setName(info[i++]);
		//}


/*
StringTokenizer st = new StringTokenizer(memberInfo, "-");

while(st.hasMoreTokens()) {
	member.setId(st.nextToken());
	member.setName(st.nextToken());
	// member.setAge(st.ne));

}
System.out.println(this.memberInfo);

*/



