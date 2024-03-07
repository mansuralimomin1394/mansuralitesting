package com.assignment;

import java.util.Scanner;

//W.A.J.P to check given number is Prime or not?
public class Question4Demo 
{
	public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number: ");
			int no=sc.nextInt();
			int a=0;
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
				{
					a=1;
					break;
					
				}
			}	
			if(a==0)
			{
				System.out.println("Number is prime..."+no);
			}
			else
			{
				System.out.println("Number is not prime..."+no);
			}
		}
	}

