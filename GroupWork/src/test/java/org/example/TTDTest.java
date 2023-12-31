package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TTDTest {

    @Test
    void fibonacci_returnResult_for_n0 () {
        int n = 0;
        int actual = TTD.fibonnaci(n);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fibonacci_returnResult_for_n1 () {
        int n = 1;
        int actual = TTD.fibonnaci(n);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void fibonacci_returnResult_for_n2 () {
        int n = 2;
        int actual = TTD.fibonnaci(n);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void fibonacci_returnResult_for_n3 () {
        int n = 3;
        int actual = TTD.fibonnaci(n);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void fibonacci_returnResult_for_n4 () {
        int n = 4;
        int actual = TTD.fibonnaci(n);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void fibonacci_returnResult_for_x4 () {
        int x = 7;
        int actual = TTD.fibonacci2(x);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
