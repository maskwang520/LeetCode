package com.java.day01;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 */
public class Solution {
	public static  List<List<String>> groupAnagrams(String[] strs) {
		    Map<String,List<String>> map=new HashMap<String,List<String>>();
		    for(String str:strs){
		    	char c[]=str.toCharArray();
		    	Arrays.sort(c);
		    	String str1=String.valueOf(c);
		    	if(map.containsKey(str1)){
		    		List<String> list=map.get(str1);
		    		list.add(str);

		    	}
		    	else{
		    		List<String> list=new ArrayList<String>();
		    		list.add(str);
		    		map.put(str1, list);
		    	}
		    }
		    List<List<String>> l=new ArrayList< List<String>>();
		    for(List<String> ls:map.values()){
		    	l.add(ls);
		    }
		    return l;
	}

	
	public static void main(String[] args) {
//	
		List<List<String>> list=groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
		System.out.println(list);
//	    char []c=new char[]{'a','b'};
//        char []c2=new char[]{'b','a'};
//	    Arrays.sort(c2);
//	    System.out.println(new String(c));
////	    System.out.println(c2.toString());
////	    System.out.println(c.toString().equals(c2.toString()));
		 
	}
	  
	
}
	   