package org.example;

public class Car {
    private String description;

    public Car(String description){
        this.description = description;
        System.out.println(String.format("The %s constructor is being called from class %s", description, this.getClass().getSimpleName()));
    }

    public void startEngine() {
        System.out.println(String.format("The %s is starting", description));
    }

    public void drive() {
        System.out.println(String.format("The %s is driving", description));
    }

    protected void runEngine() {
        System.out.println(String.format("The %s engine is running", description));
    }

    public String getDescription() {
        return description;
    }
}
