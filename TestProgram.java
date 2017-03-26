package com.app;

public class TestProgram {

	 int i,j;
	
	public static void main(String[] args) {
		/* * * * * * 
		* * * * * 
		* * * * 
		* * * 
		* * 
		*/ 

		for (int i = 7; i>1; i--) {
			for (int j = i; j>1; j--) {
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
		
		//hi   
		//hi hi   
		//hi hi hi   
		//hi hi hi hi   
		//hi hi hi hi hi   

		
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("hi"+" ");
				
			}
		System.out.println("  ");	
		}
	}
}
