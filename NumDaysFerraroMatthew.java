// Matthew Ferraro
// CSC 331
// Spring 2020

// This program tells the user how many days are in a month while accounting for leap years.

import java.util.Scanner;

public class NumDaysFerraroMatthew {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month as an integer: ");  // user enters month
        int month = sc.nextInt();

        System.out.println("Enter a year as an integer: ");  // user enters year
        int year = sc.nextInt();

        String monthRotate = "months";  // place holder for month string
        int day = 0;  // place holder for number of days

        if (month == 1) {  // conditional statements
            monthRotate = "January";
            day = 31;
        } else if (month == 2) {
            monthRotate = "February";
            if (year % 4 != 0) {  // leap year logic
                day = 28;
            } else if (year % 100 == 0 && year % 400 != 0) {
                day = 28;
            } else {
                day = 29;
            }
        } else if (month == 3) {
            monthRotate = "March";
            day = 31;
        } else if (month == 4) {
            monthRotate = "April";
            day = 30;
        } else if (month == 5) {
            monthRotate = "May";
            day = 31;
        } else if (month == 6) {
            monthRotate = "June";
            day = 30;
        } else if (month == 7) {
            monthRotate = "July";
            day = 31;
        } else if (month == 8) {
            monthRotate = "August";
            day = 31;
        } else if (month == 9) {
            monthRotate = "September";
            day = 30;
        } else if (month == 10) {
            monthRotate = "October";
            day = 31;
        } else if (month == 11) {
            monthRotate = "November";
            day = 30;
        } else if (month == 12) {
            monthRotate = "December";
            day = 31;
        } else {
            System.out.println("Invalid Integer... Closing Program");  // exit program command for invalid integer
            System.exit(0);
        }
        System.out.println(monthRotate + " " + year + " has " + day + " days." );  // output print statement
    }
}
