	
	package com.app;
	
	
	public class Mobile_Digits_Sum {
		public static void main(String args[]) {
	
	
			String number="9000647827";
			int sum=0;
			for (int i = 0; i < number.length(); i++) {
	
			sum=sum+Integer.parseInt(String.valueOf(number.charAt(i)));
			}
	
			System.out.println(sum);	     
	
		}}						     