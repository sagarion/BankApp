/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

import java.util.ArrayList;

/**
 *
 * @author thibault.daucourt
 */
public class Bank {
    int number;
    String name;
    ArrayList<Customer> customers;
    ArrayList<Account> accounts;

    public Bank() {
    }

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Customer getCustomerByNumber(int Number){
        Customer CustomerReturned = new Customer(-1,"inconnu","inconnu");
        int index = 0;
        
        while(CustomerReturned.getNumber() == -1 && index < customers.size()){
            if (number == customers.get(index).getNumber()) {
                CustomerReturned = customers.get(index);
            }
            index += 1;
        }
        
        return CustomerReturned;
    }
    
    public Account getAccountrByNumber(String Number){
        Account AccountReturned = new Account("inconnu","inconnu",-1, new Customer(-1,"inconnu","inconnu"));
        int index = 0;
        
        while(AccountReturned.getNumber() == "inconnu" && index < accounts.size()){
            if (Number == accounts.get(index).getNumber()) {
                AccountReturned = accounts.get(index);
            }
            index += 1;
        }
        
        return AccountReturned;
    }
    
    
    public void addCustomer(int number, String fn, String ln){
        customers.add(new Customer(number, fn, ln));
    }
    
    public void addAccount(String number, String name, double rate, Customer customer) {
        if (getCustomerByNumber(customer.getNumber()) == customer) {
            customer.addAccount(number, name, rate);
            accounts.add(new Account(number, name, rate, customer));
        }else
            System.out.println("!! An Account can only be added to a Customer already registered !!");
    }
}
