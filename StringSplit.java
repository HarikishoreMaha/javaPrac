package com.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringSplit {
	public static void main(String args[]) throws IOException { 
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string: ");
        String s = "this is redicolus";
        String reverse = "";
        int length = s.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + s.charAt(i);
        System.out.println("Result:" + reverse); 
    } 
}