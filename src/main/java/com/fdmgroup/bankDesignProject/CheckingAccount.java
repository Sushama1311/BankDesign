package com.fdmgroup.bankDesignProject;

public class CheckingAccount extends Account{

	private int nextCheckNumber;
	
	
	public void setNextCheckNumber(int nextCheckNumber) {
		this.nextCheckNumber = nextCheckNumber;
	}

	public int getNextCheckNumber() {
		this.nextCheckNumber=this.nextCheckNumber+1;
		return this.nextCheckNumber;
	}
}
