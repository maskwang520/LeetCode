package com.java.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.
 */
public class Solution {
	   static int []array;
	   static int sum=0;
	   static int targets;
	   static int k;
	   static List <List<Integer>> list=new ArrayList<List<Integer>>();
	   static List <Integer> list1=new ArrayList<Integer>();
	   
	   public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		    array=candidates;
		    targets=target;
	        //list.add(Arrays.asList(target));
	        fun();
	        
	        return list;
	    }
	    public static void fun(){
	    	if(sum<targets){
		    	for(int i=0;i<array.length;i++){
		    	   sum+=array[i];
		    	   list1.add(array[i]);
		    	   k++;
		    	   fun();
		    	   sum-=array[i];
		    	   k--;
		    	   list1.remove(k);
		    	}
	    	}
	    	else{
	    		int flag=0;
	    		List<Integer> temp=new ArrayList<Integer>();
	    		if(sum==targets){
	    			temp.addAll(list1);
	    			for(int i=0;i<list.size();i++){
	    				//System.out.println(list);
	    				
	    				
	    				Collections.sort(list.get(i));
	    				//System.out.println(list1);
	    				Collections.sort(list1);
	    				//System.out.println("**"+list1);
	    				//System.out.println(list.get(i)+"**"+list1+"**"+list.get(i).equals(list1));
	    				if(list1.equals(list.get(i))){
	    					flag=1;
	    					break;
	    				}
	    				
	    			}
	    			if(flag==0){
	    			List<Integer> list3=new ArrayList<Integer>();
	    			list3.addAll(list1);
	    			list.add(list3);
	    			}
	    			list1.clear();
	    			list1.addAll(temp);
	    		}
	    	}
	    }
	public static void main(String[] args) {
	 System.out.println(combinationSum(new int[]{11,8,4,3,12,5},31)) ;
//		List<List<Integer>> list=new ArrayList<List<Integer>>();
//		List<List<Integer>> list4=new ArrayList<List<Integer>>();
//		List<Integer> list1=new ArrayList<Integer>();
//		list1.add(1);
//		list1.add(2);
//		list1.add(1);
//		List<Integer> list2=new ArrayList<Integer>();
//		list2.addAll(Arrays.asList(1,1,2));
//		list.add(list1);
//		list4.add(list2);
//		System.out.println(list);
//		//System.out.println(list4);
//        System.out.println(list.get(0).equals(list2));
		 
	}
	  
	
}
	   