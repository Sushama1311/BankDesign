package com.fdmgroup.bankDesignProject;

public class SavingsAccount extends Account {

	private double interestRate;

	/*@Override
	public double withdraw(double amount) {

		if(getBalance() < amount) {
			return 0;
			
		}
		return amount;
	}*/

	public void addInterest() {
		balance = (balance * interestRate) / 100 + balance;
	}

	public double getInterestRate() {

		return interestRate;
	}

	public void setInterestRate(double rate) {
		interestRate = rate;
	}

}
