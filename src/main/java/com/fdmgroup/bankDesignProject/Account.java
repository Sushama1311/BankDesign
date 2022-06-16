package com.fdmgroup.bankDesignProject;

public abstract class Account {

	private final long ACCOUNT_ID;
	private static long nextAccountId = 1000;
	protected double balance;

	public Account() {

		if (nextAccountId > 1000) {

			this.ACCOUNT_ID = nextAccountId;

		} else {
			this.ACCOUNT_ID = nextAccountId;
		}
		nextAccountId = nextAccountId + 5;
		
		//this.balance=balance;
	}

	public double withdraw(double amount) {
		// this.balance = this.getBalance() - amount; -->This is also correct
		
		this.balance = this.balance - amount;
		return amount;
	}

	public void deposit(double amount) {
		this.balance = amount;
	}

	public void correctBalance(double amount) {

		this.balance = amount;

	}

	public long getACCOUNT_ID() {

		return this.ACCOUNT_ID;

	}

	public double getBalance() {

		return this.balance;
	}

}
