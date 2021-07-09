package com.saatvik;

//import com.saatvik.Calculator;

public class TestCalculator {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        //Calculator calculator = new Calculator();
        Calculator calc = new Calculator();
        int getReturnInteger = calc.add2Numbers(number1,number2);
        //int newNumber = getReturnInteger *10;
        //System.out.println("Printing returned integer " + newNumber);
        System.out.println(getReturnInteger);

        /*calc.subtract2Numbers(70, 18);
        calc.multiply2Numbers(7, 4);
        calc.divide2Numbers(30, 13);
        calc.add3num(34,5,14);*/
    }
}
