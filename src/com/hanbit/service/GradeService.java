package com.hanbit.service;

public class GradeService {
	//field
	private int kor,eng,math,total,avg;
	private String grade, name, major;
		
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	
	public void setTotal() {
		this.total=kor+eng+math;
	}

	
	public int getTotal() {
		return total;
	}

	public void setAvg() {
		this.avg = total/3;
	}
	public int getAvg() {
		return avg;
	}
	
	public void setGrade() {
		//method area
		setTotal();
		setAvg();
		switch (avg/10) {
		case 9 :
		case 10 :
			grade = "A";
			break;
		case 8 :
			this.grade = "B";
			break;
		case 7 :
			this.grade = "C";
			break;
		case 6 :
			this.grade = "D";
			break;
		case 5 :
			this.grade = "E";
			break;
		case 4 :
			this.grade = "낙제 이새끼야";
		case 3 :
			this.grade = "낙제 이새끼야";
		case 2 :
			this.grade = "낙제 이새끼야";
		case 1 :
			this.grade = "낙제 이새끼야";
		}
	}
	public String getGrade() {
		return grade;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	public String toString() {
		return "=====================\n"
				+ "  이름        전공        성적  \n"
				+ "---------------------\n"
				+ " " + name + "\t" + major + "\t" + grade + "\n"
				+ "=====================";
	}
}