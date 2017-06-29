package com.hanbit.service;

public class SecondCalcService {
	public int[] SecondCalcexe(int sec) {
		 /*
	      시 - 초 /3600 의 int값
	      분 - 초 / 3600 한 나머지 값을 / 60 의 int값
	      초 - 초 / 3600 하고 나머지 값 /60의 나머지 값은 초
	      */
	      int arr[] = {sec/3600, sec % 3600 / 60, sec % 3600 % 60};
	      
	      return arr;
	}
}
