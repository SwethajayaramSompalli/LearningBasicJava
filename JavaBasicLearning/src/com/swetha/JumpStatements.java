package com.swetha;

public class JumpStatements {

	public static void main (String[] args) {
		
		// Jump statements are - break and continue 
		//Break - get out of the loop
		//Continue - Skip the statements and continue from 
		
		for ( int i = 0; i <10; i++) {
			{
				if (i==4||i==6)
					continue;
				if (i==9)
					break;
				System.out.println("Number is : "+i);
			}
		}
	}
}
