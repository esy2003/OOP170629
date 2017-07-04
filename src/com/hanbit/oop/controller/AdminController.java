package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.memberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AdminController {
	public static void main(String[] args) {

		
		String sCount = JOptionPane.showInputDialog("총 회원수를 입력해주세요");
		int count = Integer.parseInt(sCount);
		AdminService service = new AdminServiceImpl(count);
		memberBean member = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0. 종료  1. 회원추가 2. 회원수 3. 회원목록 4. findById 5. findByName 6. passUpdate")) {
			case "0":
				JOptionPane.showMessageDialog(null, "stop");
				return;
			case "1":
			String[] arr = JOptionPane.showInputDialog("name/id/pw/ssn").split("/");
				member = new memberBean();
				member.setName(arr[0]);
				member.setUserId(arr[1]);
				member.setUserPw(arr[2]);
				member.setSSN(arr[3]);
				service.addMember(member);
				JOptionPane.showMessageDialog(null, "회원가입성공");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.countMembers() + " 명");	
				break;
			case "3":
				memberBean[] lists = service.getMembers();
	            String[] resultList = new String[lists.length];
	            
	            for(int i=0; i<lists.length; i++){
	               resultList[i] = "name : "+lists[i].getName() + " Id : "+lists[i].getUserId() + " SSN : "+lists[i].getSSN() + " Pw : " +lists[i].getUserPw();
	            }
	            JOptionPane.showMessageDialog(null, resultList);
	            break;
			case "4":
				//service.findById(JOptionPane.showInputDialog("조회할 아이디 입력"));
				
				// JOptionPane.showMessageDialog 안에는 toString() 이 생략이 가능하다(자주 쓰다보니 자동추가됨)
				JOptionPane.showMessageDialog(null, service.findById(JOptionPane.showInputDialog("조회할 아이디 입력")));
				break;
			case "5":
				memberBean[] membersName = service.findByName(JOptionPane.showInputDialog("찾고자 하는 아이디의 이름을 입력해주세요"));
				String result = "";
				if (membersName.length ==0) {
					result = "조회 가능한 이름이 없습니다";
				}
				else {
					for (int i=0;i<membersName.length;i++){
						result += membersName[i] + "\n";
					}
				}
				JOptionPane.showMessageDialog(null, "리스트 : " + result);
				break;
			case "6":
				memberBean memberList = new memberBean();
				memberList.setUserId(JOptionPane.showInputDialog("아이디를 입력"));
				memberList.setUserPw(JOptionPane.showInputDialog("비밀번호를 입력"));
				service.updatePass(memberList);
/*				memberBean[] userList = service.getMembers();
				String[] updateIdPw = JOptionPane.showInputDialog("id/pw").split("/");
				for (int i=0;i<userList.length;i++) {
					if (userList[i].equals(updateIdPw)) {
						member.setUserPw(JOptionPane.showInputDialog("새로운 비밀번호를 입력하세요"));
						JOptionPane.showMessageDialog(null, "비밀번호 변경 성공");
					}
					else {
						JOptionPane.showMessageDialog(null, "일치하는 아이디가 없습니다");
					}
				}
*/				break;
			}
		}
	}
}
