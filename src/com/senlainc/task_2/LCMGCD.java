package com.senlainc.task_2;

import java.util.Scanner;

public class LCMGCD {

    private long [] numbers = new long[2];
    private Scanner scanner;

    public static void main(String[] args) {
        LCMGCD lcmgcd = new LCMGCD();
        lcmgcd.numberInput();
        System.out.print(lcmgcd.toStringGCD());
        System.out.println(lcmgcd.toStringLCM());
    }

    public String toStringGCD() {
        return "Greatest common divisor of numbers " + numbers[0] + " and " + numbers[1] + " is "
                + getGCD(numbers[0],numbers[1]) + ". ";
    }

    public String toStringLCM() {
        return "Least common multiple of numbers " + numbers[0] + " and " + numbers[1] + " is "
                + getLCM(numbers[0],numbers[1]) + ". ";
    }

    public long [] numberInput() {

        String counter = "first";
        scanner = new Scanner(System.in);
        int index = 0;

        System.out.print("Enter the first number: ");
        while (true) {
            try {
                if (index != 1) {
                    numbers[index] = scanner.nextLong();
                    index++;
                    counter = "second";
                    System.out.print("Enter the second number: ");
                } else {
                    numbers[index] = scanner.nextLong();
                    scanner.close();
                    return numbers;
                }
            } catch (Exception ex) {
                System.out.print("Wrong input! Enter the " + counter + " number: ");
                scanner.next();
                continue;
            }
        }
    }

    //Greatest common divisor
    public long getGCD(long a,long b){
        return b == 0 ? a : getGCD(b,a % b);
    }

    //Least common multiple
    public long getLCM(long a,long b){
        return a / getGCD(a,b) * b;
    }
}
