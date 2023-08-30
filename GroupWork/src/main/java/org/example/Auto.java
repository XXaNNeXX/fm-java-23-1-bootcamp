package org.example;

public class Auto {

    String brand;
    String model;
    String colour;
    int year;

    public Auto() {

    }
    public Auto(String brand, String model, String colour, int year) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public void startCar(int velocity) {

        if(velocity > 0) {
            System.out.println("Der " + brand + " ist gestartet");
        } else {
            System.out.println("Bitte starte das Auto");
        }
    }

    public void accelerateCar(int accelerate) {

            accelerate *= 2;
            System.out.println("Die Geschwindigkeit beträgt " + accelerate + " km/h");

    }
}
