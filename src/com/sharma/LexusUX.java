package com.sharma;

public class LexusUX {

    public static void setCarVariables(String usercolor, int numberofDoors, String seatColor) {
        System.out.println("Inside Car.setCarVariables method");
        System.out.println("Your car color is " + usercolor + " and your car has " +numberofDoors + " doors and seat color is " + seatColor);
    }

    public static void accelerate(int accelerateSpeed) {
        System.out.println("Accelarating to speed " + accelerateSpeed);
    }

    public static void decelerate(int decelerateSpeed) {
        System.out.println("Decelerating to speed " + decelerateSpeed);
    }

    public static void changeGear(int gear) {
        System.out.println("Changing gear to " + gear);
    }

}
