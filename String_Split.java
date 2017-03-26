package com.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class String_Split {
	
	public static void main(String[] args) {
		
		String s1="iam harikishore reddy";
		char[] c1=s1.toCharArray();
		//String[] s1=s.split(" ");
		/*for (int i = s1.length-1; i >=0; i--) {
			System.out.print(s1[i]+" ");
			
		}*/		
		//String[] reverse = new String[s1.length()];
		/*char[] reverse=  s1.toCharArray();
		
		for(int i=(reverse.length)-1;i>=0;i--){
			System.out.print(reverse[i]);
		}*/
		 
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		Integer count=0;
		for(int i= c1.length -1 ; i>=0 ;i--){
			if(map.containsKey(c1[i])){
				map.put(c1[i], map.get(c1[i])+1);
			}
			else{
				map.put(c1[i], 1);
			}
			
			//System.out.println(entrySet.);
		}
		Set<Map.Entry<Character,Integer>> entrySet=map.entrySet();
		//Map<K, V>.Entry<K, V>map.entrySet();
		for (Entry entry : entrySet) {
			System.out.println(entry.getKey()+","+ entry.getValue());
		}
	}

} 