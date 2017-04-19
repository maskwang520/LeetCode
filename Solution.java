package com.java.day01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Date:     2017年4月10日 上午8:36:31
 * @author   maskwang 
 * @since    JDK 1.6
 *  function：Letter Combinations of a Phone Number
 */
public class Solution {
	static Map<Integer,String> hm=new HashMap<Integer,String>();
	static List<String> list=new ArrayList<String>();
	static StringBuilder sb=new StringBuilder();
	static String digit ;
	static int len;
	static int flag=1;
	   public static List<String> letterCombinations(String digits) {
		   if(digits.length()==0){
			   return list;
		   }
		   
			   
		    digit=digits;
		    len=digits.length();
	        hm.put(2,"abc");
	        hm.put(3,"def");
	        hm.put(4,"ghi");
	        hm.put(5,"jkl");
	        hm.put(6,"mno");
	        hm.put(7,"pqrs");
	        hm.put(8,"tuv");
	        hm.put(9,"wxyz");
	        if(digits.length()==1){
	        	
			 String s=hm.get(digits.charAt(0)-'0');
			 for(int m=0;m<s.length();m++){
				 list.add(s.charAt(m)+"");
			 }
			 
		     return list;
			}
	        getString(0,hm.get(Integer.parseInt(digits.charAt(0)+"")));
	        return list;
	    }
    
		   
	public static void getString(int i,String str){
		int k;
		if(i<len){
			for( k=0;k<str.length();k++){
			   flag=1;
			   sb.append(str.charAt(k));
			   if(i+1<digit.length())
			   getString(i+1,hm.get(Integer.parseInt(digit.charAt(i+1)+"")));
			   if(flag==1)
			   list.add(sb.toString());
			   sb.delete(i, i+1);
			}
			if(k==str.length())
				flag=0;
		}
		
		else
			return;
	
	}
	public static void main(String[] args) {
//		String s="a";
//		System.out.println(s.charAt(1));
		
		
		 System.out.println(letterCombinations("3")) ;

		 
	}
	
}
	   