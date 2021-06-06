package com.oop.encapsulation;

public class Driver {

    public static void main(String[] args) {

      Car austineMartin = new Car("SUV", "DBX", "Black");

      /* Driver have a car Driver don't know how the car inside work
           He know how to
               * start the car
               * set correct speed to car
               * stop the car when he need  */

        austineMartin.setStartEngine(true);
        austineMartin.setSpeed(1);
        austineMartin.setSpeed(2);
        austineMartin.setBrake(true);
        austineMartin.setStartEngine(false);

    }
}
