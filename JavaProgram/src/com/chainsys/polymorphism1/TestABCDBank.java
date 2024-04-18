package com.chainsys.polymorphism1;

import java.util.Scanner;
///overriding
public class TestABCDBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner sc=new Scanner(System.in);
             ABCBank bankA=new ABCBank();
             ABCBank bankB=new ABCBank();
             ABCBank bankC=new ABCBank();
             ABCBank bankD=new ABCBank();
             bankA.setLoanInterest(BankA.loanInterest());
             bankB.setLoanInterest(BankB.loanInterest());
             bankC.setLoanInterest(BankC.loanInterest());
             bankD.setLoanInterest(BankD.loanInterest());
             
             System.out.println("Interest Amount bankA:"+bankA.getLoanInterest());
             System.out.println("Interest Amount bankB:"+bankB.getLoanInterest());
             System.out.println("Interest Amount bankC:"+bankC.getLoanInterest());
             System.out.println("Interest Amount bankD:"+bankD.getLoanInterest());
             
             BankA a=new BankA();
             a.details();
             a.displayInfo();
             
             BankB b=new BankB();
             b.details();
             b.displayInfo();
             
             BankC c=new BankC();
             c.details();
             c.displayInfo();
             
             BankD d=new BankD();
             d.details();
             d.displayInfo();
             
             
	}
           
}
