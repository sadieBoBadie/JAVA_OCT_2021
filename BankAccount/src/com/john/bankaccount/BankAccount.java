package com.john.bankaccount;

public class BankAccount {
//	(double) checking balance, (double) savings balance.
	private double checkingBalance;
	private double savingsBalance;
	private static int numberOfAccounts = 0;
	private static double totalDeposits;
	
	public BankAccount() {
		numberOfAccounts++;
	}
	
//	methods ------------
	public void depositSavings(double amount) {
//		this.savingsBalance += amount;
		this.setSavingsBalance(this.getSavingsBalance() + amount);
		setTotalDeposits(this.getTotalDeposits() + amount);
	}
	public void depositCheckings(double money) {
		this.setCheckingBalance(this.getCheckingBalance() + money );
		setTotalDeposits(this.getTotalDeposits() + money);
	}
	
	public double seeBalance() { 
		System.out.println("total money = $" + (this.getCheckingBalance() + this.getSavingsBalance()));
		return this.getTotalDeposits();
	}
	
//	Create a method to withdraw money from one balance. 
//	Do not allow them to withdraw money if there are insufficient funds.
	public double withdrawSavings(double amount) {
		if (this.getSavingsBalance() > amount) {
			this.setSavingsBalance(this.getSavingsBalance() - amount);
		} else {
			System.out.println("insufficent funds to withdraw");
		}
		System.out.printf("you now have: $%.2f", this.getSavingsBalance());
		return this.getSavingsBalance();
	}

	
	
	
	
	
	
//	---- GETTERS AND SETTERS -----
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static void setNumberOfAccounts(int numberOfAccounts) {
		BankAccount.numberOfAccounts = numberOfAccounts;
	}

	public static double getTotalDeposits() {
		return totalDeposits;
	}

	public static void setTotalDeposits(double totalDeposits) {
		BankAccount.totalDeposits = totalDeposits;
	}
	
	
	
	
	
	

	
	
}
