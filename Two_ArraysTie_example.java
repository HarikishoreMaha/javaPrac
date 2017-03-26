		package com.app;
		
		import java.util.Arrays;
		
		public class Two_ArraysTie_example {
		
			/*Start with 2 int arrays, a and b, each length 2.
										Consider the sum of the values in each array. 
										Return the array which has the largest sum.
										In event of a tie, return a.
			 */
		
			public static void main(String[] args) {
		
				int[] a={3,5};
				int[] b={3,5};
		
				int x=a[0]+a[1];
				int y=b[0]+b[1];
		
				if (x>=y) 
				{System.out.println(Arrays.toString(a));	}
				else { 
					System.out.println(Arrays.toString(b));		}			
			}		
		}
		
