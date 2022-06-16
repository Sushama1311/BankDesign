package com.fdmgroup.bankDesignProject;

import java.util.List;

public class Company extends Customer {

	public Company(String name, String address) {
		super(name, address);

	}

	@Override
	public void chargeAllAccounts(double amount) {

		List<Account> accountList = getAccounts();

		for (Account account : accountList) {
			if (account instanceof CheckingAccount) {
				account.balance = account.getBalance() - amount;
			} else {
				account.balance = account.getBalance() - (amount * 2);
			}

		}
	}

}
