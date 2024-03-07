package com.assignment;
//WAP to create one thread by extending Thread class in another class.
public class Question18Demo extends Thread
{
	public void run()
	{
		System.out.println("Thread is running.");
	}
	
	public static void main(String[] args) 
	{
	Question18Demo Q18=new Question18Demo();
	Q18.start();
	}
}
