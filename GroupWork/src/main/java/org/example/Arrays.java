package org.example;

public class Arrays {

    public static void array() {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] myArray2 = new int[10];

        for (int a = 0; a < myArray2.length; a++) {
            myArray2[a] = a + 1;
            System.out.println(myArray2[a]);
        }

        for (int i : myArray) {
            System.out.println(i);
        }

        int sum = 0;
        for (int j : myArray) {
            sum += j;
        }
        System.out.println("Die Summe ist " + sum);

        int max = 0;
        for (int j : myArray) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Die größte Zahl ist " + max);

        int[] newArray = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < newArray.length; i++) {
                int sum2 = myArray[i] + newArray[i];
                System.out.println("Summe beider Array-Werte: " + sum2);
            }
        }
    }

}
