package com.saatvik;

public class RetirementReady {

    public static boolean Ready(int YearBorn) {

        int CurrentYear = 2021;
        int age = CurrentYear - YearBorn;
        if(age >= 67) return true;
        else return false;

    }

    public static void main(String[] args) {
        RetirementReady rr = new RetirementReady();
        boolean ReReady = rr.Ready(1900);
        if(ReReady == true) System.out.println("You are retirement ready");
        else System.out.println("You are not retirement ready");
    }

}
