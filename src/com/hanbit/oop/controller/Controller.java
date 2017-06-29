package com.hanbit.oop.controller;

import java.util.Scanner;

import com.hanbit.service.BmiService;
import com.hanbit.service.CalcService;
import com.hanbit.service.GradeService;
import com.hanbit.service.LeapYearService;
import com.hanbit.service.SecondCalcService;
import com.hanbit.service.TaxCalcService;
import com.hanbit.service.gradeReportService;

public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CalcService s1 = new CalcService();
		LeapYearService s2 = new LeapYearService();
		SecondCalcService s3 = new SecondCalcService();
		TaxCalcService s4 = new TaxCalcService();
		gradeReportService s5 = new gradeReportService();
		GradeService g = new GradeService();
		BmiService b = new BmiService();
		
		while (true) {
			System.out.println("");
			System.out.println("0. end 1. bmi 2. LeapYear 3. SecCalc 4. TaxCalc 5. gradeReport 6. calculator");
			String menu = s.next();

			switch (menu) {
			case "0":
				System.out.println("end");
				return;
			case "1":
				
				System.out.println("bmi");
				
				System.out.print("height\n");
				double height = s.nextDouble();
				b.setHeight(height);

				System.out.print("weight\n");
				double weight = s.nextDouble();

				b.setBmi();
				b.setResult();
				
				System.out.println(b.getResult());
				return;
			case "2":
				System.out.print("연도를 입력하세요");
				int year = s.nextInt();
				
				String result2 = s2.LeapYearExe(year);

				System.out.print(result2);
				return;
			case "3":
				System.out.println("초를 시간과 분으로 바꾸어 주는 프로그램입니다.\n초를입력해주세요.");
	               int sec = s.nextInt();
	               int seconds[] = s3.SecondCalcexe(sec);
	               System.out.println(seconds[0] + "시" + seconds[1] + "분" + seconds[2] + "초");
	               
	               break;				
			case "4":
				System.out.print("이름\n");
				String name = s.next();
				System.out.print("연봉\n");
				int inCome = s.nextInt();
				
				String taxRate = s4.TaxCalcExe(inCome);
				
				

				System.out.println("********************************");
				System.out.println("이름 | 연봉 | 세율 | 납부할 세금");
				System.out.println("--------------------------------");
				System.out.println(name + " | " + taxRate);
				System.out.print("********************************\n");
				return;
			case "5":
				
				//input
				System.out.print("이름을 입력\n");
				String studentsName = s.next();
				System.out.print("kor");
				int kor = s.nextInt();
				System.out.print("eng");
				int eng = s.nextInt();
				System.out.print("math");
				int math = s.nextInt();
				
				//operation
				
				String gradeResult = s5.gradeavg(studentsName, kor, eng, math);
				System.out.println(gradeResult);
				return;
			case "6":
				System.out.print("First num\n");
				int firNum = s.nextInt();
				
				System.out.print("opcode\n");
				String opcode = s.next();
				
				System.out.print("Second num\n");
				int secNum = s.nextInt();
				return;
			case "7":
				System.out.print("name\n");
				String name1 = s.next();
				g.setName(name1);
				System.out.print("major\n");
				String major = s.next();
				g.setMajor(major);
				System.out.print("kor\n");
				int kor1 = s.nextInt();
				g.setKor(kor1);
				System.out.print("eng\n");
				int eng1 = s.nextInt();
				g.setEng(eng1);
				System.out.print("math\n");
				int math1 = s.nextInt();
				g.setMath(math1);
				g.setGrade();
				System.out.println(g.toString());
				break;
			}
		}
	}
}