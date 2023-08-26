package org.example;

public class UnitTests {

        public static int sum(int a, int b) {

            return a + b;
        }

        public static boolean even(int x) {
            int zahl = x % 2;
            if(zahl == 0) {
                return true;
            } else {
                return false;
            }
        }

        public static int product(int x, int y) {
            return x * y;
        }

        public static String upperCase(String a) {

            return a.toUpperCase();
        }

        public static boolean positive(int b) {
            if(b >= 0) {
                return true;
            } else {
                return false;
            }
        }
}
