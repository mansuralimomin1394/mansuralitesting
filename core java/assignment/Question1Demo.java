package com.assignment;
//Q1. W.A.J.P to Take three numbers from the user and print the greatest number.
import java.util.Scanner;

public class Question1Demo 
{
	public static void main(String[] args) 
	{
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the 1 number: ");
			int num1=in.nextInt();
			
			System.out.println("Enter the 2 number: ");
			int num2=in.nextInt();
			
			System.out.println("Enter the 3 number: ");
			int num3=in.nextInt();

			if(num1>num2 && num1>num3)
			{System.out.println("The greatest number is "+num1);}
			
			else if(num2>num1 && num2>num3)
			{System.out.println("The greatest number is "+num2);}
			else
			{System.out.println("The greatest number is "+num3);}
		}	
	}
}

