package com.company;

public class House {


    TeaPot teapot = new TeaPot("teapot", "Tefal", 2200, 0.1);
    CoffeeMachine coffeeMachine = new CoffeeMachine("coffeemachine", "Braun",
            1500, 0.2);
    WashingMachine washingMachine = new WashingMachine("washingmachine", "Indesit",
            1800, 1);

    void deviceArray() {
        String[] deviceArray = new String[3];
        deviceArray[0] = teapot.getDeviceType() + coffeeMachine.getDeviceName();
        deviceArray[1] = coffeeMachine.getDeviceType() + coffeeMachine.getDeviceName();
        deviceArray[2] = washingMachine.getDeviceType() + washingMachine.getDeviceName();

        System.out.println("Список устройств в доме: ");

        for (int i = 0; i < deviceArray.length; i++)
            System.out.println("\t\t\t\t\t\t" + deviceArray[i]);


    }
}
