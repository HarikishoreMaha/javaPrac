package com.app;

public class StringArray {
	public static void main(String[] args) {

		String s1="hi how are you";
		String[] s2= s1.split(" ");
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i]);
			System.out.println();

		}

		for (int i=s2.length-1; i>=0; i--) {
			System.out.print(" "+s2[i]);
			System.out.println();

		}


		String s3="how are you friend";
		String[] s4=s3.split(" ");
		for (String string : s4) {

			System.out.print(string);

		}


		String s5= "reverse the sentence";
		for (int i = s5.length()-1; i>=0; i--) {
			System.out.print(s5.charAt(i));
			System.out.print(s5.replace(s5, " "));

		}	
	}


}


