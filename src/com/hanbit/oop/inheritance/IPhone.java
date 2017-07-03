package com.hanbit.oop.inheritance;

public class IPhone extends CellPhone {
	protected String data;
	public final static String KIND = "스마트폰";
	// KIND 는 스마트폰이라고 오버라이딩
	public static final String BRAND = "아이폰";
	public void setData(String data) {
		this.data = data;
		setPortable(true);
	}
	public String getData() {
		return data;
	}
	@Override
	public String toString() {
		return KIND + "이기 때문에" + move +"상태로" + name + "에게 " + phoneNum + "번호로 " + BRAND + "을 사용해서 " +  data + "이라고 문자를 전송했다";
	}
}
