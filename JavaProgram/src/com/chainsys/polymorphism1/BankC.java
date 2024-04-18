package com.chainsys.polymorphism1;

import java.util.Scanner;
//overriding
public class BankC extends BankA{
	    public static  int interest;
	    
	    public static int loanInterest() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("BankC details:");
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
        	BankC.loanInterest();
        }
		return 0;
	    }
		public void details() {
			System.out.println("Details of BankC:");
		}
		
		public void displayInfo() {
			System.out.println("Display interest of BankC:"+interest);
		   }
}
