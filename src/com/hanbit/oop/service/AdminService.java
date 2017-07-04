package com.hanbit.oop.service;

import com.hanbit.oop.domain.memberBean;

public interface AdminService {
	public void addMember(memberBean member);
	public memberBean[] getMembers();
	public int countMembers();
	public memberBean findById(String id);
	public memberBean[] findByName(String name);
	public void updatePass(memberBean member);
}
