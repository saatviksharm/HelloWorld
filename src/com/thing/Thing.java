package com.thing;

import java.sql.SQLOutput;

public class Thing {
    public static void main(String[] args) {
        String firstName = "Saatvik";
        String lastName = "Sharma";
        String myName = "Saatvik Sharma";
        System.out.println(myName.toLowerCase());
        System.out.println(myName.toUpperCase());
        System.out.println(myName.length());
        //lastName += firstName;
        System.out.println(lastName);
        System.out.println(!firstName.equals(lastName));
        System.out.println(lastName.equals("Sharma"));
    }
}
