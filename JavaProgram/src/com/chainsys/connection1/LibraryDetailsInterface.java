package com.chainsys.connection1;

import java.time.LocalDate;

public interface LibraryDetailsInterface
{
		 public String role();
		 public int generateLibraryCardNumber();
		 public String generatePassword();
		 public int cardNumber();
		 public String libraryPassword();
		 public String purpose();
		 public String category();
		 public int noOfBooksTakenDetails();
		 public void fineDetails();
		 public LocalDate todayDate();
		 public LocalDate returnDate();
		 public char nextBookDetails();
		 public void details();

}