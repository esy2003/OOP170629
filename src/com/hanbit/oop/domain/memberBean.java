package com.hanbit.oop.domain;

public class memberBean {
	private String userId, userPw, name, ssn;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setUserId(String id) {
		this.userId = id;
	}
	public String getUserId() {
		return userId;
	}
	
	public void setUserPw(String pw) {
		this.userPw = pw;
	}
	public String getUserPw() {
		return userPw;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	public String getSSN() {
		return ssn;
	}
	public String toString() {
		return null;//"welcome " + name + "(" + gender + ", "+age+"살" + ")";
	}

}
