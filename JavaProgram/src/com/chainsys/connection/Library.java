package com.chainsys.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Library {
       static Library library=new Library();
	   public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//LibraryPojo libraryPojo=new LibraryPojo();
		//library.insertLibraryDetails();
		library.updateLibraryDetails();
		library.deleteLibraryDetails();
      
	} 
  public static void insertLibraryDetails() throws ClassNotFoundException, SQLException 
  {
	    Connection getConnection=JdbcConnection.getConnection();
		System.out.println(getConnection); 

		String insert="insert into library(libraryCardNumber,category,bookName,numberOfBooksTaken) values(3201,'horror','the sandman',3)";
		
        PreparedStatement prepareStatement=getConnection.prepareStatement(insert);
        int save=prepareStatement.executeUpdate();
        System.out.println(save);   
  }
  public static void updateLibraryDetails() throws ClassNotFoundException, SQLException 
  {
	    Connection getConnection=JdbcConnection.getConnection();
		System.out.println(getConnection); 
		String update="update library set category='mystery' where libraryCardNumber=3201";
       
		PreparedStatement prepareStatement=getConnection.prepareStatement(update);
        int save1=prepareStatement.executeUpdate();
        System.out.println(save1+ "updated");   
  }
  public static void deleteLibraryDetails() throws ClassNotFoundException, SQLException
  {
	  Connection getConnection=JdbcConnection.getConnection();
		System.out.println(getConnection); 
		String delete="delete library from where bookName='the sandman'";
		PreparedStatement prepareStatement=getConnection.prepareStatement(delete);
        int save2=prepareStatement.executeUpdate();
        System.out.println(save2 + "delete");   
  }
}