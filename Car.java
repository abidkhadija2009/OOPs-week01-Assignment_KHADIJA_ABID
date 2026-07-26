/*
 * Student Name: KHADIJA ABID
 * Seat Number: B25110006065
 * Section: B
 * Date: 25 July 2026
 * File: Car.java
 * Purpose: Models a car with state, movement rules and a turbo feature.
 */
public class Car {
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private double fuelLevel;
    private int gear;
    private String direction;
    private boolean turboOn;

    public Car() {
        this.brand = "Unknown";
        this.color = "Unpainted";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 0.0;
        this.gear = 0;
        this.direction = "Straight";
        this.turboOn = false;
    }

    public void setDetails(String brand, String color, double fuelLevel) {
        this.brand = brand;
        this.color = color;
        this.fuelLevel = Math.max(0.0, Math.min(100.0, fuelLevel));
    }

    public void startEngine() {
        if (this.fuelLevel <= 0.0) {
            System.out.println(this.brand + " cannot start because the fuel tank is empty.");
            return;
        }

        this.engineOn = true;
        System.out.println(this.brand + " engine started.");
    }

    public void stopEngine() {
        this.speed = 0;
        this.gear = 0;
        this.turboOn = false;
        this.engineOn = false;
        System.out.println(this.brand + " engine stopped.");
    }

    public void drive() {
        if (!this.canMove()) {
            return;
        }

        this.speed = 20;
        this.gear = 1;
        this.useFuel(1.0);
        System.out.println(this.brand + " is driving at " + this.speed + " km/h.");
    }

    public void moveFast() {
        if (!this.canMove()) {
            return;
        }

        this.speed += 30;
        this.gear = Math.min(5, this.gear + 1);
        this.useFuel(2.0);
        System.out.println(this.brand + " increased speed to " + this.speed + " km/h.");
    }

    public void moveSlow() {
        this.speed = Math.max(0, this.speed - 15);
        if (this.speed == 0) {
            this.gear = 0;
        }
        this.turboOn = false;
        System.out.println(this.brand + " slowed down to " + this.speed + " km/h.");
    }

    public void moveLeft() {
        if (!this.canMove()) {
            return;
        }

        this.direction = "Left";
        System.out.println(this.brand + " turned left.");
    }

    public void moveRight() {
        if (!this.canMove()) {
            return;
        }

        this.direction = "Right";
        System.out.println(this.brand + " turned right.");
    }

    public void turboMode() {
        if (!this.canMove()) {
            return;
        }

        if (this.fuelLevel < 3.5) {
            System.out.println(this.brand + " does not have enough fuel for turbo mode.");
            return;
        }

        this.turboOn = true;
        this.speed += 50;
        this.gear = 5;
        this.useFuel(3.5);
        System.out.println(this.brand + " turbo mode activated at " + this.speed + " km/h.");
    }

    public void horn() {
        System.out.println(this.brand + " horn sounded.");
    }

    public void displayState() {
        System.out.println("Brand     : " + this.brand);
        System.out.println("Color     : " + this.color);
        System.out.println("Speed     : " + this.speed + " km/h");
        System.out.printf("Fuel      : %.1f%%%n", this.fuelLevel);
        System.out.println("Gear      : " + this.gear);
        System.out.println("Direction : " + this.direction);
        System.out.println("Engine on : " + this.engineOn);
        System.out.println("Turbo on  : " + this.turboOn);
        System.out.println();
    }

    private boolean canMove() {
        if (!this.engineOn) {
            System.out.println(this.brand + " cannot move because the engine is off.");
            return false;
        }

        if (this.fuelLevel <= 0.0) {
            System.out.println(this.brand + " cannot move because the fuel tank is empty.");
            return false;
        }

        return true;
    }

    private void useFuel(double amount) {
        this.fuelLevel = Math.max(0.0, this.fuelLevel - amount);
    }
}
