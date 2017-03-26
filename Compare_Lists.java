package com.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Compare_Lists {
	public static void main(String[] args) {
		
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("hyd");
		list1.add("bang");
		list1.add("mum");
		list1.add("del");
		list1.add("pune");
		
		System.out.println("cities of collection 1 are"+"      "+list1);
		
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("hyd");
		list2.add("bang");
		list2.add("del");
		list2.add("kaokata");
		list2.add("noida");
		System.out.println("cities of collection 2 are"+"      "+list2);
		
		list2.retainAll(list1);
		System.out.println("common cities of both collections are :"+list2);
		
		HashSet<String> hs= new HashSet<>(list1);
		hs.retainAll(list2);
		System.out.println(hs);
		
		Iterator<String> itr=hs.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
			
		}
		
				
	}

}
