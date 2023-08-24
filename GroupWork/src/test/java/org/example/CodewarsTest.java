package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CodewarsTest {
    @Test
    void IsXY_inQuadrant1() {
        int x = 3;
        int y = 5;
        int actual = Codewars.euclidean(x,y);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void IsXY_inQuadrant2() {
        int x = -3;
        int y = 5;
        int actual = Codewars.euclidean(x,y);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void IsXY_inQuadrant3() {
        int x = -3;
        int y = -5;
        int actual = Codewars.euclidean(x,y);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void IsXY_inQuadrant4() {
        int x = 3;
        int y = -5;
        int actual = Codewars.euclidean(x,y);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void XY_isNotInAnyQuadrant() {
        int x = 0;
        int y = 0;
        int actual = Codewars.euclidean(x,y);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void month_isPartOf_Quarter1() {
        int x = 2;
        int actual = Codewars.quarterOfTheYear(x);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void month_isPartOf_Quarter2() {
        int x = 4;
        int actual = Codewars.quarterOfTheYear(x);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void month_isPartOf_Quarter3() {
        int x = 9;
        int actual = Codewars.quarterOfTheYear(x);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void month_isPartOf_Quarter4() {
        int x = 10;
        int actual = Codewars.quarterOfTheYear(x);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void month_isNotPartOf_AnyQuarter() {
        int x = 13;
        int actual = Codewars.quarterOfTheYear(x);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}
