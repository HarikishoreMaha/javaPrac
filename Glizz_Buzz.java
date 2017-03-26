package com.app;

import java.util.Scanner;

public class Glizz_Buzz {
	public static void main(String[] args) {
		//String s;
		System.out.print("please enter a number=");

		Scanner in= new Scanner(System.in);
		int i=Integer.parseInt(args[0]);
		//for (int i = 0; i < 17; i++) {
			
		
		if (i%3==0) {
			System.out.print("glizz");}
			
		else if (i%5==0) {
			System.out.println("buzzz");}
			
		else if (i%3==0&&i%5==0) {
			System.out.println("glizz--- buzzz");}
		else {
			System.out.println("entered number is not the multiple of 3 or 5 or 3and 5");	
			}
					
				}
				
			}
			
		
		
		
	


