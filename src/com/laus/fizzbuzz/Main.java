package com.laus.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fillNumbers();
        for (int number :
                fizzBuzz.getNumbers()) {
            System.out.println(FizzBuzz.of(number));
        }
    }
}
