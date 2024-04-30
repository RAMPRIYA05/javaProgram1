package com.chainsys.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  
	{
		Connection getConnection=getConnection();
		System.out.println(getConnection); 
		// TODO Auto-generated method stub
          
          
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydetail","root", "Rampriya5@");
		
		return connection;
	}
}
