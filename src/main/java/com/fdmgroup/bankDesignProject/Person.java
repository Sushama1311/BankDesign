package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class Person extends Customer {

	public Person(String name, String address) {
		super(name, address);
		
	}

	@Override
	public void chargeAllAccounts(double amount) {
		List<Account>allCustomers=getAccounts();
		for(Account account : allCustomers) {
			
			account.balance=account.balance-amount;
		}
	}

}
