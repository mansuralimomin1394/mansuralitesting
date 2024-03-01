package com.assignment;
//WAP to find the maximum and minimum value of an array.
public class Question12Demo 
{
	public static void main(String[] args) 
	{
		int a[]= {10,15,5,20,3,1,177,50,70,110,160};
		
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
			
			}
		System.out.println("Maximum Element of array is :"+max);
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				
			}
			
		}
		System.out.println("Minimum Element of array is :"+min);
	}
}
