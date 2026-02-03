package com.validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateMobileNo {
	static Scanner sc = new Scanner(System.in);
	public static long ValidMobNo() {
	
		System.out.println("Enter your contact:");
		long mobNo = (sc.nextLong());
		// ac.setContact(sc.nextLong());

		/*
		 * if( mobNo>6000000000l && mobNo<9999999999l) {
		 * System.out.println("Valid mobno"); return mobNo; }else {
		 * System.out.println("invalid!! pls enter 10 digit no"); return
		 * ValidMobNo();//Recursive call to print enter mob no again }
		 */

		String mobMobStr = String.valueOf(mobNo);
		if (mobMobStr.length() == 10 && (mobMobStr.startsWith("6")) || (mobMobStr.startsWith("7"))
				|| (mobMobStr.startsWith("8")) || (mobMobStr.startsWith("9"))) {
			System.out.println("Valid mobno");
			return mobNo;
		} else {
			System.out.println("invalid!! pls enter 10 digit no");
			return ValidMobNo();// Recursive call to print enter mob no again
		}
	}
	
	public static String validateName() {
		System.out.println("Enter your Name:");
		String name=sc.next();
		
		if(Pattern.matches("[A-Za-z]+", name)){
		
			System.out.println("Valid name");
			return name;
		} else {
			System.out.println("invalid!! pls enter valid name");
		return validateName();// Recursive call to print enter name again
	}
			
	}
	
	public static String validatePANcardNo() {
		System.out.println("Enter PAN No:");
		String PANNo=sc.next();
		
		if(Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", PANNo) && PANNo.length()==10){
		
			System.out.println("Valid PANno");
			sc.nextLine();
			return PANNo;
		} else {
			System.out.println("invalid!! pls enter valid name");
		return validatePANcardNo();// Recursive call to print enter name again
	}
			
	}
	public static String validateAdhaarcardNo() {
		System.out.println("Enter Adhaar No:");
		String AdhaarNo=sc.nextLine();
		
		if(Pattern.matches("[2-9]{1}[0-9]{3}[ ]{1}[0-9]{4}[ ]{1}[0-9]{4}", AdhaarNo)){
		
			System.out.println("Valid AdhaarNo");
			sc.nextLine();
			return AdhaarNo;
		} else {
			System.out.println("invalid!! pls enter valid adhhar no");
		return validateAdhaarcardNo();// Recursive call to print enter name again
	}
			
	}
}
