package com.hanbit.oop.serviceImpl;

public class LeapYearService {
	public String LeapYearExe(int year) {
		String result = "";
		
		if (year % 4 == 0){
			result = "윤년";
			if (year % 100 == 0) {
				result = "평년";
			}
		}
		else if (year % 400 == 0){
			result = "윤년";
		}
		return result;
	}
}
