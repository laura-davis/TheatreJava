package com.bcpa;

import java.util.Scanner;

public class Consumer {

    // declare variables
    protected String firstName, lastName, address, cardNumber, expiryDate;

    // initialise scanner to collect user input
    Scanner scanner = new Scanner(System.in);

    // constructor with arguments - not used
//    public Consumer(String firstName, String lastName, String address) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.address = address;
//    }

    // constructor without arguments
    public Consumer() {
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

    // setters - not used
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//    public void setAddress(String address) {
//        this.address = address;
//    }

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

    //  allow customer to change their details - not used
//     void changeDetails(Consumer consumer) {
//        char choice;
//        System.out.println("\n--------- View / change profile information ----------\n");
//        System.out.println("Please find your current details below.\n");
//        System.out.println("Full name: " + firstName + " " + lastName + "\n");
//        System.out.println("Address: " + address + "\n");
//        System.out.println("1. Change name");
//        System.out.println("2. Change address");
//        System.out.println("3. Return to main menu\n");
//        do {
//            System.out.print("Please enter a valid menu choice number (1 - 3): ");
//            choice = scanner.next().charAt(0);
//        } while (choice != '1' && choice != '2' && choice != '3');
//        if (choice == '1') {
//            System.out.print("Enter your first name: ");
//            firstName = scanner.next();
//            System.out.print("Enter your last name: ");
//            lastName = scanner.next();
//            changeDetails(consumer);
//        } else if (choice == '2') {
//            System.out.print("Enter your address: ");
//            address = scanner.next();
//            changeDetails(consumer);
//        } else if (choice == '3') {
//            mainMenu();
//        }
//    }

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