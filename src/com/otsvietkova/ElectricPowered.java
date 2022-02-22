package com.otsvietkova;

public interface ElectricPowered {

    void charge(double hours);

    double getBatteryLevel();

    double getBatteryVolume();
}
