package org.example;

public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
        avgKmPerLitre = 50;
        this.cylinders = 4;

        // Example of declaring same named variable as existing field
//        double avgKmPerLitre = 10.0;
//        avgKmPerLitre = 11.0;
//        System.out.println(avgKmPerLitre);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Vvvvrrrroooooooom");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Vvvvrrrroooooooom whaaaaaaa whaaaaa");

    }
}
