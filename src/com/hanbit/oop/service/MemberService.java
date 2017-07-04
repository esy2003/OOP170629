package com.hanbit.oop.service;

import com.hanbit.oop.domain.memberBean;

public interface MemberService {
	public String getGender(memberBean member);
	public String getAge(memberBean member);
	public String join(memberBean member);
	public String Login(memberBean member);
}
