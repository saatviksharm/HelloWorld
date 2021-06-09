package com.saatvik;

public class WhenToRetire {

   /* public static boolean Ready(int YearBorn) {

        int CurrentYear = 2021;
        int age = CurrentYear - YearBorn;
        if(age >= 67) return true;
        else return false;

    }*/

    public static int AgeToRetire(int BirthYear) {

        int CurrentYear = 2021;
        int agetoRetire = BirthYear + 67 - CurrentYear;
        System.out.println(agetoRetire);
        return  agetoRetire;

    }
    public static void main(String[] args) {
        WhenToRetire rr = new WhenToRetire();
        int returnedAgeToRetire= rr.AgeToRetire(1951);
        if(returnedAgeToRetire<=0) {
            System.out.println("You are retirement ready");
        }
        else {
            System.out.println("You are not retirement ready, but you can retire after " + returnedAgeToRetire + " years");
        }
        //int YearsLeft =  67 - age;
    }

}
