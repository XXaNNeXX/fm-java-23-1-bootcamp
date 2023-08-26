package org.example;

public class Basics {

    public static void basic() {

        String hello = "Hello World";
        String javaText = "Java ist cool";
        System.out.println(hello);
        System.out.println(javaText);

        int a = 5;
        int b = 3;
        int sum = a + b;
        int diff = a - b;
        int multi = a * b;
        int divi = a / b;
        System.out.println("Summe: " + sum);
        System.out.println("Differenz: " + diff);
        System.out.println("Multiplikation :" + multi);
        System.out.println("Division: " + divi);

        boolean wert1 = a > b;
        boolean wert2 = a < b;
        boolean wert3 = divi == diff;
        System.out.println("Wahrheitswert 1: " + wert1);
        System.out.println("Wahrheitswert 2: " + wert2);
        System.out.println("Wahrheitswert 3: " + wert3);

        float f1 = 3545.347567567f;
        float f2 = 47.68796789f;
        double d1 = 8697908.478679946475768;
        double d2 = 8689708099.57586878979789989089;
        float sum2 = f1 + f2;
        float diff2 = f1 - f2;
        float multi2 = f1 * f2;
        float divi2 = f1 / f2;
        double sum3 = d1 + d2;
        double diff3 = d1 - d2;
        double multi3 = d1 * d2;
        double divi3 = d1 / d2;
        System.out.println("Float Summe: " + sum2);
        System.out.println("Float Differenz: " + diff2);
        System.out.println("Float Multiplikation: " + multi2);
        System.out.println("Float Division: " + divi2);
        System.out.println("Double Summe: " + sum3);
        System.out.println("Double Differenz: " + diff3);
        System.out.println("Double Multiplikation: " + multi3);
        System.out.println("Double Division: " + divi3);


        double result1 = add(5.456,30.28485);
        System.out.println("Die Summe ist " + result1);

        int result2 = substract(11, 7);
        System.out.println("Die Differenz ist " + result2);

        int result3 = makePositive(21);
        System.out.println("Die Zahl ist " + result3);

        int x = 12;
        int y = 8;
        if (x > y) {
            System.out.println(substract(x, y));
        } else {
            System.out.println(add(x, y));
        }

        int neueZahl = checkOdd(12);
        System.out.println(neueZahl);
    }

    public static double add (double a, double b) {

        return a + b;
    }

    public static int substract (int a, int b) {

        return a - b;
    }

    public static int makePositive (int x) {
        if (x < 0) {
            x *= -1;
        }
        return x;
    }
    public static int checkOdd (int zahl) {
        int result = zahl % 2;
        if (result == 0) {
            return zahl;
        } else {
            return zahl * zahl;
        }
    }
}
