package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {

	private final long CUSTOMER_ID;
	private static long nextCustomerId=2000000 ;
	private String name;
	private String Address;
	private List<Account> accounts;
	
	
	public Customer(String name, String address) {
		super();
		
		this.name = name;
		Address = address;
		
		if (nextCustomerId > 2000000) {

			this.CUSTOMER_ID = nextCustomerId;

		} else {
			this.CUSTOMER_ID = nextCustomerId;
		}
		nextCustomerId = nextCustomerId + 7;
		
		accounts=new ArrayList<Account>();
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
		
	}
	
	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	public abstract void chargeAllAccounts(double amount); 
	
	public List<Account> getAccounts(){
		return accounts;
	}
	public long getCUSTOMER_ID(){
		return this.CUSTOMER_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
