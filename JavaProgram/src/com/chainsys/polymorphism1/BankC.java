package com.chainsys.polymorphism1;

import java.util.Scanner;

public class BankC extends BankA{
	    public static int loanInterest() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("BankC details:");
    	System.out.println("Enter the principal amount:");
    	int principal=sc.nextInt();
        System.out.println("Principal:"+principal);
        System.out.println("Enter the rate of interest:");
    	int rateOfInterest=sc.nextInt();
        System.out.println("RateOfInterest"+rateOfInterest);
        System.out.println("Enter no of years:");
    	int n=sc.nextInt();
        System.out.println("n:"+n);
        int amount=principal+(principal*n*rateOfInterest);
        System.out.println("Amount:"+amount);
        int interest=amount-principal;
        //System.out.println("Interest amount"+interest);
		return interest;
}}
