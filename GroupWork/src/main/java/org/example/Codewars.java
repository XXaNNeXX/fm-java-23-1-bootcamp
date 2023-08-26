package org.example;

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

    public static String wolfSheep (String[] array) {

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
    }

    //"Pls go away and stop eating my sheep"
    //"Oi! Sheep number N! You are about to be eaten by a wolf!"
    //["sheep", "sheep", "sheep", "wolf", "sheep"]

}
