package com.assignment;
//WAP to calculate the average value of array elements.
public class Question10Demo 
{
	public static void main(String[] args) 
	{
		int []array= {1,2,3,4,5,6,7,8,9,10};
		int length= array.length;
		int sum=0;
	
		
		for(int i=0;i<length;i++)
		{
			sum=sum+array [i];
	
		}
		float average=(float) sum/length;
		System.out.println("Average of elements of array :"+ average);
	}	

}
