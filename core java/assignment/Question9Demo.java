package com.assignment;
//WAP to sum values of an array.
public class Question9Demo 
{
	public static void main(String[] args) 
	{
		int []array= {1,2,3,4,5};
		int length= array.length;
		int sum=0;
		for(int i=0;i<length;i++)
		{
			sum=sum+array [i];
		}
		System.out.println("Sum of elements of array :"+ sum);
	}

}
