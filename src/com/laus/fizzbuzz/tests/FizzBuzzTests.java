package com.laus.fizzbuzz.tests;

import com.laus.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {
    @Test
    public void shouldReturn0() {
        Assertions.assertEquals(FizzBuzz.of(0), ("0"));
    }

    @Test
    public void shouldReturn1() {
        Assertions.assertEquals(FizzBuzz.of(1), ("1"));
    }

    @Test
    public void shouldReturnFizz() {
        Assertions.assertEquals(FizzBuzz.of(3), ("Fizz"));
    }

    @Test
    public void shouldReturnBuzz() {
        Assertions.assertEquals(FizzBuzz.of(5), ("Buzz"));
    }

    @Test
    public void shouldReturnFizzBuzz() {
        Assertions.assertEquals(FizzBuzz.of(15), ("FizzBuzz"));
    }
}
