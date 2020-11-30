package com.swetha;

public class SelectionStatements {

	public static void main (String [] args) {
		/*
		 * We have three selection statements
		 * 1. If else
		 * 2. Switch
		 * 3. Ternary
		 */
		
		//IF ELSE
		
		short s = 11;
		if(s%2==0) {
			System.out.println("This is an Even number");
		}
		else {
			System.out.println("This is an Odd number");
		}
		
		//Ternary operator
		int i = 10, j;
		j= i>5?1:0;
		System.out.println("The j value is "+j);
		
		//Switch case
		
		int n = 8; //can use char, string (only from 1.7) but never double

		switch(n) {
		case 1: System.out.println("One");
		break;
		case 2: System.out.println("Two");
		break;
		case 3: System.out.println("Three");
		break;
		case 4: System.out.println("Four");
		break;
		case 5: System.out.println("Five");
		break;
		default: System.out.println("None");
		}
	
		
	}
}
