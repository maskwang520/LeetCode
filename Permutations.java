package com.java.day01;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * 排列组合问题
Given a collection of distinct numbers, return all possible permutations.
For example,
[1,2,3] have the following permutations:
 */
public class Solution {
	public static List<List<Integer>> list=new ArrayList<List<Integer>>();
	public static int []flag=new int[100];
	//public static int []array=new int [100];
	public static int count=0;
	public static List<Integer> l=new ArrayList<Integer>();
	   public static  List<List<Integer>> permute(int[] nums) {
	       fun(nums);
		   return list;
	    }
	 public static void fun(int []array){
		if(count<array.length){
		 for(int j=0;j<array.length;j++){
			 if(flag[j]==0){
				 flag[j]=1;
				 l.add(array[j]);
				 count++;
				 fun(array);
				 flag[j]=0;
				 count--;
				 l.remove(j);//不能是l.remove(j),j是不断变化，而remove是顺序的。
				 //j与count不总是同步的
			 }
		 }
		}
		else{
			List<Integer> temp=new ArrayList<Integer>();
			temp.addAll(l);
			list.add(temp);
			
			//l.clear();
			
		}
	 }
	public static void main(String[] args) {
	 System.out.println(permute(new int []{1,2,3})) ;

		 
	}
	  
	
}
	   