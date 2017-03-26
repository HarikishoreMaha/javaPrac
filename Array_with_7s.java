		package com.app;
		
		public class Array_with_7s {
		
			/*Given an array of ints, return true if the array
				  contains two 7's next to each other, or there are two 7's 
					separated by one element, such as with {7, 1, 7}.
			 */
		
		
		
			public static void main(String[] args) {
				int[] a={2,7,7,1,7,2,5,7};
				
				
				//int i = 3;
				for (int i = 1; i < a.length-1; i++) {
					
				
				if (a[i]==a[i+1]||a[i-1]==a[i+1])
				{
					System.out.println(true);
				}
				else System.out.println(false);
				
				}
			}}			