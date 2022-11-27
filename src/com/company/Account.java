package com.company;

public class Account {

    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    public Account(int accountNumber, int accountBalance, String customerName, String customerEmail, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String customerEmail, int phoneNumber) {
        //overloaded constructor that has different number of parameters (or different types)
        this(9999,1000, customerName, customerEmail, phoneNumber);
        // "this" keyword calls another constructor, so we don't need the elongated format for assigning fields
        // just includes the hard code of account number and account balance
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int depositAmount) {
        accountBalance += depositAmount;
        System.out.println("your account balance is now " + accountBalance + " after deposit amount of " + depositAmount);
    }

    public void withdrawalFunds(int withdrawalAmount) {
        if (withdrawalAmount > accountBalance) {
            System.out.println("insufficient funds to withdraw " + withdrawalAmount + "dollars");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("your account balance is now " + accountBalance + " after withdrawal of " + withdrawalAmount + " dollars");
        }
    }
}
