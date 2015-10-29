package ch.hearc.ig.odi.customeraccount.business;

public class Account {

	private String number;
	private String name;
	private double balance = 0;
	private double rate = 0.001;
	Customer customer;

	/**
	 * 
	 * @param numer
	 * @param name
	 * @param rate
	 * @param customer
	 */
	public Account(String numer, String name, double rate, Customer customer) {

	}

	/**
	 * 
	 * @param amount
	 */
	public void credit(double amount) {
		// TODO - implement Account.credit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amout
	 */
	public void debit(double amout) {
		// TODO - implement Account.debit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 * @param source
	 * @param target
	 */
	public void transfer(double amount, Account source, Account target) {

	}

	public String getNumber() {
		return this.number;
	}

	/**
	 * 
	 * @param number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return this.balance;
	}

	/**
	 * 
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRate() {
		return this.rate;
	}

	/**
	 * 
	 * @param rate
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

}