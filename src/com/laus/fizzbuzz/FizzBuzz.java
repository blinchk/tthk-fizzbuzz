package com.laus.fizzbuzz;

public class FizzBuzz {
    static final String FIZZ = "Fizz";
    static final String BUZZ = "Buzz";
    private int[] numbers;

    public static String of(int i) {
        if (i == 0) return "0";
        if (i % 5 == 0 && i % 3 == 0) return FIZZ + BUZZ;
        if (i % 3 == 0) return FIZZ;
        if (i % 5 == 0) return BUZZ;
        return String.valueOf(i);
    }

    private int[] generateNumbers() {
        int[] ints = new int[100];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }
        return ints;
    }

    public void fillNumbers() {
        this.setNumbers(this.generateNumbers());
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
