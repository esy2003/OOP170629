package com.hanbit.service;

public class TaxCalcService {
	public String TaxCalcExe(int inCome) {
		double rate = 0;
		
		if (inCome <= 1200){
			rate = 0.08;
		}
		else if (inCome > 1200 && 4600 >= inCome) {
			rate = 0.17;
			
		}
		else if (inCome > 4600 && 8800 >= inCome) {
			rate = 0.26;
		}
		else {
			rate = 0.35;
		}
		int tax = (int)(inCome * rate);
		String taxRate = String.format("%d |  %d | %d 만원", inCome, (int)(rate*100), tax);
		return taxRate;
	}
}
