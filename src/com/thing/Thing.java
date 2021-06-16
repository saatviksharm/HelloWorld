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
        String nullString = null;
        try {
            System.out.println(nullString.length());
        }
        catch(Exception e) {
            System.out.println("There is a null string");
        }
        String fullName = "Prashant Sharma";

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.substring(i, i+1));
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(i+1);
        }
        int space = fullName.indexOf(" ");
        try {
            System.out.println("First Name " + fullName.substring(0,space));
        } catch (Exception e) {
            System.out.println("User only has 1 name and first name is " +fullName);
        }

        try {
            System.out.println("Last Name " + fullName.substring(space, fullName.length()));
        } catch (Exception e) {
            System.out.println("No last name");
        }




    }
}
