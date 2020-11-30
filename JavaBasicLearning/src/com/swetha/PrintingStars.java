package com.swetha;

public class PrintingStars {

	public static void main(String[] args) {
		//Print 4 stars
		/*
		 *   ****
		 *   ****
		 *   ****
		 *   ****
		 */
		System.out.println("\nWith two for loops");
		for ( int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
		System.out.println("\nWith one for loop");
		
		for ( int i = 0; i < 4; i++) {
			
			System.out.println("\n****");
		}
		
		/*Print this now  
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 123456
		 */
		
		System.out.println("\n");
		for ( int i = 0; i < 6; i++) {
			for (int j = 0; j < (i+1); j++) {
				System.out.print(j+1);
			}
			System.out.println("\n");
		}
		
		/*Print this now  
		 * A
		 * A B
		 * A B C
		 */
		char c = 65;
		System.out.println("\n");
		for ( int i = 0; i < 3; i++) {
			for (int j = 0; j < (i+1); j++) {
				System.out.print(((char)(c+j)));
			}
			System.out.println("\n");
		}
		
		
		/*Print this now  
		 * $ $ $ $
		 * $     $
		 * $     $
		 * $ $ $ $
		 */
		short n=4;
		System.out.println("\n");
		for ( int i = 0; i < 4; i++) {
			if(i==0 || i==n-1) {
				System.out.println("$ $ $ $");
			}
			else
			{
				System.out.println("$     $");
			}
			
		}
		
		
	}
}
