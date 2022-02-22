package com.otsvietkova;

public class Tesla extends AbstractElectricCar {

    private final static double CHARGING_POWER = 7.5;
    private final static double MAX_BATTERY_CAPACITY = 100;
    private final static double ENERGY_FOR_1_KM = 1.6;

    public Tesla() {
        super("com.otsvietkova.Tesla", "Vrum Vrum", CHARGING_POWER, MAX_BATTERY_CAPACITY, ENERGY_FOR_1_KM);
    }
}
