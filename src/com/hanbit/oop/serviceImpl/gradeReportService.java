package com.hanbit.oop.serviceImpl;
//class
public class gradeReportService {
	// fiedl 지점

	
	public String gradeavg(String studentsName, int kor, int eng, int math) {
		//method area
		int total = kor + eng + math;
		int avg = total / 3;

		String grade = "";
		if (avg >=90){
			grade = "A";
		}
		else if (avg >= 80) {
			grade = "B";
		}
		else if (avg >= 70) {
			grade = "C";
		}
		else if (avg >= 60) {
			grade = "D";
		}
		else if (avg >= 59) {
			grade = "E";
		}
		else {
			grade = "낙제 이새끼야";
		}

		String gradeResult = "이름 :" + studentsName + "총점 :" + total + "평균 :" + avg + "등급 :" + grade;
		return gradeResult;
	}
}
