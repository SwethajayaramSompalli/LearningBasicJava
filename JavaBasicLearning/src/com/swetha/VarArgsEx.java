package com.swetha;
class Cal{
	
	public int add(int ... n){ //variable length of arguments as an array
		int sum = 0;
		for (int i : n) {
			sum = sum + i;
		}
		return sum;
	}
}


public class VarArgsEx { // Passing variable number of arguments

	public static void main(String[] args) {
		
		Cal ad = new Cal();
		System.out.println(ad.add(50,64));
		System.out.println(ad.add(2,4,5,6)); //VarArgs is passing variable number of arguments as an array

	}
}
