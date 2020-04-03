package com.bcpa;

import java.util.Scanner;

public class ShowSeat {
    // if not explicitly mentioned, variables etc assumed public?
    int row;
    char column;
    protected char[][] floorPlan = new char[7][6];
    protected int numSeats;
    protected int rowNum;
    double price;
    String seatSelection;
    Scanner scanner = new Scanner(System.in);

    public ShowSeat() {
        // to do - check if this is right... different to example, using char instead of int, and rowNum starting at 1 rather than 0
        for (int r = 0; r < 7; r++) {
            for (char c = 0; c < 'g'; c++) {
                floorPlan[r][c] = 'x';
                numSeats = 0;
                rowNum = 1;
                price = 0;
            }
        }
    }

    public void initialiseFloorPlan() {
        // to do
        for (int r = 0; r < 7; r++) {
            for (char c = 'a'; c < 'g'; c++) {
                floorPlan[r][c] = 'A';
            }
        }
    }

    public int getNumSeats() {
        // to do
        System.out.println("\n------------- Select seats interactively -------------\n");
        do {
            System.out.println("How many seats would you like to purchase (maximum of 8)?: ");
            numSeats = scanner.nextInt();
        }
        while (numSeats < 0 && numSeats > 8);
        return numSeats;
    }

    public String getSeatSelection() {
        // to do
        char choice;
        System.out.println("Please select a row number: ");
        rowNum = scanner.nextInt();
        System.out.println("Please select a column letter: ");
        column = scanner.next().charAt(0);
        System.out.println("You have selected seat: " + rowNum + column + ".");
        System.out.println("Are you happy with your choice? Y = Yes / N = No: ");
        choice = scanner.next().charAt(0);
        seatSelection = Integer.toString(rowNum) + column;
        if (choice == 'y' || choice == 'Y') {
            // proceed - to do
        } else {
            // cancel - to do
        }
        return seatSelection;
    }

    private void displayFloorPlan(int row, char column) {
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

    private void calculatePrice(double price) {
        // to do
    }

}
