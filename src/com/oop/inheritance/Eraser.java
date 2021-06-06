package com.oop.inheritance;

public class Eraser extends Stationery {

    public Eraser() {
        this.name = "Eraser";
        System.out.println("You got your " + this.name);
    }

    public void erase() {
        System.out.println("You are erasing what you need.");
    }

}
