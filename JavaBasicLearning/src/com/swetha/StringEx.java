package com.swetha;

public class StringEx {

	public static void main(String[] args) {
		String Str = new String("Welcome-to-Tutorialspoint.com");

		char[] c = Str.toCharArray();
		System.out.println(c);
		 System.out.println(""); System.out.println("Return Value :" ); for (String
		 retval: Str.split("-", 0)){ System.out.println(retval); }

		  System.out.println(""); System.out.println("Return Value :" ); for (String
		  retval: Str.split("-", 1)){ System.out.println(retval); }
		 
		  System.out.println(""); System.out.println("Return Value :" ); for (String
		  retval: Str.split("-", 2)){ System.out.println(retval); }
		
		  System.out.println(""); System.out.println("Return Value :" ); for (String
		  retval: Str.split("-", 3)){ System.out.println(retval); }
		  
		  System.out.println(""); System.out.println("Return Value :" ); for (String
		 retval: Str.split("-", 5)){ System.out.println(retval); }
		
		System.out.println(""); System.out.println("Return Value :" ); for (String
		 retval: Str.split("-")){ System.out.println(retval); }
		 
	}

}
