package com.hanbit.service;

public class memberService {
	private String userId, userPw, gender, name, ssn, age, loginId, loginPw, loginResult;

	
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
	public void setAge() {
		int sYear =Integer.parseInt(ssn.substring(0,2));
		if(17-sYear>=0){
			this.age=String.valueOf(2017-(sYear+2000));
		}
		else {
			this.age = String.valueOf(2017-(sYear + 1900));
		}

	}
	public String getAge() {
		return age;
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
	public void setLogin(String loginId, String loginPw) {
		if(userId.equals(loginId)){
			if(userPw.equals(loginPw)){
				loginResult=toString();
			}else{
				loginResult="비밀번호를 확인해주세요";
			}
		}
		else{
			loginResult="아이디를 확인해주세요";
		}
	}
	public String getLogin() {
		return loginResult;
	}
	
	public String toString() {
		return "welcome " + name + "(" + gender + ", "+age+"살" + ")";
	}

}
