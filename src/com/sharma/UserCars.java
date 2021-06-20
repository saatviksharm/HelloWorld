package com.sharma;

public class UserCars {


    public static void main(String[] args) {
        LexusCars prashantsLexus = new LexusCars();
        prashantsLexus.setCarType("hybrid");
        prashantsLexus.setModel("UX");
        prashantsLexus.setSubModel("sport");
        prashantsLexus.setDoors(4);
        prashantsLexus.setCarColor("red");
        prashantsLexus.setSeatColor("Maroon");

        prashantsLexus.setCarDetailsAndCalculateCost();
    }
}
