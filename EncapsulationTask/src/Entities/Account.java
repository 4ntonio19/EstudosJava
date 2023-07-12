package Entities;

import java.io.InputStream;

public class Account {
	private String holder;
	private int number;
	private double balance;
	
	public Account(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}
	
	public Account(String holder, int number, double initialDeposit) {
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit);
	}

	public String getName() {
		return holder;
	}

	public void setName(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance +=amount;
	}
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
	
}
