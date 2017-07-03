package com.hanbit.oop.inheritance;

public class Phone {
	protected String name, phoneNum, brand, call;
	public static final String KIND = "집전화";
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setCall(String call) {
		this.call = call;
	}
	public String getCall() {
		return call;
	}
	
	public String toString() {
		return  name + "에게 " + phoneNum + "번호로 " + brand + KIND + "를 사용해서 " + call + "이라고 통화했다";
	}
}
