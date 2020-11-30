package com.swetha.secpack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Workbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		LinkedList l = new LinkedList();
		
		
		
		List<Integer> a = Arrays.asList(12,4,25,63,34,23,44,53,32);
		//Old school or traditional for loop
		for(int i = 0; i<a.size();i++){
			System.out.println(a.get(i));
		}
		//enhanced for loop
		for(int i: a){
			System.out.println(i);	
		}
		//for each
		a.forEach(i -> System.out.println(i));
		
	    Integer myInt = 100;
	    String myString = myInt.toString();
	    System.out.println(myString.length());
	    
		String s = "123";
		Integer int1 = Integer.parseInt(s);
		int int2 = Integer.parseInt(s);
		System.out.println("String to Integer: "+int1+"String to int: "+int2);
		String s1 = int1.toString();
		String s2 = Integer.toString(int2);
		System.out.println("Integer to String: "+s1+" int to String: "+s2);
	    
	}

}
