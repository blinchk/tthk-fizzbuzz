package com.laus.fizzbuzz.tests;

import com.laus.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {
    @Test
    public void shouldReturn0() {
        Assertions.assertEquals(FizzBuzz.of(0), ("0"));
    }
}
