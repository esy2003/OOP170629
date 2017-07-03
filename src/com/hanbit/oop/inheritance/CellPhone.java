package com.hanbit.oop.inheritance;

public class CellPhone extends Phone {
	private boolean portable;
	protected String move;
	public static final String KIND = "휴대폰";
	
	public void setPortable(boolean portable) {
		if (portable) {
			this.setMove("이동 가능");
		}
		else {
			this.setMove("이동 불가능");
		}
		this.portable=portable;
	}
	
	public boolean isPortable() {
		return portable;
	}
	
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	
	@Override
	public String toString() {
		return KIND + "이기 때문에" + move +"상태로" + super.name + "에게 " + super.phoneNum + "번호로 " + super.brand + KIND + "를 사용해서 " + super.call + "이라고 통화했다";
	}
}
