package com.chainsys.polymorphism1;

import java.util.Scanner;

public  class BankF extends BankE{
	public static int interest;
    
	public int loanInterest() {
		 Scanner sc=new Scanner(System.in);
	    	System.out.println("BankE details:");
	    	System.out.println("Enter the principal amount:");
	    	int principal=sc.nextInt();
	        System.out.println("Principal:"+principal);
	        if(principal!=0 && principal>0) {
	        System.out.println("Enter the rate of interest:");
	    	int rateOfInterest=sc.nextInt();
	        System.out.println("RateOfInterest"+rateOfInterest);
	        System.out.println("Enter no of years:");
	    	int n=sc.nextInt();
	        System.out.println("n:"+n);
	        int amount=principal+(principal*n*rateOfInterest);
	        System.out.println("Amount:"+amount);
	        interest=amount-principal;
	        //System.out.println("Interest amount"+interest);
			return interest;
	        }
	        else {
	        	System.out.println("Interest must greater than zero");
	        	//BankE.loanInterest();
	        }
			return interest;
	 }
	
	

	
}