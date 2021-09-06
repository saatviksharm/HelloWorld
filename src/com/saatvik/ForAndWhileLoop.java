package com.saatvik;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ForAndWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int loanAmount = 2000;
        for (int i = 1; i <= 8; i++) {
            System.out.println("Installmant number " + i + " for $250");
            loanAmount = loanAmount - 250;
            System.out.println("Loan balance = " + loanAmount);

        }

        int whileLoanAmount = 20000;
        int instalment = 1;
        while (whileLoanAmount > 0) {
            System.out.println("Installmant number " + instalment + " for $250");
            whileLoanAmount = whileLoanAmount - 500;
            System.out.println("While Loan balance = " + whileLoanAmount);
            instalment ++;
        }
        System.out.println("Please input increment number");
        int increment = scan.nextInt();
        for (int i = 1; i <= 50; i++) {

           // System.out.println("i is  " + i );

            i = i+(increment-1);

            System.out.println("i is  " + i );

        }
        addDigits();
        stringStuff();
    }
    public static void addDigits(){

        Scanner scanning = new Scanner(System.in);
        System.out.println("Please input any two digit number:");
        int value = scanning.nextInt();
        int number = Math.abs(value);
        int digit;
        int sum = 0;
       // System.out.println(digit + " " + sum);
        System.out.println("Here are the digits:");
        while (number>0){
            digit = number % 10;
            System.out.println(digit);
            sum += digit;
            number/=10;
            //System.out.println(number);
        }
        //System.out.println("Here are the digits: " + firstDigit + " and " + secondDigit);
       // int sumOfDigits = firstDigit + secondDigit;
        System.out.println("Here is the sum of the digits: " + sum);

    }
    public static void stringStuff(){

        String sentance = "Saatvik";
        String reverse = "";
        String letter;
        for (int i = sentance.length(); i >= 1; i--) {

            letter = sentance.substring(i-1,i);
            reverse+=letter;

        }
        System.out.println(sentance + " " + reverse);
    }
}
