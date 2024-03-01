package com.assignment;
/*
   1
  2 2
 3 3 3
4 4 4 4 
*/
public class Question7P3Demo 
{
	public static void main(String[] args) 
	{
		int n=4;
		int i,j,k;
		
		for(i=1;i<=n;i++)
		{
			for(k=i;k<=n;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
		System.out.println();
		}
	}
}
