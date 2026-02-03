package com.bankapplication.sayali.controller;

import java.util.Scanner;

import com.Exception.InsufficientBalException;
import com.bankapplication.sayali.service.RBI;
import com.bankapplication.sayali.serviceimpl.SBI;

public class AdminMainController {
	public static void main(String[] args) {
		System.out.println("-----Welcome To Bank------");
		Scanner sc=new  Scanner(System.in);
		boolean flag=true;
		RBI rbi=new SBI();//indirect object
		while(flag) {
			System.out.println("1:create bank Account        |");
			System.out.println("2:show Account Details       |");
			System.out.println("3:show Account Balance       |");
			System.out.println("4:withdrawMoney              |");
			System.out.println("5:depositeMoney              |");
			System.out.println("6:update AccountDetails      |");
			System.out.println("7:Exit                       |");
			
			
			System.out.println("Enter your choice in betwwen 1 to 7");
			int ch=sc.nextInt();
			
			switch (ch) {
			
			case 1:
				rbi.createAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				try {
					rbi.withdrawMoney();
				} catch (InsufficientBalException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				rbi.depositeMoney();
				break;
			case 6:
				rbi.updateAccountDetails();
				break;
			case 7:
				flag=false;
				break;

			default:
				System.out.println("Invalid choice please enter choice to continue:");
				break;
			}
		}
		sc.close();
	
	}

}
