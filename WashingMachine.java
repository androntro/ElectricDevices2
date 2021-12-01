package com.company;

public class WashingMachine extends ElectricDevice {
    public WashingMachine(String deviceType,String deviceName, int enConsume, double workingHours) {
        super(deviceType,deviceName, enConsume, workingHours);

    }

    int temperature;
    int spinSpeed;
    String switcher;

    double enUsed() {
        return getWorkingHours() * getEnConsume();
    }

    public String switcher() {
        if (getWorkingHours() > 0)
            switcher = "Coffeemachine is turned 'on'";
        else switcher = "Coffeemachine is turned 'off'";
        return switcher;
    }
}

