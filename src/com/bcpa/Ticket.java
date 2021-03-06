package com.bcpa;

public class Ticket {

    // initialise variables
    protected double cost;

    // constructor with arguments
    Ticket(double cost) {
        this.cost = cost;
        System.out.println();
        System.out.println("The total cost of your tickets (including any applicable discount) is £" + cost + ".\n");
    }

    // print ticket
    void printTicket(String showName, String showDate, String showTime, int numSeats, String firstName, String lastName, String address) {
        // to do
        System.out.println("-------------------- Your Tickets --------------------\n");
        System.out.println("Show: \t\t\t\t" + showName);
        System.out.println("Date: \t\t\t\t" + showDate);
        System.out.println("Time: \t\t\t\t" + showTime);
        System.out.println("Number of seats: \t" + numSeats);
        System.out.println("Total cost: \t\t" + "£" + cost);
        System.out.println("Ticket purchaser: \t" + firstName + " " + lastName);
        System.out.println("Postal address: \t" + address);
    }
}