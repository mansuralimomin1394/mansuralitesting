package com.assignment;
//WAP to reverse an array of integer values.
public class Question23Demo 
{
	public static void main(String[] args) 
	{
	int a[]= {1,2,3,4,5,6,7};
	System.out.println("Original Array: ");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Array in reverse order: ");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
	}
}
