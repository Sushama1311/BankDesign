package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class AccountController {

	private List<Customer> customers;
	private List<Account> accounts;

	public AccountController() {
		super();
		customers = new ArrayList<Customer>();
		accounts = new ArrayList<Account>();
	}

	public Customer createCustomer(String name, String address, String type) {
		if (type.equals("person")) {
			Person person1 = new Person(name, address);
			customers.add(person1);

		} else if (type.equals("company")) {
			Company customer = new Company(name, address);
			customers.add(customer);
		}
		return (Customer) customers;

		// return null;
	}

	public Account createAccount(Customer customer, String type) {

		if (type.equals("checking")) {
			CheckingAccount checkingAccount1 = new CheckingAccount();
			accounts.add(checkingAccount1);
			customers.add(customer);
		} else if (type.equals("savings")) {
			SavingsAccount savingAccount1 = new SavingsAccount();
			accounts.add(savingAccount1);
			customers.add(customer);
		}
		return (Account) accounts;

	}

	public void removeAccount(Account account) {

		accounts.remove(account);
		customers.remove(account);
	}

	public void removeCustomer(Customer customer) {
		customers.remove(customer);
		accounts.remove(customer);

	}

	public List<Customer> getCustomers() {

		return customers;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

}
