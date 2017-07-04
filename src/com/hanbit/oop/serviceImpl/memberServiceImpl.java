package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.memberBean;
import com.hanbit.oop.service.MemberService;

public class memberServiceImpl implements MemberService {
		memberBean session;
		public memberServiceImpl() {
			session = new memberBean();
		}

	@Override
	public String getGender(memberBean member) {
		String gender = "";
		char ch = member.getSSN().charAt(7);
		
		switch (ch) {
			case '1' : case '3' : 
				gender = "남자";
				break;
			case '2' : case '4' :
				gender = "여자";
				break;
			case '5' : 
				gender = "외국인 남자";
				break;
			case '6' :
				gender = "외국인 여자";
				break;
			default :
				gender = "잘못된 값";
				break;
		}
		return gender;
	}

	@Override
	public String getAge(memberBean member) {
		int age = 0;
		String sYear =member.getSSN().substring(0,2);
		if(Integer.parseInt(sYear)>=17){
			age = 2017 - Integer.parseInt(sYear) - 1900 + 1;
		}
		else {
			age = 2017 - Integer.parseInt(sYear) - 2000 + 1;
		}
		return String.valueOf(age);
	}

	@Override
	public String join(memberBean member) {
		session = member;
		//밑의 4줄이 위의 한줄과 같음
		
		/*session.setName(member.getName());
		session.setUserId(member.getUserId());
		session.setUserPw(member.getUserPw());
		session.setSSN(member.getSSN());*/
		
		//session 에 회원가입시 입력한 정보를 저장하는 소스
		
		return "환영합니다 " + session.getName() + "님";
	}

	@Override
	public String Login(memberBean member) {
		return (session.getUserId().equals(member.getUserId()) && session.getUserPw().equals(member.getUserPw())) ?
				"로그인 성공" + getAge(session)+ "살" + getGender(session) : "로그인 실패";
	}
	
}
