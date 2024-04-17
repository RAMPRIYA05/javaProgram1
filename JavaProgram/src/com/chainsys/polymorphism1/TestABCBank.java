package com.chainsys.polymorphism1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestABCBank {
    public static String name() {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("User Name:");
        String userName=sc.next();
        Pattern p=Pattern.compile("[A-Z][a-z]");
        Matcher m=p.matcher(userName);
        if(m.find())
        {	
           //System.out.println(name);
        	return userName;
        }
           else
           {
        	System.out.println("Error");
        	TestABCBank.name();
           }
		return userName;
		
	  }
    
    public static long phoneNumber() {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("User phone number:");
        long userPhoneNumber=sc.nextLong();
        String number=Long.toString(userPhoneNumber);
        Pattern p=Pattern.compile("^[0-9]*$");
        Matcher m=p.matcher(number);
        if(m.find())
        {	
        	return userPhoneNumber;
        }
           else
           {
        	System.out.println("Error");
        	TestABCBank.phoneNumber();
           }
		return userPhoneNumber;
		
	  }
    public static String branch() {
    	String branch="Madurai";
		return branch;
    }
//    public static String address() {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//        
//        System.out.println("Address:");
//        String userAddress=sc.next();
//        Pattern p=Pattern.compile("[A-Z][a-z]");
//        Matcher m=p.matcher(userAddress);
//        if(m.find())
//        {	
//        	return userAddress;
//        	
//        }
//           else
//           {
//        	System.out.println("Error");
//        	TestABCBank.address();
//        	
//           }
//		return userAddress;
//		
//	  }
    
    public static long aadharNumber() {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("User Aadhar number:");
        long userAadharNumber=sc.nextLong();
        String number=Long.toString(userAadharNumber);
        Pattern p=Pattern.compile("^[0-9]*$");
        Matcher m=p.matcher(number);
        if(m.find())
        {	
        	return userAadharNumber;
        }
           else
           {
        	System.out.println("Error");
        	TestABCBank.aadharNumber();
           }
		return userAadharNumber;
		
	  }
    public static long accountNumber() {
        Scanner sc=new Scanner(System.in);
        System.out.println("User Account number:");
        long userAccountNumber=sc.nextLong();
        String number=Long.toString(userAccountNumber);
        Pattern p=Pattern.compile("^[0-9]*$");
        Matcher m=p.matcher(number);
        if(m.find())
        {	
        	return userAccountNumber;
        }
           else
           {
        	System.out.println("Error");
        	TestABCBank.accountNumber();
           }
		return userAccountNumber;
		
	  }
    public static int deposit() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the balance amount:");
    	int amount=sc.nextInt();
    	String number=Integer.toString(amount);
    	Pattern p=Pattern.compile("^[0-9]*$");
        Matcher m=p.matcher(number);
        if(m.find()) 
        {
    	//int deposit=5000;
    	System.out.println("Enter the deposit amount:");
    	int deposit=sc.nextInt();
    	System.out.println("Deposit Amount:"+deposit);
    	System.out.println("Balance before deposit :"+amount);
    	deposit=deposit+amount;
    	return deposit;
        }
        else
        {
     	System.out.println("Error");
     	TestABCBank.deposit();
        }
		//return deposit();
		return deposit();
    }
    public static int deposit(long accountNumber,long phoneNumber,int deposit) {
     // System.out.println("Account number:"+accountNumber);
     // System.out.println("Phone number:"+phoneNumber);
    	if(deposit>0) {
      System.out.println("Deposit:"+deposit);
    	}
    	else {
    		System.out.println("Please deposit amount greater than 0");
    	}
    	return deposit;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        ABCBank bank=new ABCBank();
        bank.setUserName(TestABCBank.name());
        bank.setUserPhoneNumber(TestABCBank.phoneNumber());
        //bank.setUserAddress(TestABCBank.address());
        bank.setUserAadharNumber(TestABCBank.aadharNumber());
        bank.setUserAccountNumber(TestABCBank.accountNumber());
        bank.setDeposit(TestABCBank.deposit());
        bank.setBranch(TestABCBank.branch());
        //TestABCBank.deposit(98765432,2345678,3000);
        //bank.setDeposit(TestABCBank.deposit(0, 0));
  
        System.out.println("User name:"+bank.getUserName());
        //System.out.println("User address:"+bank.getUserAddress());
        System.out.println("User phonenumber:"+bank.getUserPhoneNumber());
        System.out.println("User Aadharnumber:"+bank.getUserAadharNumber());
        System.out.println("User account number:"+bank.getUserAccountNumber());
        System.out.println("Total amount:"+bank.getDeposit());
        System.out.println("Deposit using phone number & account number:");
        TestABCBank.deposit(98765432,2345678,1000);
        System.out.println("Branch:"+bank.getBranch());
       // System.out.println(bank.getDeposit());

	}
     
}


	