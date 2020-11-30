package com.swetha.secpack;

public class ExceptionEg {

	public static void main(String[] args) {
		int i = 10, j = 2;
		int[] a = new int[6];
		
				//null point exception
		
		try {									// try is not a method - dont write try()
			int[] b = null;	
			b[2]=34;
			int k = i/j;
			a[30]=12;
			System.out.println("The output: "+k);
		}
		//catch(Exception e) {
		//catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {	
		//we can write multiple exceptions in one catch block
		
		catch(ArithmeticException e) {
		System.err.println("Excetion: "+e);	
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
		System.err.println("Excetion: "+e);	
		}
		
		catch(Exception e) {
			System.err.println("Someother error: "+e);
		}
		finally{								// finally is not a method - dont write finally()
			System.out.println("Ok Bye");
		}

	}

}
