package com.chainsys.sql;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;

public class TestLibraryDetails {
	 
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
    				 System.out.println("five books are available");
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
    				 System.out.println(("10 books are available"));
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
    				 System.out.println("five books are available");
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
    				 System.out.println(("3 books are available"));
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
    				 System.out.println("ten books are available"); 
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
    	 }
		return option;
    }
        
     public static int noOfBooksTaken() {
         Scanner sc=new Scanner(System.in);
         System.out.println("Number of books taken");
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
	
      public static void fine() {
    	  Scanner sc=new Scanner(System.in);
    	  
    	  System.out.println("how many days after you return the book:");
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
    	  }
    	  else 
    	  {
    		  System.out.println("Error");
    		  TestLibraryDetails.fine();
    	  }
		 
      }
   public static void main(String[] args) {
      LibraryDetails libraryDetails=new LibraryDetails();
      libraryDetails.setLibraryCardNumber(TestLibraryDetails.libraryCardNumber());
      libraryDetails.setCategory(TestLibraryDetails.category());
      libraryDetails.setNumberOfBooksTaken(TestLibraryDetails.noOfBooksTaken());
      libraryDetails.setTodayDate(TestLibraryDetails.todayDate());
      TestLibraryDetails.fine();
      System.out.println("You should return the book within 15 days");
      System.out.println("Library Card Number:"+libraryDetails.getLibraryCardNumber());
      System.out.println("category:"+libraryDetails.getCategory());
      System.out.println("No Of Books Taken:"+libraryDetails.getNumberOfBooksTaken());
      System.out.println("today Date:"+libraryDetails.getTodayDate());
     
}
}