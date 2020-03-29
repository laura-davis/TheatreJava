package com.bcpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String a, b, c, f, g, h;
        int d;
        double e;
        char choice;
        Scanner scanner = new Scanner(System.in);

        // change wording / format
        System.out.println("--------------------- Main Menu ----------------------\n");
        System.out.println("1. Buy tickets for upcoming shows");
        System.out.println("2. Log out\n");

        do {
            System.out.print("Please enter a valid menu choice number: ");
            choice = scanner.next().charAt(0);
        } while (choice != '1' && choice != '2');

        if (choice == '2') {
            System.out.print("\nYou have been successfully logged out.");
        }

        if (choice == '1') {
            // select show - to do
            System.out.println("\nSelect show..."); // get rid of this later

        }


    }
}
