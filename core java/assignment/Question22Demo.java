package com.assignment;
//WAP to Copy one array into another.
public class Question22Demo 
{
	    public static void main(String[] args) 
	    {
	    int a[]= {11,22,33,44,55,66};
	    int b[]=new int[a.length];
	    b=a;
	    
	    System.out.println("a[] :");
	    for(int i=0;i<a.length;i++)
	    	System.out.print(a[i]+" ");
	    
	    System.out.println("\n Con of b[] :");
	    
	    for(int i=0;i<b.length;i++)
	    System.out.print(b[i]+" ");
	    }
}
	        
