package org.launchcode.java.demos.lsn5unittesting.main;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 10, 50);
        System.out.println(car.getMake() + " " + car.getModel() + ": The gas tank on this vehicle holds " + car.getGasTankSize() +
                " gallons, and it gets " + car.getMilesPerGallon() + " miles per gallon. You can drive " +
                (car.getGasTankSize() * car.getMilesPerGallon()) + " miles before needing fuel.");
    }
}
