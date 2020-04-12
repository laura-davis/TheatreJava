package com.bcpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // initialise variables
        String a, b, c, f, g, h;
        int d;
        double e;
        char choice;

        // initialise scanner to collect user input
        Scanner scanner = new Scanner(System.in);

        // create consumer object
        Consumer consumer = new Consumer();

        // collect and set consumer attributes
        consumer.login();
        consumer.getUserDetails();
        f = consumer.getFirstName();
        g = consumer.getLastName();
        h = consumer.getAddress();

        // display main menu
        System.out.println("\n--------------------- Main Menu ----------------------\n");
        System.out.println("1. Buy tickets for upcoming shows");
        System.out.println("2. Log out\n");
        do {
            System.out.print("Please enter a valid menu choice number (1 - 2): ");
            choice = scanner.next().charAt(0);
        }
        while (choice != '1' && choice != '2');
        if (choice == '2') {
            System.out.print("\nYou have been successfully logged out.\n");
        }

        do {
            // create show object
            Show show = new Show();

            // call show methods
            a = show.selectShowName();
            b = show.selectShowDate();
            c = show.selectShowTime();
            do {
                System.out.print("Are you happy with your choice? Y = Yes / N = No: ");
                choice = scanner.next().charAt(0);
            }
            while (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N');
        }
        while (choice == 'n' || choice == 'N');
        do {
            // create showSeat object
            ShowSeat showSeat = new ShowSeat();

            // call showSeat methods
            showSeat.displayFloorPlan();
            d = showSeat.getNumSeats();
            showSeat.getSeatSelection();
            e = showSeat.calculatePrice(0);
            do {
                System.out.print("Are you happy with your choice? Y = Yes / N = No: ");
                choice = scanner.next().charAt(0);
            }
            while (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N');
        }
        while (choice == 'n' || choice == 'N');

        // create ticket object
        Ticket ticket = new Ticket(e);

        // call ticket method
        ticket.setPrice(e);

        // call consumer method
        consumer.getPaymentDetails();

        // call ticket method
        ticket.printTicket(a, b, c, d, f, g, h);
    }
}