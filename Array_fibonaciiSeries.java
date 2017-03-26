package com.app;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_fibonaciiSeries {
	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5};
		
		int[] b= new int[a.length*2];
		
		System.out.println("1st array="+Arrays.toString(a));
		
		ArrayList<Integer> list = new ArrayList<>();
		b[0]=0; b[1]=1; b[2]=0;
		for (int i = 0; i < b.length-1; i++) {
			
			b[2]=b[0]+b[1];
			list.add(b[2]);
		
			
			b[0]=b[1];
			b[1]=b[2];
			
		}
		
		list.add(b[b.length-1*a.length-1]=0);
		list.add(b[b.length-1]=a[a.length-1]);
		
		System.out.print("2nd array="+list);
		
		
	}

}
