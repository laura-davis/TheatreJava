package com.bcpa;

import java.util.Scanner;

public class Consumer {

    // declare variables
    protected String firstName, lastName, address, cardNumber, expiryDate;

    // initialise scanner to collect user input
    Scanner scanner = new Scanner(System.in);

    // getters
    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getAddress() {
        return address;
    }

    // login
    void login() {
        String username;
        String password;
        System.out.println("----------------------- Log In -----------------------\n");
        System.out.println("Welcome to the Bucks Centre for the Performing Arts ticket purchasing system!\n");
        System.out.println("Please log in.\n");
        do {
            System.out.print("Enter username (your username should be no more than 10 characters long): ");
            username = scanner.next();
        } while (username.length() > 10);
        do {
            System.out.print("Enter password (your password should be no more than 10 characters long): ");
            password = scanner.next();
        } while (password.length() > 10);
    }

    // get consumer to enter their details
    void getUserDetails() {
        System.out.println("\n------------- Enter Profile Information --------------\n");
        System.out.println("As you are a new customer, you must first provide your profile details.\n");
        System.out.print("Enter your first name: ");
        firstName = scanner.next();
        System.out.print("Enter your last name: ");
        lastName = scanner.next();
        System.out.print("Enter your address: ");
        address = scanner.next();
    }

    // get consumer payment details
    void getPaymentDetails() {
        System.out.println("------------- Enter Payment Information --------------\n");
        System.out.print("Enter your card number: ");
        cardNumber = scanner.next();
        System.out.print("Enter expiry date: ");
        expiryDate = scanner.next();
        System.out.println("\nProcessing details . . .\n");
    }
}
