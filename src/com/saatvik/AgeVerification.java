package com.saatvik;

public class AgeVerification {

    public static boolean ageOver18(int yearOfBirth){
        int currentYear = 2021;
        int age = currentYear - yearOfBirth;
        if (age >= 18){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        AgeVerification av = new AgeVerification();
        boolean isOver18= av.ageOver18(1975);
        if (isOver18 == true) {
            System.out.println("Over 18");
        } else {
            System.out.println("Under 18");
        }
    }
}
