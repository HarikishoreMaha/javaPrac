package com.app;

import java.util.StringTokenizer;

public class this_si_next_noitacude {
	
	public static void main(String[] args) {
	

			 String s="this is next education";
			 String[] s2 =s.split(" ");
			
			 for (int i = 0; i < s2.length; i++) {
				 StringBuffer sb= new StringBuffer();
			 
				 if(i%2 != 0) {				 
				     StringBuffer ss=new StringBuffer();
				     ss.append(s2[i]);
				     sb.append(ss.reverse());
				 System.out.print(sb.toString()+" ");				
				 
			}else{
				 sb.append(s2[i]);
			     System.out.print(sb.toString()+" ");
			}
	}
}}