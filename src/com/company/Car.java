package com.company;


enum EngineType {DIESEL, GAS}

public class Car extends MotoricVehicle {

    private EngineType engineType;
    private static final int speedLimit = 130;

    @Override
    public void go() {
        //System.out.println("The car is going.");
        if (getSpeed() > speedLimit) {
            throw new SpeedingException();
        }
    }


    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

}