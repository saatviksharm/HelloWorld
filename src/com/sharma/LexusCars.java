package com.sharma;

public class LexusCars {

    private String color;
    public String model;
    public int doors;

    public static int setCarVariables(String usercolor, int numberofDoors, String seatColor) {
        int cost;
        //int calculateCost = 0;
        cost = calculateCost(usercolor, numberofDoors, seatColor);
        System.out.println("Inside Car.setCarVariables method");
        System.out.println("Your car color is " + usercolor + " and your car has " +numberofDoors + " doors and seat color is " + seatColor);
        return cost;
    }

    private static int calculateCost(String pusercolor, int pnumberofDoors, String pseatColor) {
        int baseCost = 10000;
        int finalCost;
        if (pusercolor == "red"){
            finalCost = baseCost + 1000;
        } else {
            finalCost = baseCost;
        }
        if (pnumberofDoors == 2){
            finalCost = baseCost + 2000;
        } else {
            finalCost = baseCost + 1000;
        }
        if (pseatColor == "white"){
            finalCost = baseCost + 500;
        } else if (pseatColor == "Maroon" ){
            finalCost = baseCost + 1000;
        }
        return finalCost;
    }

    public static void accelerate(int accelerateSpeed) {
        System.out.println("Accelarating to speed " + accelerateSpeed);
    }

    public static void decelerate(int decelerateSpeed) {
        System.out.println("Decelerating to speed " + decelerateSpeed);
    }

    private void brake() {
        System.out.println("Braking");
    }

    public static void changeGear(int gear) {
        System.out.println("Changing gear to " + gear);
    }

    public static void main(String[] args) {
        LexusCars prashantsLexus = new LexusCars();
        int prashantsLexusCost = prashantsLexus.setCarVariables("Silver", 4, "white");
        System.out.println("Cost of Prashants car is " + prashantsLexusCost);
        //prashantsLexus.accelerate(70);
       //prashantsLexus.decelerate(35);
        //prashantsLexus.changeGear(4);
        prashantsLexus.brake();

        LexusCars saatviksLexus = new LexusCars();
        int saatviksLexusCost = saatviksLexus.setCarVariables("Red", 2, "Maroon");
        System.out.println("Cost of Saatviks car is " + saatviksLexusCost);
        //saatviksLexus.accelerate(100);
       // saatviksLexus.decelerate(35);
        //saatviksLexus.changeGear(5);

        // write your code here
    }

}
