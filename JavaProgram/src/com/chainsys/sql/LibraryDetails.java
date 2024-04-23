package com.chainsys.sql;

public class LibraryDetails {
     public LibraryDetails(){
    	 
     }
     public String userName;
     public int booksAvailable;
     public String bookName;
     public String authorName;
     public int numberOfBooksTaken;
     public int libraryCardNumber;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBooksAvailable() {
		return booksAvailable;
	}
	public void setBooksAvailable(int booksAvailable) {
		this.booksAvailable = booksAvailable;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getNumberOfBooksTaken() {
		return numberOfBooksTaken;
	}
	public void setNumberOfBooksTaken(int numberOfBooksTaken) {
		this.numberOfBooksTaken = numberOfBooksTaken;
	}
	public int getLibraryCardNumber() {
		return libraryCardNumber;
	}
	public void setLibraryCardNumber(int libraryCardNumber) {
		this.libraryCardNumber = libraryCardNumber;
	}
	@Override
	public String toString() {
		return "LibraryDetails [userName=" + userName + ", booksAvailable=" + booksAvailable + ", bookName=" + bookName
				+ ", authorName=" + authorName + ", numberOfBooksTaken=" + numberOfBooksTaken + ", libraryCardNumber="
				+ libraryCardNumber + "]";
	}
     
     
     
}
