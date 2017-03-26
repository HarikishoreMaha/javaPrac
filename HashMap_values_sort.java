	package com.app;
	
	import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
	
	public class HashMap_values_sort {

		public static void main(String[] args) {
			
			
			TreeSet<String> set1= new TreeSet<>();
			set1.add("apple");
			set1.add("banana");
			set1.add("mango");
			set1.add("grapes");
			System.out.println(set1);
			
			HashMap<String, String> map1 = new HashMap<>();
			map1.put("one", "apple");
			map1.put("two", "banana");
			map1.put("three", "mango");
			map1.put("four", "grapes");
			System.out.println(map1);
			
			Map<? extends String, ? extends String> map = (Map<? extends String, ? extends String>) new ValuesComparator();
			HashMap<String, String> map2 = new HashMap<String, String>(map);
			map2.put("one", "apple");
			map2.put("two", "banana");
			map2.put("three", "mango");
			map2.put("four", "grapes");
			System.out.println(map2);
			
		}		}
	
	
	
	class ValuesComparator implements Comparator<String>
	{
	
			
			 
		

		@Override
		public int compare(String o1, String o2) {

			String s1= (String)o1;
			String s2= (String)o2;
			return ((String) o2).compareTo((String) o1);
			
			
		}
		
	}