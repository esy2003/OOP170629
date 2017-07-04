package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.service.GradeService;

public class GradeServiceImpl implements GradeService {

	@Override
	public int calcTotal(GradeBean g) {
		return g.getEng() + g.getKor() + g.getMath();
	}

	@Override
	public int calcAvg(int total) {
		return total / 3;
	}

	@Override
	public String getGrade(int avg) {
		//method area
		String grade = "";
		switch (avg/10) {
		case 9 :
		case 10 :
			grade = "A";
			break;
		case 8 :
			grade = "B";
			break;
		case 7 :
			grade = "C";
			break;
		case 6 :
			grade = "D";
			break;
		case 5 :
			grade = "E";
			break;
		case 4 :
			grade = "낙제 이새끼야";
		case 3 :
			grade = "낙제 이새끼야";
		case 2 :
			grade = "낙제 이새끼야";
		case 1 :
			grade = "낙제 이새끼야";
		}
		return grade;
	}
}
