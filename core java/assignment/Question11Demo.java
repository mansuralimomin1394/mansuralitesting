package com.assignment;
//WAP to find the index of an array element.
public class Question11Demo {

	public static void main(String[] args) 
	{
        int[] array = {10, 22, 43, 64, 59};
        
        int elementToFind = 64;
        
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                index = i;
                break;
            }
        }
        
        if (index != 0) 
        {
            System.out.println("Index of " + elementToFind + " is: " + index);
        }
        else 
        {
            System.out.println("Element not found in the array.");
        }
    }
}
