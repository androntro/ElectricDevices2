package com.company;

public abstract class ElectricDevice {
    final private String deviceType;
       final private String deviceName;
   final private int enConsume;
   private double workingHours;




    public ElectricDevice(String deviceType, String deviceName, int enConsume, double workingHours) {
        this.deviceType=deviceType;
        this.deviceName = deviceName;
        this.enConsume = enConsume;
        this.workingHours = workingHours;
    }



    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public int getEnConsume() {
        return enConsume;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }
}
