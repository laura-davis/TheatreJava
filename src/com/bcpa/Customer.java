package com.bcpa;

import java.util.Scanner;

public class Customer {

    protected String firstName, lastName, address, cardNumber, expiryDate;
    Scanner scanner = new Scanner(System.in);

    // constructor with arguments
    public Customer(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // constructor without arguments
    public Customer() {
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

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    void getProfileInfo() {
        System.out.println("\n------------- Enter profile information --------------\n");
        System.out.println("As you are a new customer, you must first provide your profile details.\n");
        System.out.print("Enter your first name: ");
        firstName = scanner.next();
        System.out.print("Enter your last name: ");
        lastName = scanner.next();
        System.out.print("Enter your address: ");
        address = scanner.next();
    }

    void changeDetails(Customer customer) {
        char choice;
        System.out.println("\n--------- View / change profile information ----------\n");
        System.out.println("Please find your current details below.\n");
        System.out.println("Full name: " + firstName + " " + lastName + "\n");
        System.out.println("Address: " + address + "\n");
        System.out.println("1. Change name");
        System.out.println("2. Change address");
        System.out.println("3. Return to main menu\n");

        do {
            System.out.print("Please enter a valid menu choice number (1 - 3): ");
            choice = scanner.next().charAt(0);
        } while (choice != '1' && choice != '2' && choice != '3');

        if (choice == '1') {
            System.out.print("Enter your first name: ");
            firstName = scanner.next();
            System.out.print("Enter your last name: ");
            lastName = scanner.next();
            changeDetails(customer);
        } else if (choice == '2') {
            System.out.print("Enter your address: ");
            address = scanner.next();
            changeDetails(customer);
        } else if (choice == '3') {
            mainMenu(customer);
        }
    }

    void getPaymentInfo() {
        System.out.println("\n------------- Enter payment information --------------\n");
        System.out.print("Enter your card number: ");
        cardNumber = scanner.next();
        System.out.print("Enter expiry date: ");
        expiryDate = scanner.next();
        System.out.println("\nProcessing details . . .");
    }

    // change name of method - to do
    void login() {
        String username;
        String password;
        System.out.println("----------------------- Log In -----------------------\n");
        System.out.println("Welcome to the Bucks Centre for the Performing Arts ticket purchasing system!\n");
        System.out.println("Please log in.\n");

        do {
            // add more validation? - to do
            System.out.println("Enter username (your username should be no more than 10 characters long): ");
            username = scanner.next();
        } while (username.length() > 10);

        do {
            // add more validation? - to do
            System.out.println("\nEnter password (your password should be no more than 10 characters long): ");
            password = scanner.next();
        } while (password.length() > 10);
    }

    void mainMenu(Customer customer) {
        // change wording / format? - to do
        char choice;

        System.out.println("\n--------------------- Main Menu ----------------------\n");
        System.out.println("1. Buy tickets for upcoming shows");
        System.out.println("2. View / change profile information");
        System.out.println("3. Log out\n");

        do {
            System.out.print("Please enter a valid menu choice number (1 - 3): ");
            choice = scanner.next().charAt(0);
        } while (choice != '1' && choice != '2' && choice != '3');

        if (choice == '1') {
            // to do - show interface?
            Show show = new Show();
            show.selectShowName();
            show.selectShowDate();
            show.selectShowTime();
            }

        if (choice == '2') {
            // change details - to do
            customer.changeDetails(customer);
        }

        if (choice == '3') {
            System.out.print("\nYou have been successfully logged out.\n");
        }
    }
}
