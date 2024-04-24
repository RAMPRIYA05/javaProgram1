package com.chainsys.sql;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;

public class TestLibraryDetails {
	public static  int bookCount;
//	public static String libraryAssistant;
//	 public static String role() 
//	 {
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("Types of person in library:");
//		 System.out.println("librarian\n libraryAssistant\n libraryMembership person\n 4.Manager\n 5.Other except non-membership person");
//		 System.out.println("Enter your role:");
//		 String role=sc.next();
//		 
//		if(role==libraryAssistant) 
//		{
//			 System.out.println("library Assistant check number of books,number returnrd,number of books taken and calculate the count");
//		 }
//		 return role;
//	 }
     public static int libraryCardNumber()
     {
        Scanner sc=new Scanner(System.in);
        int card=0;
        System.out.println("Library CardNumber Of User:");
        String libraryCardNumber=sc.next();
   
        Pattern p=Pattern.compile("^//d{5}$");
        Matcher m=p.matcher(libraryCardNumber);
        if(m.find())
        {	
        	System.out.println("Error");
    	    TestLibraryDetails.libraryCardNumber();
        	
        }
        else
        {
        	System.out.println("Welcome to our Library");
        	
        	card=Integer.parseInt(libraryCardNumber);
    	    
        }
	    return card;  
	 }
     public static String purpose()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Types of person in library:");
    	 System.out.println(" a.Booktaken\n b.BookReturn\n c.Bookreaders inside a library");
    	 System.out.println("Choose anyone option:");
    	 String purpose=sc.next();
    	 System.out.println("purpose:"+purpose);
    	 switch(purpose)
    	 {
    	 case "a":
    		 TestLibraryDetails.category();
    		 TestLibraryDetails.noOfBooksTaken();
       	     TestLibraryDetails.fine();
       	     TestLibraryDetails.nextBook();
    		 break;
    	
    	 case "b":
    		 System.out.println("Name of the book:");
    		 String book=sc.next();
    		 System.out.println("book:"+book);
    		 System.out.println("Name of the category");
    		 String category=sc.next();
    		 System.out.println("Category"+category);
    		 
    		 
    	 }
		return purpose;	 
    	 }
     
     public static String category() 
     {
    	 Scanner sc=new Scanner(System.in);
    	 //String category=sc.next();
    	 System.out.println("These are the category in our library:");
    	 System.out.println(" a.Historical Fiction\n b.Fantasy\n c.Mystery\n d.Comics");
    	 System.out.println("choose any one category:");
    	 String option=sc.next();
    	 System.out.println(option);
    	 switch(option)
    	 {
    		 case "a":
    			 System.out.println(" Historical Fiction:\n 1.Pachinko\n 2.All the Light We Cannot See\n 3.The Nightingale\n");
    			 System.out.println("Enter an option:");
    			 int historicalFictionOption=sc.nextInt();
    			 System.out.println(historicalFictionOption);
    			 if(historicalFictionOption==1)
    			 {
    				 String book1="Pachinko";
    				 System.out.println("Book Name"+book1);
    				 bookCount=5;
    				 System.out.println("no of "+book1+" books available are: "+bookCount); 
    			     
    			 }
    			 else if(historicalFictionOption==2)
    			 {
    				  String book2="All the Light We Cannot See";
    				  System.out.println("Book Name"+book2); 
    			      System.out.println("This book available after 27/04/2024");
    			      System.out.println("you have to wait or choose other book");
    			      TestLibraryDetails.category();
    			 }
    			 else if(historicalFictionOption==3||historicalFictionOption==4)
    			 {
    				 String book3="The Nightingale";
   				     System.out.println("Book Name"+book3); 
   				     bookCount=10;
 				     System.out.println("no of "+book3+" books available are: "+bookCount); 
    			 }
    	         break;
             case "b":
            	 System.out.println(" Fantasy:\n 1.Jade City\n 2.Tigana\n 3.The Night Circus");
            	 System.out.println("Enter an option:");
            	 int fantasy=sc.nextInt();
    			 System.out.println(fantasy);
    			 if(fantasy==1) {
    				 String book1="Jade City";
    				 System.out.println("Book Name"+book1);
    				 bookCount=15;
    				 System.out.println("no of "+book1+" books available are: "+bookCount); 
    			 }
    			 else if(fantasy==2)
    			 { 
    				  String book2="Tigana";
    				  System.out.println("Book Name"+book2);
    			      System.out.println("This book available after 27/04/2024");
    			      System.out.println("you have to wait or choose other book");
    			      TestLibraryDetails.category();
    			 }
    			 else if(fantasy==3)
    			 {
    				 String book3="The Night Circus";
   				     System.out.println("Book Name"+book3);
   				     bookCount=3;
 				     System.out.println("no of "+book3+" books available are: "+bookCount);
    			 }
    			 break; 
    	     case "c":
    	    	 System.out.println(" Mystery:\n 1.Gone Girl\n 2.The Girl with the Dragon\n");
    	    	 System.out.println("Enter an option:");
    	    	 int mystery=sc.nextInt();
    			 System.out.println(mystery);
    			 if(mystery==1)
    			 {
    				 String book1="Gone Girl";
    				 System.out.println("Book Name"+book1);
    				 bookCount=10;
    				 System.out.println("no of "+book1+" books available are: "+bookCount); 
    			 }
    			 else if(mystery==2)
    			 {
    		         String book2="The Girl with the Dragon";
    		         System.out.println("Book Name"+book2);
    		         System.out.println("This book available after 03/05/2024");
   			         System.out.println("you have to wait or choose other book");
   			         TestLibraryDetails.category();
   			         
    			 } 
    			 break;
    	     case "d":
    	    	 System.out.println("Comics:\n 1.The Sand Man\n 2.Watchmen\n");
    	    	 System.out.println("Enter an option:");
    	    	 int comics=sc.nextInt();
			     System.out.println(comics);
			     if(comics==1)
			     {
			    	 String book1="The Sand Man";
			    	 System.out.println("Book Name"+book1);
			    	 bookCount=20;
    				 System.out.println("no of "+book1+" books available are: "+bookCount); 
			     }
			     else if(comics==2)
    			 {
    		         String book2="Watchmen";
    		         System.out.println("Book Name"+book2);
    		         System.out.println("This book available after 09/05/2024");
   			         System.out.println("you have to wait or choose other book");
   			         TestLibraryDetails.category();
   			      }
			     break;
    	 }
		return option;
    }
        
     public static int noOfBooksTaken() 
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Number of books taken by user:");
         int noOfBooksTaken=sc.nextInt();
         String numberOfBooksTaken=Integer.toString(noOfBooksTaken);
         Pattern p=Pattern.compile("^[0-9]*$");
         Matcher m=p.matcher(numberOfBooksTaken);
         if(m.find())
         {	
        	 if(bookCount>noOfBooksTaken && noOfBooksTaken!=0)
        	 {
     	       System.out.println(noOfBooksTaken);
    	 	   int remainingNoOfBooks=bookCount-noOfBooksTaken;
    	 	   System.out.println("Remaining number of books:"+remainingNoOfBooks);
    	 	   System.out.println("when did you return the book?:");
        	   System.out.println("Please enter the days.It will show fine is applicable or not.It will be helpful for you while return the book.");
        	 }
        	 else
        	 {
        		 System.out.println("enter no of books less than book count");
        		 TestLibraryDetails.noOfBooksTaken();
        	 }
			}
         
         else
         {
     	    System.out.println("Error");
     	    TestLibraryDetails.noOfBooksTaken();
         }
         
 	    return noOfBooksTaken;
 	 }
      
	
      public static void fine() {
    	  Scanner sc=new Scanner(System.in);
    	  
    	  
    	  int day=sc.nextInt();
    	  if(day>0) 
    	  {
    	  if(day<=15) {
    		  System.out.println("No fine.You return book on time");
    	  }
    	  else if(day>15 && day<=20)
    	  {
    		  System.out.println("You should pay fine rs.50");
    	  }
    	  else if(day>20 && day<=30)
    	  {
    		  System.out.println("You should pay fine rs.100");
    	  }
    	  else if(day>30)
    	  {
    		  System.out.println("You should pay fine rs.10 per day");
    	  }
    	  System.out.println("If You return the book within 15 days.Then no fine");
    	  }
    	  
    	  else 
    	  {
    		  System.out.println("Error");
    		  TestLibraryDetails.fine();
    	  }
		 
      }
      
      public static String todayDate()
      { 
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("enter the today date(dd/mm/yyyy):");
    	  String todayDate=sc.next();
    	  SimpleDateFormat formatting=new SimpleDateFormat("dd/mm/yyyy");
    	  try {
    	  
		  Date date=formatting.parse(todayDate);
    	   String format = formatting.format(date);
    	  }
    	  catch(ParseException e) {
    		  System.out.println("invalid date format");
    		  System.out.println("date format should be in (03/05/2024)");
    		  TestLibraryDetails.todayDate();
    	  }
		return todayDate;
    	 
      }
      public static char nextBook()
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("do you want any other books?(Y/N):");
    	  char nextBook=sc.next().charAt(0);
    	  if(nextBook=='Y')
    	  {
    		  System.out.println("now you can select next book:");
		      TestLibraryDetails.category();
		      TestLibraryDetails.noOfBooksTaken();
		      TestLibraryDetails.fine();
		      TestLibraryDetails.nextBook();
		      
    	  }
    	  else if(nextBook=='N')
    	  {
    		  System.out.println("you can exit now");
    	  }
    	  else
    	  {
    		  System.out.println("please enter the correct input");
    		  TestLibraryDetails.nextBook();
    	  }
		return nextBook;
		
    	  
      }
      
   public static void main(String[] args) {
      LibraryDetails libraryDetails=new LibraryDetails();
      //libraryDetails.setRole(TestLibraryDetails.role());
      libraryDetails.setLibraryCardNumber(TestLibraryDetails.libraryCardNumber());
      libraryDetails.setPurpose(TestLibraryDetails.purpose());
      //libraryDetails.setCategory(TestLibraryDetails.category());
      //libraryDetails.setNumberOfBooksTaken(TestLibraryDetails.noOfBooksTaken());
      libraryDetails.setTodayDate(TestLibraryDetails.todayDate());
     // TestLibraryDetails.fine();
     // libraryDetails.setNextBook(TestLibraryDetails.nextBook());
      
     // System.out.println("Role:"+libraryDetails.getRole());
      System.out.println("Library Card Number:"+libraryDetails.getLibraryCardNumber());
      System.out.println("Purpose:"+libraryDetails.getPurpose());
      //System.out.println("category:"+libraryDetails.getCategory());
      //System.out.println("No Of Books Taken:"+libraryDetails.getNumberOfBooksTaken());
      System.out.println("today Date:"+libraryDetails.getTodayDate());
      //System.out.println("next book:"+libraryDetails.getNextBook());
      System.out.println("Thanks for using our library");
     
}
}