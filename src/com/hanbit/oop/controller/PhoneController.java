package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.IPhone;
import com.hanbit.oop.inheritance.Phone;

public class PhoneController {
	public static void main(String[] args) {
		Phone p = new Phone();
		CellPhone nokia = new CellPhone();
		IPhone ip = new IPhone();
		AndroidPhone AP = new AndroidPhone();
		while (true) {
			switch(JOptionPane.showInputDialog("0. end 1. Phone 2. CellPhone 3. IPhone 4. AndroidPhone")) {
			case "0" : 
				System.out.println("end");
				return;
			case "1" :
				p.setName(JOptionPane.showInputDialog("이름"));
				p.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				p.setBrand(JOptionPane.showInputDialog("전화기브랜드"));
				p.setCall(JOptionPane.showInputDialog("통화내역"));
				JOptionPane.showMessageDialog(null, p.toString());
				break;
			case "2" :
				nokia.setName(JOptionPane.showInputDialog("이름"));
				nokia.setPortable(true);
				nokia.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				nokia.setBrand(JOptionPane.showInputDialog("전화기브랜드"));
				nokia.setCall(JOptionPane.showInputDialog("통화내역"));
				JOptionPane.showMessageDialog(null, nokia.toString());
				break;
			case "3" :
				ip.setName(JOptionPane.showInputDialog("이름"));
				ip.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				ip.setData(JOptionPane.showInputDialog("call message"));
				JOptionPane.showMessageDialog(null, ip.toString());				
				break;
			case "4" :
				AP.setName(JOptionPane.showInputDialog("이름"));
				AP.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				AP.setSize(JOptionPane.showInputDialog("사이즈"));
				AP.setAppl(JOptionPane.showInputDialog("메신저(앱)이름"));
				AP.setData(JOptionPane.showInputDialog("call message"));
				JOptionPane.showMessageDialog(null, AP.toString());				
				break;
			}
		}
	}
}