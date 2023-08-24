package org.example;

public class TTD {
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
