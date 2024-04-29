package com.chainsys.project;

public class LibraryDetailsPojo {
 
	public String role;
    public int noOfBooksTaken;
    public int libraryCardNumber;
    public String todayDate;
    public String category;
    public String option;
    public char nextBook;
    public String purpose;
    public String returnDate;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public char getNextBook() {
		return nextBook;
	}
	public void setNextBook(char nextBook) {
		this.nextBook = nextBook;
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
		return "LibraryDetailsPojo [role=" + role + ", noOfBooksTaken=" + noOfBooksTaken + ", libraryCardNumber="
				+ libraryCardNumber + ", todayDate=" + todayDate + ", category=" + category + ", option=" + option
				+ ", nextBook=" + nextBook + ", purpose=" + purpose + ", returnDate=" + returnDate + "]";
	}
	
}
