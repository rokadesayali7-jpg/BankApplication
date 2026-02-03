package com.bankapplication.sayali.model;

public class Account {
//Encapsulation
	 private String accName;
	 private long accNo;
	 private String AdhaarCard;
	 private long contact;
	 private String emailId;
	 private String panCard;
	 private double accountBalance;
	 
	 //getter setter
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAdhaarCard() {
		return AdhaarCard;
	}
	public void setAdhaarCard(String adhaarCard) {
		AdhaarCard = adhaarCard;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	 //ToString
	@Override
	public String toString() {
		return "Account [accName=" + accName + ", accNo=" + accNo + ", AdhaarCard=" + AdhaarCard + ", contact="
				+ contact + ", emailId=" + emailId + ", panCard=" + panCard + ", accountBalance="
				+ accountBalance + "]";
	}
	
	
	 
	 
}
