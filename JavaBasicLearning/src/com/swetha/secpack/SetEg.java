package com.swetha.secpack;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEg {

	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<>();
		s.add(2);
		s.add(5);
		s.add(78);
		s.add(3);
		s.add(34);
		s.add(1);
		s.add(3);		//No error if duplicate value is added, but will not be there in the set
		//We can also check the boolean value of saving it in set by calling the function in print
		System.out.println(s.add(5));
		System.out.println("Hash Set");
		
		System.out.println(s);
		
		for(int i :s) {
			System.out.println(i);
		}

		//The sequence of added values is not the same as in display
		//Its due to the concept of Hash Set, where the data is saved by hashing algorithm where nearest value is fetched first.
		
		//If you want to get everything soted - accending order - use Tree set
		
		System.out.println("Tree Set");
		
		Set<Integer> t = new TreeSet<Integer>();
		t.add(2);
		t.add(5);
		t.add(78);
		t.add(3);
		t.add(34);
		t.add(1);
		t.add(3);
		System.out.println(t.add(5));
		System.out.println(t);
		
		for(int i :t) {
			System.out.println(i);
		}
	}

}
