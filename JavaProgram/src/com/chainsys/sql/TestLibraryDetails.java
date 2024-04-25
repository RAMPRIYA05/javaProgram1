package com.chainsys.sql;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;

public class TestLibraryDetails {
	public static  int bookCount;
	private static String purpose;

     public static int libraryCardNumber()
     {
        Scanner sc=new Scanner(System.in);
        int card=0;
        System.out.println("Library CardNumber Of User:");
        String libraryCardNumber=sc.next();
   
        Pattern p=Pattern.compile("^[0-9]+$");
        Matcher m=p.matcher(libraryCardNumber);
        if(m.find())
        {	
        	System.out.println("Welcome to our Library");
        	card=Integer.parseInt(libraryCardNumber);
        	
        }
        else
        {
        	System.out.println("Error");
    	    TestLibraryDetails.libraryCardNumber();
    	    
        }
	    return card;  
	 }
     public static String purpose()
     {
    	 Scanner sc=new Scanner(System.in);
    	
    	 System.out.println("Types of person in library:");
    	 System.out.println(" 1.Booktaken\n 2.BookReturn\n 3.Bookreaders inside a library");
    	 System.out.println("Choose anyone option:");
    	 String purpose=sc.next();
    	 sc.nextLine();
    	 //System.out.println("purpose:"+purpose);
    	 Pattern p=Pattern.compile("^[0-9]+$");
         Matcher m=p.matcher(purpose);
         if(m.find())
         {
    	 switch(purpose)
    	 {
    	 case "1":
    		
    		 TestLibraryDetails.category();
    		 TestLibraryDetails.noOfBooksTaken();
       	     TestLibraryDetails.fine();
       	     TestLibraryDetails.nextBook();
       	     TestLibraryDetails.todayDate();
    		 break;
    	
    	 case "2":
    		 System.out.println("Name of the book:");
    		 String book=sc.nextLine();
    		 System.out.println("book:"+book);
    		 System.out.println("Name of the category:");
    		 String category=sc.nextLine();
    		 System.out.println("Category:"+category);
    		 TestLibraryDetails.returnDate();
    		 System.out.println("Book returned");
    		 break;
    		  //String date = TestLibraryDetails.returnDate();
    		 //System.out.println(date);
    	 
    	 case "3":
    		 TestLibraryDetails.category();
    		 System.out.println("They take one book for reading inside the library");
    		 System.out.println("They donot take books or return books"); 
    		 break;
    	 
        }
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
    			 if(historicalFictionOption>0 && historicalFictionOption<=3)
    			 {
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
    			 else if(historicalFictionOption==3)
    			 {
    				 String book3="The Nightingale";
   				     System.out.println("Book Name"+book3); 
   				     bookCount=10;
 				     System.out.println("no of "+book3+" books available are: "+bookCount); 
    			 }
    	         
    			 }
    			 else {
    				 System.out.println("Error");
    			 }
    			 break;
             case "b":
            	 System.out.println(" Fantasy:\n 1.Jade City\n 2.Tigana\n 3.The Night Circus");
            	 System.out.println("Enter an option:");
            	 int fantasy=sc.nextInt();
    			 System.out.println(fantasy);
    			 if(fantasy>0 && fantasy<=3)
    			 {
    			 if(fantasy==1) 
    			 {
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
    			 
    			 }
    			 else
    			 {
    				 System.out.println("error");
    			 }
    			 break; 
    	     case "c":
    	    	 System.out.println(" Mystery:\n 1.Gone Girl\n 2.The Girl with the Dragon\n");
    	    	 System.out.println("Enter an option:");
    	    	 int mystery=sc.nextInt();
    			 System.out.println(mystery);
    			 if(mystery>0 && mystery<=2)
    			 {
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
    			 
    			 }
    			 else
    			 {
    				 System.out.println("error");
    			 }
    			 break;
    	     case "d":
    	    	 System.out.println("Comics:\n 1.The Sand Man\n 2.Watchmen\n");
    	    	 System.out.println("Enter an option:");
    	    	 int comics=sc.nextInt();
			     System.out.println(comics);
			     if(comics>0 && comics<=2)
			     {
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
			     
			     }
			     else
			     {
			    	 System.out.println("error");
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
      public static String returnDate()
      {
    	  Date bookReturnDate=new Date();
    	  SimpleDateFormat formatting=new SimpleDateFormat("dd MMMM yyyy");
    	  String bookReturnDateString= formatting.format(bookReturnDate);
    	  System.out.println("Book Return Date:"+bookReturnDateString);
		  return bookReturnDateString;  
      }
      public static char nextBook()
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("do you want any other books?(Y/N):");
    	  char nextBook=sc.next().charAt(0);
    	  if(nextBook=='Y' || nextBook=='N')
    	  {
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
  
      libraryDetails.setLibraryCardNumber(TestLibraryDetails.libraryCardNumber());
      libraryDetails.setPurpose(TestLibraryDetails.purpose());
      
      System.out.println("Library Card Number:"+libraryDetails.getLibraryCardNumber());
      System.out.println("Purpose:"+libraryDetails.getPurpose());
      
      System.out.println("Thanks for using our library");
     
}
}