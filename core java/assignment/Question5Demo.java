package com.assignment;

import java.util.Scanner;

public class Question5Demo
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        // Count number of digits
        for (originalNumber = number; originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        // Calculate the result
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if number is Armstrong
        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
