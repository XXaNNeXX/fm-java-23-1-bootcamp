package org.example;

import static org.example.Arrays.array;
import static org.example.Basics.basic;
import static org.example.Codewars.*;
import static org.example.UnitTests.*;

public class Main {
    public static void main(String[] args) {

        /*System.out.println(euclidean(3,-5));
        System.out.println(quarterOfTheYear(0));
        //array();
        basic();
        System.out.println(sum(3,5));
        System.out.println(even(7));
        System.out.println(product(2,3));
        System.out.println(upperCase("nice"));
        System.out.println(positive(-7));
        System.out.println(fizzbuzz(7));
        System.out.println(fizzbuzz2(15));*/

        Auto newCar = new Auto();
        newCar.startCar(1);

        Auto speed = new Auto();
        speed.accelerateCar(2);

        Person intro = new Person("Anne", 21, "weiblich");
        System.out.println("Hallo, ich bin " + intro.name + " und " + intro.age + " Jahre alt.");

        Person person1 = new Person("John", 33, "männlich");
        person1.intro();

        Person person2 = new Person("Maria", 58, "weiblich");
        person2.intro();
    }

}