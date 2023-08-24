package org.example;

public class TTD {
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
    public static int fibonnaci(int n) {

        if(n == 0 || n == 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static int fibonacci2(int x) {

        if(x == 1) {
            return 0;
        }

        if(x == 2) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = -1;
        for(int i = 3; i < x; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static double fibonnaci(double n) {
        if (n == 0.0 || n == 1.0) {
            return n;
        }
        double a = 0.0, b = 1.0;
        for (double i = 2.0; i <= n; i++) {
            double temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
