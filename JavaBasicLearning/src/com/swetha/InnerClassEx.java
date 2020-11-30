package com.swetha;
class Outer{
	
	/*
	 * Inner classes
	 * -> Member class
	 * -> Static class
	 * -> Anonymous class
	 */
	
	//System.out.println("In outer class, lets see how we will go to inner class: ");
		// Cannot run print statement in class, can use it in methods and constructors
		class Inner{
			
			public void display() {
				System.out.println("In inner class.");
			}
		}
		static class InnerStatic{
			
			public void display() {
				System.out.println("In Static inner class.");
			}
		}
}


public class InnerClassEx {

	public static void main(String[] args) {
		
		Outer obj = new Outer();
		Outer.Inner objIn = obj.new Inner();
		
		objIn.display();
		
		Outer.InnerStatic objStIn = new Outer.InnerStatic(); //for a static class
		objStIn.display();
		
		
	}

}
