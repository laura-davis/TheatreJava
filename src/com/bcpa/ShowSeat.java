package com.bcpa;

import java.util.Scanner;

public class ShowSeat {

    // declare variables
    protected int row, numSeats;
    protected char column;
    protected String seatSelection;
    protected double price;

    // initialise scanner to collect user input
    Scanner scanner = new Scanner(System.in);

    public ShowSeat() {
        this.price = 0;
    }

    // get number of seats
    int getNumSeats() {
        System.out.println("\n------------- Select Seats Interactively -------------\n");
        do {
            System.out.print("How many seats would you like to purchase (maximum of 8)?: ");
            numSeats = scanner.nextInt();
        }
        while (numSeats < 1 || numSeats > 8);
        return numSeats;
    }

    // get seat selection
    String getSeatSelection() {
        do {
            System.out.print("Please select a row number (1 - 7): ");
            row = scanner.nextInt();
        }
        while (row < 1 || row > 7);
        do {
            System.out.print("Please select a column letter (A - F): ");
            column = scanner.next().charAt(0);
        }
        while (column < 'a' && column > 'F');
        System.out.println("You have selected seat: " + row + Character.toUpperCase(column) + ".\n");
        return seatSelection;
    }

    // display floor plan
    // TODO - this is hard-coded for now
    void displayFloorPlan() {
        System.out.println("\n+---------------------------+");
        System.out.println("|     A | B | C | D | E | F |");
        System.out.println("| 1 | - | - | - | - | - | - |");
        System.out.println("+---|---|---|---|---|---|---+");
        System.out.println("| 2 | - | - | - | - | - | - |");
        System.out.println("+---|---|---|---|---|---|---+");
        System.out.println("| 3 | - | - | - | - | - | - |");
        System.out.println("+---|---|---|---|---|---|---+");
        System.out.println("| 4 | - | - | - | - | - | - |");
        System.out.println("+---|---|---|---|---|---|---+");
        System.out.println("| 5 | - | - | - | - | - | - |");
        System.out.println("+---|---|---|---|---|---|---+");
        System.out.println("| 6 | - | - | - | - | - | - |");
        System.out.println("+---|---|---|---|---|---|---+");
        System.out.println("| 7 | - | - | - | - | - | - |");
        System.out.println("+---------------------------+\n");
        System.out.println("Key:");
        System.out.println("- :\tAvailable / x :\tBooked / * : On hold");
    }

    // calculate price
    double calculatePrice() {
        if (row > 0 && row <= 4) {
            price += 20;
        } else if (row >= 5) {
            price += 30;
        }
        return price;
    }
}
