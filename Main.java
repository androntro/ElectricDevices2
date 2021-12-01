package com.company;

public class Main {

    public static void main(String[] args) {
        TeaPot teapot = new TeaPot("teapot", "Tefal", 2200, 0.1);
        CoffeeMachine coffeeMachine = new CoffeeMachine("coffeemachine", "Braun",
                1500, 0.2);
        WashingMachine washingMachine = new WashingMachine("washingmachine", "Indesit",
                1800, 1);
        House house = new House();

        double totalWatt;
        teapot.switcher();
        coffeeMachine.switcher();
        washingMachine.switcher();


        teapot.enUsed();
        coffeeMachine.enUsed();
        washingMachine.enUsed();

        teapot.setWorkingHours(0);

        totalWatt = teapot.enUsed() + coffeeMachine.enUsed() + washingMachine.enUsed();
        house.deviceArray();
        System.out.println();
        System.out.println(teapot.switcher());
        System.out.println(coffeeMachine.switcher());
        System.out.println(washingMachine.switcher());
        System.out.println();
        System.out.println("Общее количество потребленной энергии (Ватт)  " + totalWatt);


    }
}
