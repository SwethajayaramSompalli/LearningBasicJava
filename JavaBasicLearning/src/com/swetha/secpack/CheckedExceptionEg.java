package com.swetha.secpack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*Throwable class
 * -> Exceptions and Errors
 * Exceptions -> Checked and unchecked
 * All are checked at compile time except  few ones which are classed unchecked or run time exceptions
 *
 * Resource should always be closed and that we generally do it in finally block.
 * Create the resource and use it in in try, handle it in catch, and close it in finally block
*/
public class CheckedExceptionEg {
	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter the number");
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("the number is: "+n);
		
		
		//from java 1.7 you dont have to close the resource in finally, infact finally and catch are not mandatory
		
		try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))){ //the resource will be closed
			//automatically once the try block ends.
			int nn = Integer.parseInt(br.readLine());
			System.out.println(nn);
		}
		br.close(); // this can be done in finally block
		
		//User defined exception
		
		int i=7, j=2, k;
		try{
			k=i/j;
			if(k==0) {
				throw new Exception();
			}
			if(k==1) {
				throw new newException("This is not possible");
			}
			System.out.println("The k value is: "+k);
		}
		
		catch(newException e) {
			System.out.println("Our new exception:"+e);
		}
		catch(Exception e) {
			System.err.println("Error: "+e.getMessage());
		}
		
		//throws - for method to accept all exceptions
		//throw is to throw an user defined/ exception
		//throwable is a root class for all exception and errors
		
		//Scanner
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("The scanned number: "+n);
		sc.close();
	}

}
