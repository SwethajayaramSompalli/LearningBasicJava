package com.swetha.secpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* List is called mutation, because we can change the data in the object created.
* STREAM API provides Immutability
*/
public class ListEg {


	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(95);
		l.add(3);
		l.add(8);
		l.add(6);
		System.out.println("List values");
		for(Integer i : l) {
			System.out.println(i);
		}
		Collections.sort(l);		//This will sort the values
		System.out.println("After Sorting");
		System.out.println("List values");
		for(Integer i : l) {
			System.out.println(i);
		}
		Collections.reverse(l);
		System.out.println("After Reverse");
		
		/*
		 * System.out.println("List values"); for(Integer i : l) {
		 * System.out.println(i); }
		 */
		
		int i = 15771;
		i = i%10;
		
		System.out.println(l);
		System.out.println(i);
		
		
	
	}
	
	
}
