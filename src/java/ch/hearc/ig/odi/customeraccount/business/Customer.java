package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

    private int number;
    private String firstName;
    private String lastName;
    ArrayList<Account> accounts;

    /**
     *
     * @param number
     * @param firstName
     * @param lastName
     */
    public Customer(int number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *
     * @param number
     */
    public Account getAccountByNumber(String number) {
        Account AccountReturned = new Account("inconnu","inconnu",-1, new Customer(-1,"inconnu","inconnu"));
        int index = 0;
        
        while(AccountReturned.getNumber() == "inconnu" && index < accounts.size()){
            if (number == accounts.get(index).getNumber()) {
                AccountReturned = accounts.get(index);
            }
            index += 1;
        }
        
        return AccountReturned;
    }

    /**
     *
     * @param number
     * @param name
     * @param rate
     */
    public void addAccount(String number, String name, double rate) {
        accounts.add(new Account(number, name, rate, this));
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
