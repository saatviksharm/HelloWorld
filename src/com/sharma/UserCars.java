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
        prashantsLexus.setSunroof(true);


        prashantsLexus.setCarDetailsAndCalculateCost();

        LexusCars saatviksLexus = new LexusCars();
        saatviksLexus.setCarType("hybrid");
        saatviksLexus.setModel("UX");
        saatviksLexus.setSubModel("luxury");
        saatviksLexus.setDoors(4);
        saatviksLexus.setCarColor("red");
        saatviksLexus.setSeatColor("Maroon");
        saatviksLexus.setSunroof(false);

        saatviksLexus.setCarDetailsAndCalculateCost();
    }
}
