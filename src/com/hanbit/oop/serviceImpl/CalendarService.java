package com.hanbit.oop.serviceImpl;

public class CalendarService {
	//필드에는 값을 할당하지 않는다. 그래서 밑의 이니셜라이징은 인트이지만 =0; 을 해주지않음.
	private int year, month, date, day;
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth() {
		return month;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	public int getDate() {
		return date;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay() {
		return day;
	}
	public String toString() {
		return year + "년 " + month + "월 " + day + "일 " + date + "요일";
	}
}
