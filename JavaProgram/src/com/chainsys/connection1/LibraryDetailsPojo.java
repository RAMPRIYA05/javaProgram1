package com.chainsys.connection1;

public class LibraryDetailsPojo {
 
	public String user;
    public int noOfBooksTaken;
    public int libraryCardNumber;
    public String todayDate;
    public String category;
    public String password;
    public String bookName;
    public String bookCategory;
    public char nextBook;
    public String purpose;
    public String returnDate;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getNoOfBooksTaken() {
		return noOfBooksTaken;
	}
	public void setNoOfBooksTaken(int noOfBooksTaken) {
		this.noOfBooksTaken = noOfBooksTaken;
	}
	public int getLibraryCardNumber() {
		return libraryCardNumber;
	}
	public void setLibraryCardNumber(int libraryCardNumber) {
		this.libraryCardNumber = libraryCardNumber;
	}
	public String getTodayDate() {
		return todayDate;
	}
	public void setTodayDate(String todayDate) {
		this.todayDate = todayDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getNextBook() {
		return nextBook;
	}
	public void setNextBook(char nextBook) {
		this.nextBook = nextBook;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "LibraryDetailsPojo [user=" + user + ", noOfBooksTaken=" + noOfBooksTaken + ", libraryCardNumber="
				+ libraryCardNumber + ", todayDate=" + todayDate + ", category=" + category + ", password=" + password
				+ ", bookName=" + bookName + ", bookCategory=" + bookCategory + ", nextBook=" + nextBook + ", purpose="
				+ purpose + ", returnDate=" + returnDate + "]";
	}
	
	
	
	
}
