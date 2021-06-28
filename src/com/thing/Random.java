package com.thing;

public class Random {

    public static void main(String[] args) {
        String motto = "May the force be with you.";
        int firstSpace = motto.indexOf(" ");
        System.out.println(firstSpace);
        int secondSpace = motto.indexOf(" ",firstSpace + 1);
        int thirdSpace = motto.indexOf(" ",secondSpace + 1);
        System.out.println(secondSpace);
        String word = motto.substring(secondSpace + 1, thirdSpace);
        System.out.println(word);
        mathPractice();
        classPractice();
        System.out.println(7+8+(7+8)+"Hello"+7+8+(7+8));
    }
    public static void mathPractice(){
        int absoluteValue = Math.abs(-20);
        double squareRoot = Math.sqrt(100);
        System.out.println(Math.random());
        int high = 10;
        int low = 1;
        int between1and100 = (int)(Math.random() * (high - low + 1)) + low;
        System.out.println(between1and100);

    }

    public static void classPractice() {
        int num = 5;
        Integer myInteger = new Integer(num);
        int value = myInteger.intValue();
        System.out.println(myInteger);
        String str1 = "avacado";
        String str2 = "bannana";
        System.out.println(str1.compareTo(str2) + " " + str2.compareTo(str1));
        System.out.println(str1.substring(str1.length()-1));

    }
}
