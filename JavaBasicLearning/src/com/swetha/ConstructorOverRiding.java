package com.swetha;
class C{
	int i;
	public void show() {
		System.out.println("In A and Super key word made to call this with int: "+i);
	}
}

class D extends C{
	
	int i;
	
	//@Override
	public void show() {
		super.i=8; // Assign variables in super class by using super keyword
		
		super.show(); //calling super class method show
		System.out.println("In B and int i value is: "+i);
	}
}


public class ConstructorOverRiding {

	public static void main(String[] args) {
		
		D d = new D();
		d.show();
		
	}
}
