package org.example;

import java.util.Arrays;

public class Codewars {

    public static int euclidean(int x, int y) {

        if(x > 0 && y > 0) {
            return 1;
        }
        if(x < 0 && y > 0) {
            return 2;
        }
        if(x < 0 && y < 0) {
            return 3;
        }
        if(x > 0 && y < 0) {
            return 4;
        }
        return 0;
    }

    public static int quarterOfTheYear(int x) {
        if(x >= 1 && x <= 3) {
            return 1;
        }
        if(x >= 4 && x <= 6 ) {
            return 2;
        }
        if(x >= 7 && x <= 9) {
            return 3;
        }
        if(x >= 10 && x <= 12) {
            return 4;
        }
        return 0;
    }

    /*public static String wolfSheep (String[] array) {

        //"Pls go away and stop eating my sheep"
        //"Oi! Sheep number N! You are about to be eaten by a wolf!"
        //["sheep", "sheep", "sheep", "wolf", "sheep"]

        for(int i = 0; i < array.length; i++) {
            if(array[i].equals("wolf")) {
                if(i == array.length-1) {
                    return "Pls go away and stop eating my sheep";
                } else {
                    return "Oi! Sheep number " + (array.length-1-i) + "! You are about to be eaten by a wolf!";
                }
            }
        }
        return "";
    }*/

    static int fizzbuzz(int number) {
        if(number % 3 != 0 && number % 5 != 0) {
            return number;
        }
        return 0;
    }

    static String fizzbuzz2(int number2) {
        if(number2 % 3 == 0 && number2 % 5 == 0) {
            return "fizzbuzz";
        }
        return "";
    }

    public static int points(String[] games) {
        int score = 0;
        for(String i : games) {
            String[] s = i.split(":");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            if(x > y) {
                score += 3;
            } else if (x == y) {
                score++;
            }
        }
        return score;
    }

    /*public static int pillars(int numPill, int dist, int width){

        if(numPill > 1) {
            int sum =
        }
        (numPill*width) + ((numPill*dist)-dist) - 2*width
        return -1;
    }*/
}
