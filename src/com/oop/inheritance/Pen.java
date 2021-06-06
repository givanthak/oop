package com.oop.inheritance;

public class Pen extends Stationery{

    public Pen() {
        this.name = "Pen";
        System.out.println("You got your " + this.name);
    }

    public void write(String writing) {
        System.out.println(writing);
    }

}
