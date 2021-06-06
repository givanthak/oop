package com.oop.inheritance;

public class TextBook extends Stationery{

    public TextBook() {
        this.name = "TextBook";
        System.out.println("You got your " + this.name);
    }

    public void read() {
        System.out.println("The history of Iceland is long and interesting");
    }

}
