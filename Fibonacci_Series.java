package com.app;

public class Fibonacci_Series {
	public static void main(String[] args) {

		int a=0,b = 1,c=0;
		int seriesCount=12;
		//System.out.print(a+" ");

		for (int i = 1; c < 15; i++) {
			
			System.out.print(c+" ");
			c=a+b;
			
			a=b;
			b=c;
		}
	}
}


