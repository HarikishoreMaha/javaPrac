package com.app;

import java.util.Arrays;

public class Arrays_example1 {
	public static void main(String[] args) {
		
		/*Given an int array, return a new array
		 *  with double the length where its last element is the 
		 *  same as the original array, and all the other elements are 0. 
		 *  The original array will be length 1 or more. Note: by default, 
		 *  a new int array contains all 0's
		 */	
		
		/*now modify the program to insert 1 as 
		default elements in new array except
		last one
		*/
		int[] a = {1,2,3,4,5};
			
		int[] b= new int[a.length*2];
		for (int i = 0; i < b.length-1; i++) {
			b[i]=1;
			
		}
		b[2*a.length-1]=a[a.length-1];
		System.out.println("size of 1st array="+a.length);
		
		System.out.println(Arrays.toString(a));
		System.out.println(" ");
		
		System.out.println("size of new array="+b.length);
		System.out.println(Arrays.toString(b));

}
}