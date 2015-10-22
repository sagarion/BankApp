package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

	private int number;
	private String firstName;
	private String lastName;
	Collection<Account> accounts;

	/**
	 * 
	 * @param number
	 * @param firstName
	 * @param lastName
	 */
	public Customer(Integer number, String firstName, String lastName) {
		// TODO - implement Customer.Customer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 */
	public Account getAccountByNumber(String number) {

	}

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 */
	public void addAccount(String number, String name, double rate) {
		// TODO - implement Customer.addAccount
		throw new UnsupportedOperationException();
	}

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getNumber() {
		return this.number;
	}

	/**
	 * 
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

}