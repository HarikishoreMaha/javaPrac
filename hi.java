package com.app;

public class hi {

	public static void main(String[] args) {
		
		String s= "hi how are you";
		System.out.println(s.length());
		String[] s1=s.split(" ");
		String s3 = s1.toString();
		//System.out.println(s3.length());
		System.out.println(s1.length);
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]);
			
		}
	}
}
