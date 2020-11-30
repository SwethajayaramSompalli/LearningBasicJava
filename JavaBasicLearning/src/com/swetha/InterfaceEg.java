package com.swetha;
/*	Interface classes will have all methods by default as abstract - should define them in the implemented
 * classes. Any no. of interfaces classes can be implemented to a class.
 * An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.
 * Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
 * Methods in an interface are implicitly public.
 * An interface can extend another interface in the same way that a class can extend another class. 
 * The extends keyword is used to extend an interface, and the child interface inherits the methods of the parent interface.
 * Eg: public interface Hockey extends Sports, Event
 * Cannot create the object of interface except if you are creating an anonymous class.
*/


/* Types of Interfaces
 * 1. Normal - with more than 1 method
 * 2. SAM Single Abstract Method - Functional Interface for lambda expressions - derived from Scala
 * 3. Marker interface - with no methods - serializable 
 * Functional interface or SAM will have only one abstract method
 * By using the key word "Default" we can define and declare the other methods from java 1.8
 * before that we could only declare it.
 * For static methods we dont need to create any object. we can call by interface and method
 * all the variables created inside a interface will be by default final thats -> a constant
 */


@FunctionalInterface
interface Abc{
	int num=9;
	public void show(); //lambda expression works as only one abstract method is present here.
	default void display() { // this method can be overridden
		System.out.println("In Abc interface default method display");
	}
	default void view() {
		System.out.println("In Abc interface");
	}
	static void see() {
		System.out.println("In see method of Abc interface");
	}
}


interface Pqr{
	
	default void display() { // this method can be overridden
		System.out.println("In Abc interface default method display");
	}
	default void view() {
		System.out.println("In Pqr interface");
	}
}
class Impli implements Abc, Pqr {
	public void show() {
		System.out.println("In the Impli class implementing the Abc interface");
	}
	public void display() { // this method can be overridden rather using both the interfaces Abc and Pqr
		System.out.println("In Impli class of display method");
	}
	public void view() {
		Pqr.super.view(); //solving multiple inheritance issue in java 8
	}
}


public class InterfaceEg {

	public static void main(String[] args) {
		
		//Cannot create object to interface, so we will create one reference for the other class
		Abc a = new Impli();
		a.show();
		
		//Obj of interface with anonymous class
		Abc ab = new Abc(){
			public void show() {
				System.out.println("Object implementation of Abc interface using anonymous class");
			}
		};
		ab.show();
		//a.num = a.num+1; cannot change num value as it is defined in interface and would be considered as final or constant
		
		//Obj of interface with lambda expressions
		Abc abc = () -> System.out.println("Object implementation of Abc interface using lambda expressions");
		
		abc.show();
		a.display();
		ab.display();
		abc.display();
		a.view(); //Used super keyword.

		Abc.see();
		
	}

}
