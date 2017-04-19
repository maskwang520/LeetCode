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
 *  Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
For example, given n = 3, a solution set is:
用回溯发放来遍历所有括号组合的可能，关键是把限制条件写好
 */
public class Solution {
	   static ArrayList<String> list=new ArrayList<String>();
	   static char c[]=new char[]{'(',')'};
	   static int right;
	   static int left;
	   static StringBuilder sb=new StringBuilder();
	   public static List<String> generateParenthesis(int n) {
//		   if(n==1){
//			   list.add("()");
//			   return list;
//		   }
	       right=0;
	       left=0;
	       fun(2*n,0);
		   return list;
	    }
	   public static void fun(int n,int i){
		   int k = 0;
		   if(i<n){
			   for(k=0;k<2;k++){
				   if(isRight(c[k],n)){
					   sb.append(c[k]);
					   fun(n,i+1);
					   sb.delete(i,i+1);
					   if(c[k]==')')
						   right--;
					   else
						   left--;
					  
					  
				   }
			   }
		   }
		   else{
			   list.add(sb.toString());
		   }
	   }
   public static boolean isRight(char c,int n){
	       if(c=='('){
	    	   if(left==n/2)
	    		   return false;
	    	   left++;
	    	   return true;
	       }
	       else{
	    	   if(right==n/2||right+1>left){
	    		   return false;
	    	   }
	    	   right++;
	    	   return true;
	       }
	   }
	public static void main(String[] args) {
//		String s="a";
//		System.out.println(s.charAt(1));
		
		
		 System.out.println(generateParenthesis(2)) ;

		 
	}
	
}
	   