package com.app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet_Example {

	
	public static void main(String[] args) {
		
		HashSet<String> hs= new HashSet<String>();
		
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");

		
		System.out.println(hs);
		
		
LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		lhs.add("e");
		System.out.println(lhs);

		
		
TreeSet<String> ts= new TreeSet<String>();
		
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("e");
		
		
		System.out.println(ts);
	}
}
