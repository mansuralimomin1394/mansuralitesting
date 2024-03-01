package com.assignment;

public class Question15Demo 
{
	public static void main(String[] args) 
	{
		int n=10;
		try {
			System.out.println(n/0);
		} catch (Exception error) 
		{
			System.out.println("We cant divide any number with zero.");
		}
		System.out.println("DO your Next Code");
	}
}
