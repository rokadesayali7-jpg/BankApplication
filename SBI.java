package com.bankapplication.sayali.serviceimpl;

import java.util.Scanner;

import com.Exception.InsufficientBalException;
import com.autogenAccNo.AutoGenAccNo;
import com.bankapplication.sayali.model.Account;
import com.bankapplication.sayali.service.RBI;
import com.validation.ValidateMobileNo;

public class SBI implements RBI {
	Scanner sc = new Scanner(System.in);
//input:store
//account:set get
	Account ac = new Account();// because we want data from account
	//boolean flag=true;
	@Override
	public void createAccount() {

		//System.out.println("Enter your Account Number:");// acc no//11digit
		//int accNo = sc.nextInt();
		//long autoGenAccNo=(long)(Math.random()*Math.pow(10, 12));
		long accNo=AutoGenAccNo.generateAccNo();
		//For random no check AutoGenAccNo class
		// store this in account object
		ac.setAccNo(accNo);
		//System.out.println("Enter your Name:");
		// String Enm=sc.next();
		// ac.setAccName(Enm);
		// or
		//ac.setAccName(sc.next());
		ac.setAccName(ValidateMobileNo.validateName());
		//System.out.println("Enter your AdhaarCard no:");
		//ac.setAdhaarCard(sc.next());
		ac.setAdhaarCard(ValidateMobileNo.validateAdhaarcardNo());
		//System.out.println("Enter your PanCard no:");
		//ac.setPanCard(sc.next());
		ac.setPanCard(ValidateMobileNo.validatePANcardNo());
		System.out.println("Enter your EmailId:");
		ac.setEmailId(sc.next());
		//System.out.println("Enter your contact:");
		//ac.setContact(sc.nextLong());
		long contct=ValidateMobileNo.ValidMobNo();
		ac.setContact(contct);
		
		System.out.println("Enter your accountBalance:");
		ac.setAccountBalance(sc.nextDouble());
		System.out.println("Account Created Successfully please check Details");


	}

	@Override
	public void showAccountDetails() {
		// TODO Auto-generated method stub
		//System.out.println("Enter Account no:");
		//int accno = sc.nextInt();
		//if (ac.getAccNo() == accno) {
			//System.out.println(ac.toString());
		//} else
		//	System.out.println("Invalid acc no pls check valid account no");
		System.out.println(ac.getAccNo());
		System.out.println(ac.toString());
	}

	@Override
	public void showAccountBalance() {
		// TODO Auto-generated method stub
	/*	System.out.println("Enter your Account No:");
		int accno = sc.nextInt();
		if (ac.getAccNo() == accno) {
			System.out.println("Currnt account balance" + ac.getAccountBalance());
		} else
			System.out.println("Invalid acc no pls check valid account no");*/
       System.out.println(ac.getAccountBalance());
	}

	@Override
	public void withdrawMoney() {
		// System.out.println("Enter your acc no:");
		
		System.out.println("Enter your withdraw Amount:");
		double accwithdraw = sc.nextDouble();

		if (accwithdraw <= ac.getAccountBalance()) {
			accwithdraw = ac.getAccountBalance() - accwithdraw;
			System.out.println("Acc withdraw Balance: " + accwithdraw);
			ac.setAccountBalance(accwithdraw);
		} else
throw new InsufficientBalException("insufficient Bal");
			//System.out.println("Acc withdraw is not done pls check acc bal");
	}

	@Override
	public void depositeMoney() {

		System.out.println("Enter Deposite Amount");
		double accdeposite = sc.nextDouble();
		if (accdeposite > 0) {
			accdeposite = ac.getAccountBalance() + accdeposite;
			ac.setAccountBalance(accdeposite);
			System.out.println("Deposite Succesful");
		} else {

			System.out.println("Invalid amount");
		}

	}

	@Override
	public void updateAccountDetails() {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("1:update name            |");
			System.out.println("2:Update Mobile no       |");
			System.out.println("3:Update EmailId         |");
			System.out.println("4:Update PAN             |");
			System.out.println("5:Update Adhaar card     |");
			System.out.println("6:Exit                   |");
			
			
			System.out.println("Enter your choice in betwwen 1 to 6 fpr updation");
			int ch=sc.nextInt();
			
			switch (ch) {
			
			case 1:
				System.out.println("Enter Name to update ");
				String updateNm = sc.next();
				ac.setAccName(updateNm);
				break;
			case 2:
				System.out.println("Enter Mobile No to update");
				long updateMob = sc.nextLong();
				ac.setContact(updateMob);
		        break;
			case 3:
				System.out.println("Enter EmailId to update");
				String updateEmail = sc.next();
				ac.setEmailId(updateEmail);
				break;
			case 4:
				System.out.println("Enter AdhaarNo update ");
				String updateAdhaar = sc.next();
				ac.setAdhaarCard(updateAdhaar);
	        	break;
			case 5:
				System.out.println("Enter PAN to update");
				String updatePAN = sc.next();
				ac.setPanCard(updatePAN);
				break;
			case 6:
			
				  System.out.println("Thank you Exiting...");
				flag=false;
			    break;
			    
			default:
				System.out.println("Invalid choice please enter choice to continue:");
				
				
			}
		}
		
	}

}
