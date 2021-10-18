package com.laus.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int[] numbers = fizzBuzz.getNumbers();
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            String valueToPrint = FizzBuzz.of(number);
            System.out.println(valueToPrint);
        }
    }
}
