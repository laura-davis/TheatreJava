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
        System.out.println("------------- Select seats interactively -------------\n");
        do {
            System.out.println("How many seats would you like to purchase (maximum of 8)?: ");
            numSeats = scanner.nextInt();
        }
        while (numSeats < 0 && numSeats > 8);
        return numSeats;
    }

    public double getSeatSelection() {
        // to do
        return 0.0;
    }

    private void displayFloorPlan(int row, char column) {
        // to do
    }

    private void calculatePrice(double price) {
        // to do
    }

}
