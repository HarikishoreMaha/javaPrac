package com.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Alphabts_count_in_sentence {
	public static void main(String[] args) {
		
		String s1="hi how are you how whats going on";
		List<String> list=Arrays.asList(s1.split(" "));
		Set<String> uniqueWords= new HashSet<String>(list);
		for (String letter : uniqueWords) {
			System.out.print(Collections.frequency(list, letter));
			
			System.out.print("want to commit this to repository");
		}
	}

}
