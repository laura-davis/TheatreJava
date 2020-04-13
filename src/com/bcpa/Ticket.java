package com.bcpa;

public class Ticket {

    // initialise variables
    protected double totalCost;

    // constructor with arguments
    Ticket(double totalCost) {
        this.totalCost = totalCost;
    }

    // set price
    void setPrice(double price) {
        totalCost = price;
        System.out.println("\nThe total cost of your tickets (including any applicable discount) is £" + totalCost + ".\n");
    }

    // print ticket
    void printTicket(String showName, String showDate, String showTime, int numSeats, String firstName, String lastName, String address) {
        // to do
        System.out.println("-------------------- Your Tickets --------------------\n");
        System.out.println("Show: \t\t\t\t" + showName);
        System.out.println("Date: \t\t\t\t" + showDate);
        System.out.println("Time: \t\t\t\t" + showTime);
        System.out.println("Number of seats: \t" + numSeats);
        System.out.println("Total cost: \t\t" + "£" + totalCost);
        System.out.println("Ticket purchaser: \t" + firstName + " " + lastName);
        System.out.println("Postal address: \t" + address);
    }
}