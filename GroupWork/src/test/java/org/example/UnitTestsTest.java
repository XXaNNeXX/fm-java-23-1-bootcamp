package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnitTestsTest {

    @Test
    void calculateSum() {
        // GIVEN
        int a = 3;
        int b = 5;
        // WHEN
        int actual = UnitTests.sum(a,b);
        // THEN
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void number_isEven() {
        // GIVEN
        int a = 7;
        // WHEN
        boolean actual = UnitTests.even(a);
        // THEN
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateProduct() {
        // GIVEN
        int x = 2;
        int y = 3;
        // WHEN
        int actual = UnitTests.product(x,y);
        // THEN
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convert_toUpperCase() {
        // GIVEN
        String a = "nice";
        // WHEN
        String actual = UnitTests.upperCase(a);
        // THEN
        String expected = "NICE";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void number_isPositive() {
        // GIVEN
        int b = -7;
        // WHEN
        boolean actual = UnitTests.positive(b);
        // THEN
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}
