package com.chainsys.polymorphism1;

import java.util.Scanner;

public class Bank1 implements Bank {
	public static int interest;
	public static int principal;
	public static int totalAmount;
	public void principal() {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Bank details:");
    	System.out.println("Enter the principal amount:");
    	principal=sc.nextInt();
        System.out.println("Principal:"+principal);
	}
	
	public void amount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rate of interest:");
    	int rateOfInterest=sc.nextInt();
        System.out.println("RateOfInterest"+rateOfInterest);
        System.out.println("Enter no of years:");
    	int n=sc.nextInt();
        System.out.println("n:"+n);
        int totalAmount=principal+(principal*n*rateOfInterest);
        System.out.println("Amount:"+totalAmount);
	}
	
	
	public void loanInterest() {
		
		Scanner sc=new Scanner(System.in);
		interest=totalAmount-principal;
        System.out.println("Loan Interest amount:"+interest);
		
       
	}

}	
	
