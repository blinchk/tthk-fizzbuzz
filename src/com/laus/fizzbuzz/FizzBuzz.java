package com.laus.fizzbuzz;

public class FizzBuzz {
    static final String FIZZ = "Fizz";
    static final String BUZZ = "Buzz";

    public int[] getNumbers() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    public static String of(int i) {
        if (i == 0) return "0";
        if (i % 5 == 0 && i % 3 == 0) return FIZZ + BUZZ;
        if (i % 3 == 0) return FIZZ;
        if (i % 5 == 0) return BUZZ;
        return String.valueOf(i);
    }
}
