package com.senlainc.task_1;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberChecker {

    private Scanner scanner;
    private int number;

    public static void main(String[] args) {
        NumberChecker numCheck = new NumberChecker();
        numCheck.number = numCheck.numberInput();
        System.out.println("Number " + numCheck.number + " is " + numCheck.checkEvenOrOddNumber(numCheck.number)
                + " and " + numCheck.checkCompositeOrPrimeNumber(numCheck.number) + ".");
    }

    public int numberInput() {
        scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        while (true) {
            try {
                number = scanner.nextInt();
                scanner.close();
                return number;
            } catch (Exception ex) {
                System.out.print("Wrong input! Try again: ");
                scanner.next();
                continue;
            }
        }
    }

    public String checkEvenOrOddNumber(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }

    public String checkCompositeOrPrimeNumber(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        if (bigInteger.isProbablePrime((int)Math.log(number)) && number > 1) {
            return "prime";
        } else if (number > 1) {
            return "composite";
        } else {
            return "not prime or composite";
        }
    }
}
