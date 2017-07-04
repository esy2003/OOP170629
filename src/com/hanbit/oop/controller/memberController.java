package com.hanbit.oop.controller;

import com.hanbit.oop.domain.memberBean;
import com.hanbit.oop.service.MemberService;
import com.hanbit.oop.serviceImpl.memberServiceImpl;

import javax.swing.*;

public class memberController {
	
	public static void main(String[] args) {
		MemberService memSer = new memberServiceImpl();
		memberBean member = new memberBean();
		
		while(true) {
			//System.out.println("0. 종료  1. 회원가입 2. 로그인");
			//String flag = s.next();
			switch (JOptionPane.showInputDialog("0. 종료  1. 회원가입 2. 로그인")) {
			case "0" :
				System.out.println("시스템종료");
				return;
			case "1" :
				member.setName(JOptionPane.showInputDialog("이름"));
				member.setUserId(JOptionPane.showInputDialog("회원가입 아이디"));
				member.setUserPw(JOptionPane.showInputDialog("회원가입 비밀번호"));
				member.setSSN(JOptionPane.showInputDialog("주민번호"));
				JOptionPane.showMessageDialog(null, memSer.join(member));
				break;
			case "2" :
				member = new memberBean();
				member.setUserId(JOptionPane.showInputDialog("로그인 아이디"));;
				member.setUserPw(JOptionPane.showInputDialog("로그인 비밀번호"));
				
				JOptionPane.showMessageDialog(null, memSer.Login(member));
				break;
			default:
				break;
			}
		}
	}
}
