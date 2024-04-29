package com.chainsys.project;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class LibraryDetailsImplementation implements LibraryDetailsInterface{
	static LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
  static LibraryDetailsPojo pojo=new LibraryDetailsPojo();
	public static  int bookCount;
	public static String purpose;
	public static int age;
	public static int membershipPackage;
	public static int newLibraryCardNumber;
	public static int day;
	static int fineAmount;
    static int fine;
    static int libraryCardNumber;
    static String option;
    static int noOfBooksTaken;
    static String user;
    static char nextBook;
    
	@Override
	public String role() 
	{
		//LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
		Scanner sc=new Scanner(System.in);
   	 System.out.println("Type of users:");
   	 System.out.println(" 1.membership\n 2.non-membership\n");
   	 System.out.println("User(1/2):");
   	 String user=sc.next();
   	 Pattern p=Pattern.compile("^[1-2]$");
        Matcher m=p.matcher(user);
        if(m.find())
        {
       	 switch(user) 
       	 {
       	 case "1":
       		 System.out.println("We are happy because you are member of our library");
       		 System.out.println("**************");
       		libraryDetails.cardNumber();
       		 break;
       	 case "2":
       		 System.out.println("you are non membership of our library.");
       		 System.out.println("You can read books only inside the library.");
       		 System.out.println("if you want to take book to home,you should be a member of our library");
       		 System.out.println("are you willing to apply for membership?(Y/N):");
       		 char apply=sc.next().charAt(0);
       		 //System.out.println("Apply:"+apply);
       		 if(apply=='y' || apply=='n' || apply=='N' || apply=='Y')
       		 {

       		 if(apply=='Y' || apply=='y')
       		 {
       			 System.out.println("we are happy because you are ready to apply for membership.");
       			 System.out.println("Now You have to signup:");
       			 System.out.println("We have different types of offers based on age.");
       			 System.out.println("Enter your age:");
       			 age=sc.nextInt();
       			 String ageString=Integer.toString(age);
           		 Pattern p1=Pattern.compile("^[1-9][0-9]|100$");
           	     Matcher m1=p1.matcher(ageString);
           	     if(m1.find())
           	     {
       			 if(age>=18 && age<=60)
       			 {
       			     System.out.println("we have use different type of membership package.");
       			     System.out.println("package option:1.one year=200 2.two year=350 3.three year=550 4.five year=900");
       			     membershipPackage=sc.nextInt();
       			     if(membershipPackage==1||membershipPackage==2||membershipPackage==3||membershipPackage==4)
       			     {
       			     if(membershipPackage==1)
       			     {
       				     System.out.println("You get one year membership card"); 
       			     }
       			     else if(membershipPackage==2)
       			     {
       				     System.out.println("you get two year membership card");
       	             }
       			     else if(membershipPackage==3)
       			     {
       				     System.out.println("you get three year membership card");
       			     }
       			     else if(membershipPackage==4)
       			     {
       			         System.out.println("you can get golden membership card.It is valid for for five years");	 
       			     }
       			     }
       			     
       			  }
       			  else if((age>=10 && age<18) || age>60)
       			  {
       				 System.out.println("We give offers for minor and senoir citizen.");
       				 System.out.println("package option:1.one year=180 2.two year=330 3.three year=530 4.five year=870");
       				 membershipPackage=sc.nextInt();
       				 if(membershipPackage==1||membershipPackage==2||membershipPackage==3||membershipPackage==4)
       			     {
       				 if(membershipPackage==1)
           			 {
           				System.out.println("You get one year membership card"); 
           			 }
           			 else if(membershipPackage==2)
           			 {
           				 System.out.println("you get two year membership card");
           	
           			 }
           			 else if(membershipPackage==3)
           			 {
           				 System.out.println("you get three year membership card");
           			 }
           			 else if(membershipPackage==4)
           			 {
           			     System.out.println("you get golden membership card.It is valid for for five years");	 
           			 }
       			     }
       				 else
       				 {
       					 System.out.println("error");
       					libraryDetails.role();
       				 }
       			  }
       			 }
       			 else
       			 {
       				 System.out.println("please enter age greater than and equal to 10");
       				 libraryDetails.role();
       			 }
           	  libraryDetails.generateLibraryCardNumber();
       		 }
       		 else if(apply=='N' || apply=='n')
       	     {
       				System.out.println("You can only read books inside the library");  
       				System.out.println("***************");
       		 }
       		 }
       		 else
       	     {
       			 System.out.println("Error..enter (y/Y/N/n)");
       			libraryDetails.role();
       			 }
       			 }
       		 
       	 }
        else
        {
       	 System.out.println("error");
       	libraryDetails.role();
        }
        
		return user;
		
	}
	@Override
	public int generateLibraryCardNumber() {
		// TODO Auto-generated method stub
		//LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
		Scanner sc=new Scanner(System.in);
   	    //System.out.println("Now you have to sign up:");
   	    System.out.println("newLibraryCardNumber="+age+membershipPackage+"12");
   	    libraryDetails.generatePassword();
		return newLibraryCardNumber;
	}
	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		{
			 //LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
	    	 Scanner sc=new Scanner(System.in);
	    	 System.out.println("Enter the password:");
	    	 String password=sc.next();
	         Pattern p=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
	         Matcher m=p.matcher(password);
	         
	         if(m.matches())
	         {
	        	 System.out.println("Re-enter your Password:");
	        	 String password1=sc.next();
	        	 //System.out.println("Re-enter your Password:"+password1);
	             System.out.println("Successfully signed up");
	             System.out.println("*************************");
	             System.out.println("Log in");
	   	         libraryDetails.cardNumber();
	         }
	         else 
	         {
	        	System.out.println("error");
	   	        System.out.println("Please enter atleast one uppercase,digit,lowercase,special character,atleast 8 characters & atmost 20 characters");
	            libraryDetails.generatePassword();
	         }
	         
	        
			return password;
			
		
	}
	
	
	
  
}
	@Override
	public int cardNumber() {
		// TODO Auto-generated method stub
		    //LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
		    Scanner sc=new Scanner(System.in);
	        System.out.println("Library CardNumber Of User:");
	        libraryCardNumber=sc.nextInt();
	        String cardNumber=Integer.toString(libraryCardNumber);
	        Pattern p=Pattern.compile("^[0-9]{5}$");
	        Matcher m=p.matcher(cardNumber);
	        if(m.find())
	        {	
	        	System.out.println(libraryCardNumber);
	        	
	        	//card=Integer.parseInt(libraryCardNumber);
	        	libraryDetails.libraryPassword();
	        }
	        else
	        {
	        	System.out.println("Error");
	        	System.out.println("card number holds 5 digits");
	    	    libraryDetails.cardNumber();
	    	    
	        }
		    return libraryCardNumber ;  
		
		
	}
	@Override
	public String libraryPassword() {
		// TODO Auto-generated method stub
		 //LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
		 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the password:");
    	 String password=sc.next();
         Pattern p=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
         Matcher m=p.matcher(password);
         
         if(m.matches())
         {
   	       System.out.println("Correct password");
   	       System.out.println("Welcome to our Library");
   	       System.out.println("*******************************");
   	       libraryDetails.purpose();
         }
         else 
         {
        	System.out.println("error");
   	        System.out.println("Please enter atleast one uppercase,digit,lowercase,special character,atleast 8 characters & atmost 20 characters");
            libraryDetails.libraryPassword();
         }
		return password;
		
	}
	@Override
	public String purpose() {
		// TODO Auto-generated method stub
		//LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
   	 Scanner sc=new Scanner(System.in);
 	
   	 System.out.println("Types of person in library:");
   	 System.out.println(" 1.Booktaken\n 2.BookReturn\n 3.Bookreaders inside a library");
   	 System.out.println("Choose anyone option(1/2/3):");
   	 purpose=sc.next();
   	 sc.nextLine();
   	 //System.out.println("purpose:"+purpose);
   	 Pattern p=Pattern.compile("^[1-3]+$");
        Matcher m=p.matcher(purpose);
        if(m.find())
        {
   	 switch(purpose)
   	 {
   	 case "1":
   		
   		 libraryDetails.category();
   		 libraryDetails.noOfBooksTakenDetails();
      	 libraryDetails.fineDetails();
      	 libraryDetails.todayDate();
      	 libraryDetails.nextBookDetails();
   		 break;
   	
   	 case "2":
   		 System.out.println("Name of the book:");
   		 String book=sc.nextLine();
   		 System.out.println("book:"+book);
   		 System.out.println("Name of the category:");
   		 String category=sc.nextLine();
   		 System.out.println("Category:"+category);
   		 libraryDetails.fineDetails();
   		 libraryDetails.returnDate();
   		 System.out.println("Book returned");
   		 break;
   		  //String date = TestLibraryDetails.returnDate();
   		 //System.out.println(date);
   	 
   	 case "3":
   		 libraryDetails.category();
   		 System.out.println("They take books for reading inside the library");
   		 System.out.println("They donot take books or return books"); 
   		 break;
   	 
       }
        }
        else
        {
             System.out.println("Error...choose an option(1/2/3)");
             libraryDetails.purpose();
        }
		 return purpose;	
    
	}
	@Override
	public String category() {
		// TODO Auto-generated method stub
	 //LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
	 Scanner sc=new Scanner(System.in);
   	 //String category=sc.next();
   	 System.out.println("These are the category in our library:");
   	 System.out.println(" a.Historical Fiction\n b.Fantasy\n c.Mystery\n d.Comics");
   	 System.out.println("choose any one category:");
   	 option=sc.next();
   	 Pattern p=Pattern.compile("^[a-d]$");
        Matcher m=p.matcher(option);
        if(m.find())
        {
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
   				 System.out.println("Book Name:"+book1);
   				 bookCount=5;
   				 System.out.println("no of "+book1+" books available are: "+bookCount); 
   			     
   			 }
   			 else if(historicalFictionOption==2)
   			 {
   				  String book2="All the Light We Cannot See";
   				  System.out.println("Book Name:"+book2); 
   			      System.out.println("This book available after 27/04/2024");
   			      System.out.println("you have to wait or choose other book");
   			      libraryDetails.category();
   			 }
   			 else if(historicalFictionOption==3)
   			 {
   				 String book3="The Nightingale";
  				     System.out.println("Book Name:"+book3); 
  				     bookCount=10;
				     System.out.println("no of "+book3+" books available are: "+bookCount); 
   			 }
   	         
   			 }
   			 else {
   				 System.out.println("Error");
   				 libraryDetails.category();
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
   				 System.out.println("Book Name:"+book1);
   				 bookCount=15;
   				 System.out.println("no of "+book1+" books available are: "+bookCount); 
   			 }
   			 else if(fantasy==2)
   			 { 
   				  String book2="Tigana";
   				  System.out.println("Book Name:"+book2);
   			      System.out.println("This book available after 27/04/2024");
   			      System.out.println("you have to wait or choose other book");
   			      libraryDetails.category();
   			 }
   			 else if(fantasy==3)
   			 {
   				 String book3="The Night Circus";
  				     System.out.println("Book Name:"+book3);
  				     bookCount=3;
				     System.out.println("no of "+book3+" books available are: "+bookCount);
   			 }
   			 
   			 }
   			 else
   			 {
   				 System.out.println("error");
   				 libraryDetails.category();
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
   				 System.out.println("Book Name:"+book1);
   				 bookCount=10;
   				 System.out.println("no of "+book1+" books available are: "+bookCount); 
   			 }
   			 else if(mystery==2)
   			 {
   		         String book2="The Girl with the Dragon";
   		         System.out.println("Book Name:"+book2);
   		         System.out.println("This book available after 03/05/2024");
  			     System.out.println("you have to wait or choose other book");
  			     libraryDetails.category();
  			         
   			 } 
   			 
   			 }
   			 else
   			 {
   				 System.out.println("error");
   				 libraryDetails.category();
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
			    	 System.out.println("Book Name:"+book1);
			    	 bookCount=20;
   				 System.out.println("no of "+book1+" books available are: "+bookCount); 
			     }
			     else if(comics==2)
   			 {
   		         String book2="Watchmen";
   		         System.out.println("Book Name:"+book2);
   		         System.out.println("This book available after 09/05/2024");
  			         System.out.println("you have to wait or choose other book");
  			         libraryDetails.category();
  			      }
			     
			     }
			     else
			     {
			    	 System.out.println("error");
			    	 libraryDetails.category();
			     }
			     break;
   	 }
        }
        else
        {
       	 System.out.println("error");
       	 libraryDetails.category();
        }
		return option;

		
	}
	@Override
	public int noOfBooksTakenDetails() {
		// TODO Auto-generated method stub
		//LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
		Scanner sc=new Scanner(System.in);
        System.out.println("Number of books taken by user:");
        noOfBooksTaken=sc.nextInt();
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
   	 	   System.out.println("*******************************");
   	 	   System.out.println("How many days after you return the book?");
    	   System.out.println("If You return the book within 15 days.Then no fine");
       	   
       	 }
       	 else
       	 {
       		 System.out.println("enter no of books less than book available");
       		 libraryDetails.noOfBooksTakenDetails();
       	 }
			}
        
        else
        {
    	    System.out.println("Error");
    	    libraryDetails.noOfBooksTakenDetails();
        }
        
	    return noOfBooksTaken;
	
	}
	@Override
	public void fineDetails() {
		// TODO Auto-generated method stub
		//LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
		Scanner sc=new Scanner(System.in);
  	  
  	  System.out.println("Please enter the days.It will show fine is applicable or not.");
  	  day=sc.nextInt();
  	  
  	  if(day>0) 
  	  {
  	  if(day<=15) {
  		  System.out.println("No fine.You return book on time");
  		  fine=0;
  	  }
  	  else if(day>15 && day<=20)
  	  {
  		  System.out.println("You should pay fine rs.50");
  		  fine=50;
  		  System.out.println("fine"+fine);
  	  }
  	  else if(day>20 && day<=30)
  	  {
  		  System.out.println("You should pay fine rs.100");
  		  fine=100;
  		  System.out.println("fine"+fine);
  	  }
  	  else if(day>30)
  	  {
  		  System.out.println("You should pay fine rs.10 per day");
  		  fine=10*day;
  	  }
  	         	       
  	     fineAmount=fine+fineAmount;
  	     System.out.println("Total Fine:"+fineAmount);
  	  }
  	  
  	  else 
  	  {
  		  System.out.println("Error");
  		  libraryDetails.fineDetails();
  	  }
		
		
	}
	@Override
	public LocalDate todayDate() {
		// TODO Auto-generated method stub
		//LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
		LocalDate today =  LocalDate.now();             
  	    LocalDate bookReturnDate= today.plusDays(day); 
  	    System.out.println("Book taken date:"+today);
  	    System.out.println("Book will return on: "+bookReturnDate);
		return bookReturnDate;
		
	}
	@Override
	public LocalDate returnDate() {
		// TODO Auto-generated method stub
		//LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
		LocalDate bookReturnDate=LocalDate.now();
  	    LocalDate bookTakenDate=bookReturnDate.minusDays(day);
  	    System.out.println("Book Taken Date:"+bookTakenDate);
  	    System.out.println("Book Return Date:"+bookReturnDate);
		return bookTakenDate;
	}
	@Override
	public char nextBookDetails() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
  	  System.out.println("********************************");
  	  System.out.println("do you want any other books?(Y/N):");
  	  nextBook=sc.next().charAt(0);
  	  if(nextBook=='Y' || nextBook=='y' || nextBook=='n' || nextBook=='N')
  	  {
  	  if(nextBook=='Y' || nextBook=='y')
  	  {
  		  System.out.println("now you can select next book:");
		      libraryDetails.category();
		      libraryDetails.noOfBooksTakenDetails();
		      libraryDetails.fineDetails();
		      libraryDetails.nextBookDetails();   
  	  }
  	  else if(nextBook=='N'|| nextBook=='n')
  	  {
  		  System.out.println("Thank you for visiting our library");
  		  System.out.println("********************************");
  	  }
  	  }
  	  else
  	  {
  		  System.out.println("please enter the correct input");
  		  libraryDetails.nextBookDetails();
  	  }
  	  return nextBook;
	}
	@Override
	public void details() {
		
		// TODO Auto-generated method stub
		pojo.setRole(libraryDetails.role());
		pojo.setLibraryCardNumber(libraryCardNumber);
		pojo.setPurpose(purpose);
		pojo.setOption(option);
		pojo.setCategory(option);
		pojo.setNoOfBooksTaken(noOfBooksTaken);
		pojo.setNextBook(nextBook);
		
		System.out.println("Type of user:"+pojo.getRole());
		System.out.println("Library Card Number:"+pojo.getLibraryCardNumber());
		System.out.println("Purpose:"+pojo.getPurpose());
		System.out.println("Option"+pojo.getOption());
		System.out.println("Option:"+pojo.getCategory());
		System.out.println("No of Books Taken:"+pojo.getNoOfBooksTaken());
		System.out.println("NextBook:"+pojo.getNextBook());
		
	}
	
	
}