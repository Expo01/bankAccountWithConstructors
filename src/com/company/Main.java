package com.company;

public class Main {

    public static void main(String[] args) {
        Account savings = new Account("Harry", "harry.com", 123456789 );
        System.out.println(savings.getAccountBalance());
        savings.depositFunds(100);
        savings.withdrawalFunds(200);
        savings.withdrawalFunds(  1);
        System.out.println("=============");

        Account bob = new Account(1245, 50, "bob", "bob.com", 123456789);
        System.out.println(bob.getAccountBalance());
        System.out.println(bob.getCustomerEmail());
        System.out.println(bob.getPhoneNumber());
        System.out.println(bob.getAccountNumber());
        System.out.println(bob.getCustomerName());
    }
}
