package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.memberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService {
	int count;
	memberBean member;
	memberBean[] list;
	memberBean[] nameList;
	memberBean[] resultList;
	//생성자 처리가 이 문제의 핵심
	public AdminServiceImpl(int limit) {
		count=0;
		list = new memberBean[limit];
		member = new memberBean();
	}
	@Override
	public void addMember(memberBean member) {
		list[count] = member;
		/*위와 같은 의미의 for문
		 * 		for (int i=0;i<list.length;i++) {
					list[i] = member;
				}
		*/
		for (int i=0;i<count+1;i++) {
			
		}
		count++;
	}

	@Override
	public memberBean[] getMembers() {
		return list;
	}

	@Override
	public int countMembers() {
		return count;
	}
	@Override
	public memberBean findById(String id) {
		member = new memberBean();
		for (int i=0;i<list.length;i++) {
			if ((id).equals(list[i].getUserId())) {
				member = list[i];
			}
		}
		return member;
	}
	@Override
	public memberBean[] findByName(String name) {
		int x = 0;
		for (int i=0;i<list.length;i++) {
			if ((name).equals(list[i].getName())) {
				x++;
			}
		}
		memberBean[] temp = new memberBean[x];
		int j = 0;
		for (int i=0;i<list.length;i++) {
			if ((name).equals(list[i].getName())) {
				temp[j] = list[i];
				j++;
			}
			else if (x==j) {
				break;
			}
		}
		return temp;
	}
	@Override
	public void updatePass(memberBean member) {
		findById(member.getUserId()).setUserPw(member.getUserPw());
		
/*				 밑의 for roop 는 위의 것과 같음.
 * 
	 * 		for (int i=0;i<list.length;i++) {
				if (member.getUserId().equals(list[i].getUserId())) {
					list[i].setUserPw(member.getUserPw());
				}
	
			}
*/	}
}
