package com.chainsys.polymorphism1;
//overriding
import java.util.Scanner;

public class BankA {
	    public static int amount;
	    
	public static int loanInterest() {
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("BankA details:");
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
        amount=principal+(principal*n*rateOfInterest);
        System.out.println("Amount:"+amount);
        int interest=amount-principal;
        //System.out.println("Interest amount:"+interest);
		return interest;
    	}
        else {
        	System.out.println("Interest must greater than zero");
        	BankA.loanInterest();
        }
		return 0;
    }
	public void details() {
		System.out.println("Details of BankA:");
	}
	public void displayInfo() {
		System.out.println("Display amount of BankA:"+amount);
	   }
}
