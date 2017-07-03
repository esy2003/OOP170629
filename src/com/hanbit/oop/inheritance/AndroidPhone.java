package com.hanbit.oop.inheritance;

public class AndroidPhone extends IPhone {
	public static final String BRAND = "갤럭시 노트";
	private String size, appl;
	
	public void setAppl(String appl) {
		this.appl = appl;
	}
	public String getAppl() {
		return appl;
	}
	public void setSize(String size) {
		this.size = size;
		setPortable(true);
	}
	public String getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		return KIND + "이기 때문에" + move +"상태로" + name + "에게 " + phoneNum + "번호로 " + BRAND + " " + size + "인치를 사용해서 " +  data + "이라고" + appl + "메세지를전송했다";
	}
	
}
