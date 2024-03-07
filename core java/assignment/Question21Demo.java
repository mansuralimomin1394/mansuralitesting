package com.assignment;
//WAP to remove the third element from a array list.
import java.util.ArrayList;

public class Question21Demo {

	public static void main(String[] args) 
	{
		

	ArrayList<String> list_Strings = new ArrayList();
	  list_Strings.add("Red");
	  list_Strings.add("Green");
	  list_Strings.add("Orange");
	  list_Strings.add("White");
	  list_Strings.add("Black");
	  System.out.println("Arraylist: "+list_Strings);
	  list_Strings.remove(2);
	  System.out.println("New Arraylist: "+list_Strings);
	}
}	
