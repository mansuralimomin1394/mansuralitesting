package com.assignment;
//WAP to compute the sum of the first 100 prime numbers.
public class Question8Demo 
{
	public static boolean isPrime(int n) 
    {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	
    public static void main(String[] args) 
    {
        int count = 0;
        int number = 2;
        long sum = 0;

        while (count < 100) 
        {
            if (isPrime(number)) 
            {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }

    
}


