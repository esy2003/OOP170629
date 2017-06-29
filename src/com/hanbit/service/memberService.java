package com.hanbit.service;

public class memberService {
	private String userId, userPw, gender, name, ssn, loginId, loginPw;

	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	
	public void setUserPw(String userPw) {
		this.userPw = userPw;
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
	
	public String getGender() {
		return gender;
	}
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginId() {
		return loginId;
	}
	
	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}
	public String getLoginPw() {
		return loginPw;
	}
	
	public void setGender(){

		char ch = ssn.charAt(7);
		
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

	}
	public void setLogin(String id, String pw) {
		if(id.equals(this.userId)&&pw.equals(this.userPw)){
			loginId=toString();
		}
		else{
			loginId="로그인 실패";
		}
		this.userId = id;
		this.userPw = pw;
	}
	public String getLogin() {
		return loginId;
	}
	
	public String toString() {
		String sYear = ssn.substring(0,2);
		int year = Integer.parseInt(sYear);

		return "welcome " + name + "(" + gender + ", " + ((17-year>=0) ? 2017-(year + 2000) + 1 : 2017-(year + 1900) + 1) + ")";
	}

}
