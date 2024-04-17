package com.chainsys.polymorphism1;

public class ABCBank {
	 public ABCBank() {
   	  
     }
     public String userName;
     public long userPhoneNumber;
     public String userAddress;
     public long userAadharNumber;
     public long userAccountNumber;
     public int deposit;
     public int amount;
     public String branch;
    
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public long getUserAccountNumber() {
		return userAccountNumber;
	}
	public void setUserAccountNumber(long userAccountNumber) {
		this.userAccountNumber = userAccountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(long userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public long getUserAadharNumber() {
		return userAadharNumber;
	}
	public void setUserAadharNumber(long userAadharNumber) {
		this.userAadharNumber = userAadharNumber;
	}
	@Override
	public String toString() {
		return "ABCBank [userName=" + userName + ", userPhoneNumber=" + userPhoneNumber + ", userAddress=" + userAddress
				+ ", userAadharNumber=" + userAadharNumber + ", userAccountNumber=" + userAccountNumber + ", deposit="
				+ deposit + ", amount=" + amount + ", branch=" + branch + "]";
	}
	
	}
	
	
	



