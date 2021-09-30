package com.john.bankaccount;

public class Tester {

	public static void main(String[] args) {
		BankAccount bA = new BankAccount();
		bA.depositCheckings(200.45);
		double money = bA.seeBalance();
		System.out.println(money);
		
		bA.depositSavings(150.45);
		bA.withdrawSavings(100.00);
		
		
		System.out.println("\n number of accoutns: " + BankAccount.getNumberOfAccounts());
	
		BankAccount x = new BankAccount();
		System.out.println("\n number of accoutns: " + BankAccount.getNumberOfAccounts());

	}

}
