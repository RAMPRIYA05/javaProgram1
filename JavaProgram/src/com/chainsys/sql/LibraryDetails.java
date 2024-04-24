package com.chainsys.sql;
public class LibraryDetails {
	
     public LibraryDetails(){
    	 
     }
    
     public int numberOfBooksTaken;
     public int libraryCardNumber;
     public String todayDate;
     public String category;
     public String option;
     public char nextBook;
     public String role;
     public String purpose;
     
     
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
	
	public char getNextBook() {
		return nextBook;
	}
	public void setNextBook(char nextBook) {
		this.nextBook = nextBook;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	@Override
	public String toString() {
		return "LibraryDetails [numberOfBooksTaken=" + numberOfBooksTaken + ", libraryCardNumber=" + libraryCardNumber
				+ ", todayDate=" + todayDate + ", category=" + category + ", option=" + option + ", nextBook="
				+ nextBook + ", role=" + role + ", purpose=" + purpose + "]";
	}
	
	
}
