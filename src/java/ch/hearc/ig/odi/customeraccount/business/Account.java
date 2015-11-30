package ch.hearc.ig.odi.customeraccount.business;

public class Account {

	private String number;
	private String name;
	private double balance = 0;
	private double rate = 0.001;
	Customer customer;

    public Account(String number, String name,double rate, Customer customer) {
        this.number = number;
        this.name = name;
        this.rate = rate;
        this.customer = customer;
    }

	/**
	 * 
	 * @param numer
	 * @param name
	 * @param rate
	 * @param customer
	 */
	

	/**
	 * 
	 * @param amount
	 */
	public void credit(double amount) {
		this.setBalance(this.getBalance() + amount);
	}

	/**
	 * 
	 * @param amout
	 */
	public void debit(double amount) {
		this.setBalance(this.getBalance() - amount);
	}

	/**
	 * 
	 * @param amount
	 * @param source
	 * @param target
	 */
	public void transfer(double amount, Account source, Account target) {
            if (source.getBalance()>= amount) {
                target.credit(amount);
                source.debit(amount);
            }else
                System.out.println("!! Erreur blance insuffisante à la source !!");
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
        
        

}