package base;

/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();

        double principal = myApp.prompt("principal");
        double rate = myApp.prompt("rate of interest");
        double years = myApp.prompt("number of years");

        double interest = myApp.calculateInterest(principal, rate, years);

        myApp.printOutput(years, rate, interest);
    }

    public void printOutput(double years, double rate, double interest){
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f.",
                (int) years, rate, interest);
    }

    public double calculateInterest(double principal, double rate, double years){
        double convertedRate = rate/100;
        return principal * (1 + (convertedRate * years));
    }

    public double prompt(String prompt){
        System.out.printf("Enter the %s: ", prompt);
        return in.nextDouble();
    }
}
