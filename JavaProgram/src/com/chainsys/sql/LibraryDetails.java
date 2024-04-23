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
     public String todayDate;
     public String category;
     public String option;
//     public int fine;
	 public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
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
	public void setLibraryCardNumber(int i) {
		this.libraryCardNumber = i;
	}
	
	
	public String getTodayDate() {
		return todayDate;
	}
	public void setTodayDate(String todayDate) {
		this.todayDate = todayDate;
	}
	
	@Override
	public String toString() {
		return "LibraryDetails [userName=" + userName + ", booksAvailable=" + booksAvailable + ", bookName=" + bookName
				+ ", authorName=" + authorName + ", numberOfBooksTaken=" + numberOfBooksTaken + ", libraryCardNumber="
				+ libraryCardNumber + ", todayDate=" + todayDate + ", category=" + category + ", option=" + option
				+ "]";
	}
	
	
	
}
