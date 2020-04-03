package com.bcpa;

import java.util.Scanner;

public class Show {
    protected String showName;
    // change this to date?
    protected String showDate;
    // change this to time?
    protected String showTime;
    char choice;
    Scanner scanner = new Scanner(System.in);

    // constructor with arguments
    public Show(String showName, String showDate, String showTime) {
        this.showName = showName;
        this.showDate = showDate;
        this.showTime = showTime;
    }

    // constructor without arguments
    public Show() {
    }

    String selectShowName() {
        System.out.println("\n------------------- Select a show --------------------\n");
        System.out.println("1. Hamilton");
        System.out.println("2. Mamma Mia");
        System.out.println("3. Matilda");

        do {
            System.out.print("\nPlease select a valid show by entering a number (1 - 3): ");
            choice = scanner.next().charAt(0);
        }
        while (choice != '1' && choice != '2' && choice != '3');

        switch (choice) {
            case '1':
                showName = "Hamilton";
                break;
            case '2':
                showName = "Mamma Mia";
                break;
            case '3':
                showName = "Matilda";
                break;
        }
        return showName;
    }

    String selectShowDate() {
        System.out.println("\n------------------- Select a date --------------------\n");
        System.out.println("1. 01/04/2020");
        System.out.println("2. 02//04/2020");
        System.out.println("3. 03/04/2020");
        do {
            System.out.print("\nPlease select a valid date by entering a number (1 - 3): ");
            choice = scanner.next().charAt(0);
        }
        while (choice != '1' && choice != '2' && choice != '3');

        switch (choice) {
            case '1':
                showDate = "01/04/2020";
                break;
            case '2':
                showDate = "02/04/2020";
                break;
            case '3':
                showDate = "03/04/2020";
                break;
        }
        return showDate;
    }

    void selectShowTime() {
        System.out.println("\n------------------- Select a time --------------------\n");
        do {
            System.out.println("Would you like to book tickets for the matinee performance (1pm),");
            System.out.println("or the evening performance (7pm)? M = Matinee / E = Evening): ");
            choice = scanner.next().charAt(0);
        }
        while (choice != 'e' && choice != 'E' && choice != 'm' && choice != 'M');
        if (choice == 'e' || choice == 'E') {
            showTime = "1pm";
        } else {
            showTime = "7pm";
        }
        System.out.println("You have selected " + showName + " on " + showDate + " at " + showTime + ".\n");
        System.out.println("Are you happy with your choice? Y = Yes / N = No: ");
        choice = scanner.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            // to do - ticket interface?
        } else {
            // cancel - to do
        }
    }
}
