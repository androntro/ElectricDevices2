package com.company;

public class TeaPot extends ElectricDevice {
     TeaPot(String deviceType,String deviceName, int enConsume, double workingHours) {
         super(deviceType,deviceName, enConsume, workingHours);
    }

        int temperature;
    String switcher;


    double enUsed() {
        return getWorkingHours() * getEnConsume();
    }

    int tempSet() {
        return temperature;
    }

    public String switcher() {
        if (getWorkingHours() > 0)
            switcher = "Teapot is turned 'on' ";
        else switcher = "Teapot is turned 'off' ";
        return switcher;
    }
}






