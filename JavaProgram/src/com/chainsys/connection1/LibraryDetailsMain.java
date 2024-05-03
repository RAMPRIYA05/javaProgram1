package com.chainsys.connection1;
import java.sql.SQLException;

import com.chainsys.project.LibraryDetailsImplementation;

public class LibraryDetailsMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
	libraryDetails.details();
	Library library=new Library();
	library.libraryLogin();
	
	}

}
