package com.hanbit.service;

public class CalcService {
	public String execute(double height, double weight) {
		String result = "";
		System.out.print("BMI\n");

		double bmi = (weight/(height*height));
		
		System.out.print("### bmi 값 : " + bmi + "\n");
		
		if (bmi >= 30.0){
			result = "비만";
		}
		else if (bmi >= 25.0) {
			result = "과체중";
		}
		else if (bmi >= 18.5) {
			result = "정상";
		}
		else if (bmi <= 18.5) {
			result = "저체중";
		}
		return result;
	}
	public String calcPlus(String firNum, String secNum) {
		return String.valueOf(Integer.parseInt(firNum) + Integer.parseInt(secNum));
	}
	public String calcMinus(String firNum, String secNum) {
		return String.valueOf(Integer.parseInt(firNum) - Integer.parseInt(secNum));
	}
	public String calcMulti(String firNum, String secNum) {
		return String.valueOf(Integer.parseInt(firNum) * Integer.parseInt(secNum));
	}
	public String calcDivid(String firNum, String secNum) {
		return String.valueOf(Integer.parseInt(firNum) / Integer.parseInt(secNum));
	}
}
