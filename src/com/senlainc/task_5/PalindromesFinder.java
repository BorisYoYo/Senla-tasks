package com.senlainc.task_5;

import java.util.Scanner;

public class PalindromesFinder {

    private Scanner scanner;
    private int number;

    public static void main(String[] args) {
        PalindromesFinder pf = new PalindromesFinder();
        pf.number = pf.numberInput();
        pf.findPal(pf.number);
    }

    public int numberInput() {
        scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        while (true) {
            try {
                number = scanner.nextInt();
                if (number > 100 || number < 0) {
                    System.out.print("Number range error: ");
                    continue;
                }
                scanner.close();
                return number;
            } catch (Exception ex) {
                System.out.print("Wrong input! Try again: ");
                scanner.next();
                continue;
            }
        }
    }

    public StringBuilder intToStringBuilder(int number) {
        return new StringBuilder(String.valueOf(number));
    }

    public void palindromes(int number) {
        StringBuilder sb = intToStringBuilder(number);
        if (sb.toString().equals(sb.reverse().toString()) && number > 9) {
            System.out.println(sb);
        } else {
            //ignore
        }
    }

    public int findPal(int number) {
        if (number == 0) {
            return 0;
        }
        palindromes(number);
        return findPal(number - 1);
    }
}
