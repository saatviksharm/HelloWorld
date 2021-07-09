package com.sharma;

public class UserCars {


    public static void main(String[] args) {
        LexusCar prashantsLexus = new LexusCar();
        String carType = args[0];
        String model = args[1];
        String subModel = args[2];
        int doors = Integer.parseInt(args[3]);
        String color = args[4];
        String seatColor = args[5];
        boolean sunRoof = Boolean.parseBoolean(args[6]);
        prashantsLexus.setCarType(carType);
        prashantsLexus.setModel(model);
        prashantsLexus.setSubModel(subModel);
        prashantsLexus.setDoors(doors);
        prashantsLexus.setCarColor(color);
        prashantsLexus.setSeatColor(seatColor);
        prashantsLexus.setSunroof(sunRoof);


        prashantsLexus.setCarDetailsAndCalculateCost();

        LexusCar saatviksLexus = new LexusCar();
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
