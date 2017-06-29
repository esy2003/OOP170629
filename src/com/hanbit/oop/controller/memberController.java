package com.hanbit.oop.controller;

import java.util.Scanner;
import com.hanbit.service.memberService;

public class memberController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		memberService memSer = new memberService();
		
		while(true) {
			System.out.println("0. 종료  1. 회원가입 2. 로그인");
			switch (s.next()) {
			case "0" :
				System.out.println("시스템종료");
				return;
			case "1" :
				System.out.println("이름");
				String name = s.next();
				memSer.setName(name);
				System.out.println("아이디");
				String userId = s.next();
				memSer.setUserId(userId);
				System.out.println("비밀번호");
				String userPw = s.next();
				memSer.setUserPw(userPw);
				System.out.println("주민번호");
				String ssn = s.next();
				memSer.setSSN(ssn);
				break;
			case "2" :
				System.out.println("ID 입력하세요");
				String loginId = s.next();
				memSer.setLoginId(loginId);
				System.out.println("PW 입력하세요");
				String loginPw = s.next();
				memSer.setLoginPw(loginPw);
				System.out.println(memSer);
				break;
				default: break;
			}

		}
	}
}
