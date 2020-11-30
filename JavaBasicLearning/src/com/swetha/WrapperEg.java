package com.swetha;

import java.util.ArrayList;
import java.util.List;

public class WrapperEg {

	static Integer funSquare(Integer i) {		//cannot write method inside a method, it should be above.
		return i*i;
	}
	public static void main(String[] args) {
		String s = "123";
		Integer int1 = Integer.parseInt(s);
		int int2 = Integer.parseInt(s);
		System.out.println("String to Integer: "+int1+" String to int: "+int2);
		String s1 = int1.toString();
		String s2 = Integer.toString(int2);
		System.out.println("Integer to String: "+s1+" int to String: "+s2);
		
		//Boxing
		Integer hash  = new Integer(50);				//deprecated Integer(int) constructor in Java 9
		Integer hash2 = Integer.valueOf(50);			//Best practice of Boxing
		//Autoboxing
		Integer swe = 64;
		List<Integer> list = new ArrayList<>();
		list.add(1); // autoboxing
		//Autounboxing
		int hash3 = funSquare(swe);						//Sending and assigning premitive to wrapper class
		int swe2 = hash2;
		System.out.println("Boxing: "
							+ "\n Integer to int: "+hash+", "+ hash2
							+ "\nAutoBoxing: "
							+ "\n Integer to int: "+swe+", "+list.get(0)
							+ "\nAutounboxing: "
							+ "\n int to Integer: "+hash3+", "+swe2);
		
		
		/*int i = 5; //primitive data type
		Integer ii = new Integer(5); // Creating integer reference
		Integer iii = new Integer(i); // Wrapping - Boxing where we are assigning the primitive data type to int reference
		int j = iii.intValue(); //Unwrapping or Unboxing
		Integer iiii = ii; //autowrapping - autoboxing
		int k = iiii; //autounwrapping autounboxing
		String s = "123"; i = Integer.parseInt(s);
		System.out.println("i: "+i+" ii: "+ii+" iii: "+iii+" iiii: "+iiii+" j: "
		+j+" k: "+k); s=Integer.toString(i); System.out.println("s: "+s);
		*/	
		
		
	}

}
