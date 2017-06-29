package com.hanbit.service;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class BmiService {
	private double height, weight,bmi;
	private String result;
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setBmi() {
		this.bmi = (weight/(height*height));
	}
	public double getBmi() {
		return bmi;
	}
	
	
	public void setResult() {

		if (bmi >= 30.0){
			this.result = "비만";
		}
		else if (bmi >= 25.0) {
			this.result = "과체중";
		}
		else if (bmi >= 18.5) {
			this.result = "정상";
		}
		else if (bmi <= 18.5) {
			this.result = "저체중";
		}
	}
	public String getResult() {
		return result;
	}

}
