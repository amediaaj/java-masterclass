package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Generic car");
        System.out.println(String.format("The %s car was created", car.getDescription()));
        car.startEngine();
        car.runEngine();
        car.drive();

        System.out.println();

        GasPoweredCar gasPoweredCar = new GasPoweredCar("Gas guzzler", 30, 8);
        System.out.println(String.format("The %s car was created", gasPoweredCar.getDescription()));
        gasPoweredCar.startEngine();
        gasPoweredCar.runEngine();
        gasPoweredCar.drive();

        System.out.println();

        GasPoweredCar gasPoweredCar2 = new GasPoweredCar("Test");

    }
}