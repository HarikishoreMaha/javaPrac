package com.app;

public class StringMethods_Examples {
	
	public static void main(String[] args) {
		
		String s1="harikishore";
		
		String s2="Harikishore";
		
		System.out.println(s2.equals(s1));
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s2.charAt(4));
		System.out.println(s2.toUpperCase());
		System.out.println(s2.concat(s1));
		
		System.out.println(s2.toUpperCase());
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 10));
		System.out.println("length of s1 is="+s1.length());
		
		//String[] s10= new String[10];
		String[] s10={"my","name","is","hari","kishore"};
		for (int i = 0; i <=s10.length; i++) {
			System.out.print(s10[i]+" ");
			
		}
	}

}
