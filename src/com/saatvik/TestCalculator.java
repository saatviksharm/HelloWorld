package com.saatvik;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int getReturnInteger = calc.add2Numbers(521, 1054);
        int newNumber = getReturnInteger *10;
        System.out.println("Printing returned integer " + newNumber);


        calc.subtract2Numbers(70, 18);
        calc.multiply2Numbers(7, 4);
        calc.divide2Numbers(30, 13);
        calc.add3num(34,5,14);
    }
}
