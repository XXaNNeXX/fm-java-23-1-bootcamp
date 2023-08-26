package org.example;

import static org.example.Codewars.euclidean;
import static org.example.Codewars.quarterOfTheYear;
import static org.example.Arrays.array;
import static org.example.Basics.basic;
import static org.example.UnitTests.sum;
import static org.example.UnitTests.even;
import static org.example.UnitTests.product;
import static org.example.UnitTests.upperCase;
import static org.example.UnitTests.positive;

public class Main {
    public static void main(String[] args) {

        System.out.println(euclidean(3,-5));
        System.out.println(quarterOfTheYear(0));
        array();
        basic();
        System.out.println(sum(3,5));
        System.out.println(even(7));
        System.out.println(product(2,3));
        System.out.println(upperCase("nice"));
        System.out.println(positive(-7));
    }
}