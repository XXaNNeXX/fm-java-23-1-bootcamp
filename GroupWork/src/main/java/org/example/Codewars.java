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
}
