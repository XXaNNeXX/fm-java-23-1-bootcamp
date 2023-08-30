package org.example;

import static org.example.Arrays.array;
import static org.example.Basics.basic;
import static org.example.Codewars.*;
import static org.example.UnitTests.*;

public class Main {
    public static void main(String[] args) {

        //System.out.println(euclidean(3,-5));
        //System.out.println(quarterOfTheYear(0));
        //array();
        //basic();
        //System.out.println(sum(3,5));
        //System.out.println(even(7));
        //System.out.println(product(2,3));
        //System.out.println(upperCase("nice"));
        //System.out.println(positive(-7));
        //System.out.println(fizzbuzz(7));
        //System.out.println(fizzbuzz2(15));

        /*Auto newCar = new Auto();
        newCar.startCar(1);

        Auto speed = new Auto();
        speed.accelerateCar(2);

        Person intro = new Person("Anne", 21, "weiblich");
        System.out.println("Hallo, ich bin " + intro.name + " und " + intro.age + " Jahre alt.");

        Person person1 = new Person("John", 33, "männlich");
        person1.intro();

        Person person2 = new Person("Maria", 58, "weiblich");
        person2.intro();

        Book newBook = new Book("Juli Zeh", "Unter Leuten", "345456-36545767-453456");
        System.out.println(newBook);

        Library[] newLib = new Library[3];
        newLib[0] = new Library("Neal Stephenson", "Amalthea", "3456-356-34546");
        newLib[1] = new Library("Rob Hart", "Der Store", "345435-5678-686989");
        newLib[2] = new Library("T.C. Boyle", "Die Terranauten", "567678-6789-7989");
        System.out.println(newLib[0]);
        System.out.println(newLib[1]);
        System.out.println(newLib[2]);*/

        System.out.println(pillars(10,10,5));

        Static obj1 = new Static();
        Static obj2 = new Static();

        System.out.println("Static: " + Static.getTotalCount());
        System.out.println("Static Methode: " + Static.incrementTotalCount());
        System.out.println("Instanz: " + obj2.getInstanceCount());
        System.out.println("Instanz Methode: " + Static.incrementTotalCount());


        System.out.println(Calculator.add(3,4));
        System.out.println(Calculator.substract(5,2));
    }

}