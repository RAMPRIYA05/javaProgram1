package com.chainsys.polymorphism1;
import java.util.Scanner;
public abstract class BankE{
	public static int interest;
	
	 public void details() {
			System.out.println("Details of BankE");
		}
		public void displayInfo() {
			System.out.println("Display amount of BankE:");
		   }
		
		public abstract  int loanInterest();

}
