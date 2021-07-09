package com.saatvik;

public class Horse implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Horse makes sound neigh");
    }

    @Override
    public void runSpeed() {
        System.out.println("Horse runs at 50mph");
    }
}
