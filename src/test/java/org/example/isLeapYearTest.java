package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isLeapYearTest {
    @Test
    void testDivisibleByFourAndNotHundred() {
        isLeapYear tester = new isLeapYear();

        assertTrue(tester.isLeapYear(2024));
    }
    @Test

    void testDivisibleByFourHundred() {
        isLeapYear tester = new isLeapYear();

        assertTrue(tester.isLeapYear(2000));
    }
    @Test

    void testNotDivisibleByFour() {
        isLeapYear tester = new isLeapYear();

        assertFalse(tester.isLeapYear(2023));
    }

    @Test
    void testDivisibleByHundredAndNotFourHundred() {
        isLeapYear tester = new isLeapYear();

        assertFalse(tester.isLeapYear(1700));
    }
}