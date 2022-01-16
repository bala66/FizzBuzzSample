package com.tdd.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FizzBuzzTest {

    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";
    public static final String FIZZ_BUZZ = "com.tdd.learn.FizzBuzz";

    @Test
    void testNumberOne() {
        assertEquals("1", FizzBuzz.getResult(1));
    }

    @Test
    void testNumberTwo() {
        assertEquals("2", FizzBuzz.getResult(2));
    }

    @Test
    void testNumberThree() {
        assertEquals(FIZZ, FizzBuzz.getResult(3));
    }

    @Test
    void testNumberFive() {
        assertEquals(BUZZ, FizzBuzz.getResult(5));
    }

    @Test
    void testNumberSix() {
        assertEquals(FIZZ, FizzBuzz.getResult(6));
    }

    @Test
    void testNumberTen() {
        assertEquals(BUZZ, FizzBuzz.getResult(10));
    }

    @Test
    void testNumberFifteen() {
        assertEquals(FIZZ_BUZZ, FizzBuzz.getResult(15));
    }

    @Test
    void testNumberThirty() {
        assertEquals(FIZZ_BUZZ, FizzBuzz.getResult(30));
    }
}
