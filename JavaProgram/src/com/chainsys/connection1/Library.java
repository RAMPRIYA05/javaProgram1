package com.chainsys.connection1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Library 
{
	static LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
    static LibraryDetailsPojo pojo=new LibraryDetailsPojo();
	private static String user;
	private static int libraryCardNumber;
	private static String password;
	private static String purpose;
	private static String bookCategory;
	private static String bookName;
	private static int noOfBooksTaken;
    


    
    
    public static void libraryLogin() throws ClassNotFoundException, SQLException {
    	
          Connection connection = JdbcConnection.getConnection();
          System.out.println(connection);

		
//          pojo.setUser("membership");
//          pojo.setLibraryCardNumber(33112);
//          pojo.setPassword("Rampriya5@");
//          pojo.setPurpose("Book taken");
//          pojo.setBookCategory("Historical Fiction");
//          pojo.setBookName("pachinko");
//          pojo.setNoOfBooksTaken(2);
          pojo.setUser(user);
          pojo.setLibraryCardNumber(libraryCardNumber);
          pojo.setPassword(password);
          pojo.setPurpose(purpose);
          pojo.setBookCategory(bookCategory);
          pojo.setBookName(bookName);
          pojo.setNoOfBooksTaken(noOfBooksTaken);
          String login="insert into library(user,libraryCardNumber,password,purpose,bookCategory,bookName,noOfBooksTaken)values(?,?,?,?,?,?,?)";
          PreparedStatement prepareStatement=connection.prepareStatement(login);
         // prepareStatement.setString(1,pojo.getUser());
          prepareStatement.setString(1,pojo.getUser());
          prepareStatement.setInt(2,pojo.getLibraryCardNumber());
          prepareStatement.setString(3,pojo.getPassword());
          prepareStatement.setString(4,pojo.getPurpose());
          prepareStatement.setString(5,pojo.getBookName());
          prepareStatement.setString(6,pojo.getBookCategory());
          prepareStatement.setInt(7,pojo.getNoOfBooksTaken());
          int rows = prepareStatement.executeUpdate();
          System.out.println(rows);
      
  }

//    public static void libraryBookDetail() throws ClassNotFoundException, SQLException {
//    	 Connection connection = JdbcConnection.getConnection();
//         System.out.println(connection);
//         
//         String BookDetails="insert into library(purpose,bookCategory,noOfBooksTaken)values(?,?,?)";
//         PreparedStatement prepareStatement=connection.prepareStatement(BookDetails);
//        
//         int rows=prepareStatement.executeUpdate();
//         System.out.println(rows);
//    }
    
//
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
    	LibraryDetailsPojo pojo=new LibraryDetailsPojo();
    	Library.libraryLogin();
    	//Library.libraryBookDetail(); 
    }
}