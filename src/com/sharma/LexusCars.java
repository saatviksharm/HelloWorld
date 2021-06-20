package com.sharma;

public class LexusCars {

    public String carType;
    public String model;
    public String subModel;
    private String carColor;
    public int doors;
    public String seatColor;

    public String getSeatColor() {
        return seatColor;
    }

    public void setSeatColor(String seatColor) {
        this.seatColor = seatColor;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSubModel() {
        return subModel;
    }

    public void setSubModel(String subModel) {
        this.subModel = subModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int setCarDetailsAndCalculateCost() {

        System.out.println("Inside Car.setCarVariables method");
        System.out.println("Your car type is " +getCarType() + " and your car model is " +getModel() +
                " Sub model is " + getSubModel() + " doors are " + getDoors() + " and seat color is " + getSeatColor());
        int cost;
        cost = calculateCost();
        return cost;
    }

    private int calculateCost() {
        int baseCost = 0;
        if (carType == "hybrid") {
            if (model == "UX") {
                baseCost = 35200;
                if (subModel == "sport") {
                    baseCost = baseCost + 2000;
                }
            } else if (model == "NX") {
                baseCost = 40160;
            } else if (model == "LC") {
                baseCost = 97610;
            }
        }
        int finalCost;
        if (carColor == "red"){
            finalCost = baseCost + 1000;
        } else {
            finalCost = baseCost;
        }
        //System.out.println("Cost after color selection " + finalCost);
        if (doors == 2){
            finalCost += 2000;
        } else {
            finalCost += 1000;
        }
        //System.out.println("Cost after door selection " + finalCost);
        if (seatColor == "white"){
            finalCost += 500;
        } else if (seatColor == "Maroon" ){
            finalCost += 1000;
        }
        System.out.println("Cost after interior color selection " + finalCost);
        return finalCost;
    }

    public void accelerate(int accelerateSpeed) {
        System.out.println("Accelarating to speed " + accelerateSpeed);
    }

    public void decelerate(int decelerateSpeed) {
        System.out.println("Decelerating to speed " + decelerateSpeed);
    }

    private void brake() {
        System.out.println("Braking");
    }

    public void changeGear(int gear) {
        System.out.println("Changing gear to " + gear);
    }

}
