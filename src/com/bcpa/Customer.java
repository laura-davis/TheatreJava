package com.bcpa;

import java.util.Scanner;

public class Customer {

    protected String firstName, lastName, address;
    Scanner scanner = new Scanner(System.in);

    // constructor
    public Customer(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // change name of method - to do
    void getLogin() {
        String username = "";
        String password = "";
        System.out.println("----------------------- Log In -----------------------\n");
        System.out.println("Welcome to the Bucks Centre for the Performing Arts ticket purchasing system!\n");
        System.out.println("Please log in.\n");
        do {
            // add more validation? - to do
            System.out.println("Your username should be no more than 10 characters long.\nEnter username: ");
            username = scanner.next();
        } while (username.length() > 10);

        do {
            // add more validation? - to do
            System.out.println("Your password should be no more than 10 characters long.\nEnter password: ");
            password = scanner.next();
        } while (password.length() > 10);
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    String fullName =  firstName + " " + lastName;

    void getProfileInfo() {
        // to do
    }

    void getPaymentInfo() {
        // to do
    }
}
