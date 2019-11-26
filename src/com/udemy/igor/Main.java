package com.udemy.igor;

public class Main {
    public static void main(String[] args) {
        System.out.println("***My solution of calculating time using an Overloading Method***");
        System.out.println("Calculating time using Minutes and Seconds = "
                + SecondsAndMinutes.getDurationString(203,57));
        System.out.println("*** Overloading Method ***");
        System.out.println("Calculating time using Seconds = "
                + SecondsAndMinutes.getDurationString(3600));

    }
}
