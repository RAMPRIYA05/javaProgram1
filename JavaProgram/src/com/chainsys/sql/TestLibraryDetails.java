package com.chainsys.sql;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chainsys.polymorphism1.TestABCBank;


public class TestLibraryDetails {
	public static String userName() {
	
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Name:");
        String userName=sc.next();
        Pattern p=Pattern.compile("[A-Z][a-z]");
        Matcher m=p.matcher(userName);
        if(m.find())
        {	
        	return userName;
        }
           else
           {
        	System.out.println("Error");
        	TestLibraryDetails.userName();
           }
		return userName;
		
	  }
		 
	public static int booksAvailable() {
        Scanner sc=new Scanner(System.in);
        System.out.println("No of Books Available in Library:");
        int booksAvailable=sc.nextInt();
        String noOfBooksAvailable=Integer.toString(booksAvailable);
        Pattern p=Pattern.compile("^[0-9]*$");
        Matcher m=p.matcher(noOfBooksAvailable);
        if(m.find())
        {	
        	return booksAvailable;
        }
           else
           {
        	System.out.println("Error");
        	TestLibraryDetails.booksAvailable();
           }
		return booksAvailable;
		
	  }
	
	public static String bookName() {
		
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Name Of The Book:");
        String bookName=sc.next();
        Pattern p=Pattern.compile("[A-Z][a-z]");
        Matcher m=p.matcher(bookName);
        if(m.find())
        {	
        	return bookName;
        }
           else
           {
        	System.out.println("Error");
        	TestLibraryDetails.bookName();
           }
		return bookName;
		
	  }
	
      public static String authorName() {
		
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Name Of The Author:");
        String authorName=sc.next();
        Pattern p=Pattern.compile("[A-Z][a-z]");
        Matcher m=p.matcher(authorName);
        if(m.find())
        {	
        	return authorName;
        }
           else
           {
        	System.out.println("Error");
        	TestLibraryDetails.authorName();
           }
		return authorName;
		
	  }
    public static int noOfBooksTaken() {
        Scanner sc=new Scanner(System.in);
        System.out.println("No of Books Taken in Library:");
        int noOfBooksTaken=sc.nextInt();
        String numberOfBooksTaken=Integer.toString(noOfBooksTaken);
        Pattern p=Pattern.compile("^[0-9]*$");
        Matcher m=p.matcher(numberOfBooksTaken);
        if(m.find())
        {	
    	    return noOfBooksTaken;
        }
        else
        {
    	    System.out.println("Error");
    	    TestLibraryDetails.noOfBooksTaken();
        }
	    return noOfBooksTaken;
	 }
     public static int  libraryCardNumber() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Library CardNumber Of User:");
        int libraryCardNumber=sc.nextInt();
        String cardNumber=Integer.toString(libraryCardNumber);
        Pattern p=Pattern.compile("^[0-9]*$");
        Matcher m=p.matcher(cardNumber);
        if(m.find())
        {	
    	    return libraryCardNumber;
        }
        else
        {
    	    System.out.println("Error");
    	    TestLibraryDetails.libraryCardNumber();
        }
	    return libraryCardNumber;
	 }
       
	
   public static void main(String[] args) {
      LibraryDetails libraryDetails=new LibraryDetails();
      libraryDetails.setUserName(TestLibraryDetails.userName());
      libraryDetails.setBooksAvailable(TestLibraryDetails.booksAvailable());
      libraryDetails.setBookName(TestLibraryDetails.bookName());
      libraryDetails.setAuthorName(TestLibraryDetails.authorName());
      libraryDetails.setNumberOfBooksTaken(TestLibraryDetails.noOfBooksTaken());
      libraryDetails.setLibraryCardNumber(TestLibraryDetails.libraryCardNumber());
      System.out.println("User Name:"+libraryDetails.getUserName());
      System.out.println("Books Available:"+libraryDetails.getBooksAvailable());
      System.out.println("Book Name:"+libraryDetails.getBookName());
      System.out.println("Author Name:"+libraryDetails.getAuthorName());
      System.out.println("No Of Books Taken:"+libraryDetails.getNumberOfBooksTaken());
      System.out.println("Library Card Number:"+libraryDetails.getLibraryCardNumber());
}
}