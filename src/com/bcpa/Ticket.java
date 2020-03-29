package com.bcpa;

public class Ticket {

    protected double totalCost;

    public Ticket(double totalCost) {
        this.totalCost = totalCost;
    }

    double cost() {
        // to do
        return 0.0;
    };

    void setPrice(double price) {
        totalCost = price;
        System.out.println("\nThe total cost of your tickets (including any applicable discount) is " + cost() + ".\n");
    };

    void printTicket(String showName, String showDate, String showTime, int numSeats, String fullName, String address) {
        // to do
        System.out.println("-------------------- Your Tickets --------------------\n");
        System.out.println("------------------------------------------------------\n");
        System.out.println("Show: \t\t" + showName + "\n");
        System.out.println("Date: \t\t" + showDate + "\n");
        System.out.println("Time: \t\t" + showTime + "\n");
        System.out.println("------------------------------------------------------\n");
        System.out.println("Number of seats: \t" + numSeats + "\n");
        System.out.println("Total cost: \t" + showDate + "\n");
        System.out.println("Ticket purchaser: \t" + fullName  + "\n");
        System.out.println("Postal address: \t" + address + "\n");
        System.out.println("------------------------------------------------------\n");

    };

}
