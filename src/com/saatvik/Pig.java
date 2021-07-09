package com.saatvik;

public class Pig implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Pig makes sound wee wee");

    }

    @Override
    public void runSpeed() {
        System.out.println("Pig runs at 10mph");

    }
}
