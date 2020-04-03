package com.bcpa;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        // to do - customer interface?
        customer.login();
        customer.getProfileInfo();
        customer.mainMenu(customer);


    }
}
