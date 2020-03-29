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

    // constructor
    public Show(String showName, String showDate, String showTime) {
        this.showName = showName;
        this.showDate = showDate;
        this.showTime = showTime;
    }

    void selectShow(String showName, String showDate) {
        // to do
        System.out.println("-------------- Select an upcoming show ---------------\n");
        System.out.println("1. Hamilton (03/04/2020)");
        System.out.println("2. Mamma Mia (18/04/2020)");
        System.out.println("3. Matilda (28/05/2020)");
        do {
            System.out.print("\nPlease select a valid show number: ");
        }
        while(choice != '1' && choice != '2' && choice != '3');

            switch(choice) {
                case '1': showName = "Hamilton";
                showDate = "03/04/2020";
                break;
                case '2': showName = "Mamma Mia";
                showDate = "18/04/2020";
                break;
                case '3': showName = "Matilda";
                showDate = "28/05/2020";
                break;
            };
    };


    public String selectTime() {
        // to do
        return "";
    }


}
