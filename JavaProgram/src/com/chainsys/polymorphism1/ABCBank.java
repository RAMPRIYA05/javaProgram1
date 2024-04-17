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
     public int princilal;
     public int rateOfInterest;
     public int n;
     public int loanInterest;
     
     
	 public int getLoanInterest() {
		return loanInterest;
	}
	public void setLoanInterest(int loanInterest) {
		this.loanInterest = loanInterest;
	}
	public int getPrincilal() {
		return princilal;
	}
	public void setPrincilal(int princilal) {
		this.princilal = princilal;
	}
	public int getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
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
				+ deposit + ", amount=" + amount + ", branch=" + branch + ", princilal=" + princilal
				+ ", rateOfInterest=" + rateOfInterest + ", n=" + n + ", loanInterest=" + loanInterest + "]";
	}
	
}