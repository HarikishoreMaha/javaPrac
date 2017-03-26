package com.app;

import java.util.ArrayList;

public class ArraList_Add_All {
	//This program is used to insert the all elements in the specified list.

	


	public static void main(String args[]) {
	 
	// create an empty array list1 with an initial capacity
	ArrayList<String> arrlist = new ArrayList<String>(5);
	 
	// use add() method to add elements in the list
	arrlist.add("one");
	arrlist.add("hk");
	arrlist.add("hk");
	 
	// let us print all the elements available in list1
	System.out.println("Printing list1:");
	for (String number : arrlist) {
	System.out.println("Number = " + number);
	}
	 
	// create an empty array list2 with an initial capacity
	ArrayList<String> arrlist2 = new ArrayList<String>(5);
	 
	
	// use add() method to add elements in list2
	arrlist2.add("two");
	arrlist2.add("hk");
	arrlist2.add("hk");
	arrlist2.add("hk");
	 
	// let us print all the elements available in list2
	System.out.println("Printing list2:");
	for (String number : arrlist2) {
	System.out.println("Number = " + number);
	}
	 
	
	// create an empty array list2 with an initial capacity
	ArrayList<String> arrlist3 = new ArrayList<String>(5);
	 
	
	// use add() method to add elements in list2
	arrlist3.add("three");
	arrlist3.add("hk");
	arrlist3.add("hk");
	arrlist3.add("hk");
	// let us print all the elements available in list2
		System.out.println("Printing list3:");
		for (String number : arrlist3) {
		System.out.println("Number = " + number);
		}
	 
		arrlist3.retainAll(arrlist2);
	// inserting all elements, list2 will get printed after list1
	arrlist.addAll(2,arrlist2);
	arrlist.addAll(arrlist3);
	System.out.println("Printing all the elements");
	// let us print all the elements available in list1
	try {
		
	
	for (String number : arrlist) {
	System.out.println("Number = " + number);}
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	
	}


