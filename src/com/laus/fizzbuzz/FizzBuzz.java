package com.laus.fizzbuzz;

public class FizzBuzz {
    private int[] numbers;

    public int[] getNumbers() {
        numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
        }
        return numbers;
    }
}
