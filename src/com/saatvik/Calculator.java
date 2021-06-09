package com.saatvik;

public class Calculator {
    public static int add2Numbers(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }

    public static void subtract2Numbers(int number1, int number2){
        int sum1 = number1 - number2;
        System.out.println("Sum of 2 numbers is " + sum1);
    }

    public static void multiply2Numbers(int number1, int number2){
        int pro = number1 * number2;
        System.out.println("Product of 2 numbers is " + pro);
    }

    public static void divide2Numbers(int number1, int number2){
       int quo = number1 / number2;
        System.out.println("Quotient of 2 numbers is " + quo);
    }

    public static void add3num(int num1, int num2, int num3) {
        int add3 = num1+num2+num3;
        System.out.println("Sum of these numbers are " + add3);
    }

}
