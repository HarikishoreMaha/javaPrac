package com.app;

import java.util.Scanner;

public class PrintEvenOddSeries {

	public static void main(String[] args) {

		int x;
		System.out.println("enter the number");
		System.out.print("even number series=");
		System.out.print("\t\t odd number series=");


		Scanner in= new Scanner(System.in);
		x=in.nextInt();

		if(x==0){
			System.out.println("dont enter Zero");}
		else{
			for(int n=0;n<=10;n++){

				if(n%2==0){
					System.out.print("even number series="+n);}}

			{for(int a=0;a<=10;a++)

				if(a%2!=0){
					System.out.println("odd number series="+a);
			}
			}//main

		}//class
}}