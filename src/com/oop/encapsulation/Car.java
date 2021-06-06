package com.oop.encapsulation;


public class Car {

    // class variables all private and expose those with getter and setter methods
    private String type;
    private String model;
    private String color;
    private boolean startEngine;
    private int speed;
    private boolean brake;

    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.printf(" Car set speed to " + speed + "\n" );
    }

    public boolean isStartEngine() {
        return startEngine;
    }

    public void setStartEngine(boolean startEngine) {
        this.startEngine = startEngine;
        if (startEngine) {
            System.out.println(" Engine started ..");
        } else {
            System.out.println(" Engine stop.");
        }

    }

    public boolean isBrake() {
        return brake;
    }

    public void setBrake(boolean brake) {
        this.brake = brake;
        System.out.println(" Break the Car..");
    }

}
