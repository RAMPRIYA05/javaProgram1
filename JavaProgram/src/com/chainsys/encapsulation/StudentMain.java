package com.chainsys.encapsulation;

import java.net.Socket;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentMain {

	
	  public static String name1() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Name:");
        String name=sc.next();
        Pattern p=Pattern.compile("[A-Z][a-z]");
        Matcher m=p.matcher(name);
        if(m.find())
        {	
           //System.out.println(name);
        	return name;
        }
           else
           {
        	System.out.println("Error");
        	StudentMain.name1();
           }
		return name;
		
	  }
	  
	  public static String address1() {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Address:");
	        String address=sc.next();
	        Pattern p=Pattern.compile("[A-Z][a-z]");
	        Matcher m=p.matcher(address);
	        if(m.find())
	        {	
	        	return address;
	        	
	        }
	           else
	           {
	        	System.out.println("Error");
	        	StudentMain.address1();
	        	
	           }
			return address;
			
		  }
	  public static String emailId1() {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Emailid:");
	        String emailId=sc.next();
	        Pattern p=Pattern.compile("^[a-z0-9+_.-]+@+(.+)$");
	        Matcher m=p.matcher(emailId);
	        if(m.find())
	        {	
	        	return emailId;
	        	
	        }
	           else
	           {
	        	System.out.println("Error");
	        	StudentMain.emailId1();
	        	
	           }
			return emailId;
			
		  }
	  
	  public static String id1() {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Id:");
	        String id=sc.next();
	        Pattern p=Pattern.compile("^[0-9a-z]");
	        Matcher m=p.matcher(id);
	        if(m.find())
	        {	
	        	return id;
	        	
	        }
	           else
	           {
	        	System.out.println("Error");
	        	StudentMain.id1();
	        	
	           }
			return id;
			
		  }
	  
        public static void main(String[] args) {
        	Student student=new Student();
            student.setName(StudentMain.name1());
            student.setId(StudentMain.id1());
            student.setAddress(StudentMain.address1());
            student.setEmailId(StudentMain.emailId1());
            System.out.println(student.getName());
            System.out.println(student.getAddress());
            System.out.println(student.getEmailId());
            System.out.println(student.getId());
        
	}

}
