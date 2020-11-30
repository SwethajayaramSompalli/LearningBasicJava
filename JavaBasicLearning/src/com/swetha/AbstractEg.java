package com.swetha;
// Cannot create object for Abstract class - it is only for sub classes
// Abstract classes do not need required to have all abstract methods.

abstract class Human{			//Abstract class
	
	public abstract void walk();
	//Abstract method always should be in abstract class
	
	public void eat() {
		System.out.println("Eating");
	}
}

class Man extends Human{		//Concrete class
	
	//Always define abstract method or 
	public void walk() {
		System.out.println("Walking");
	}
}

class Printer{
	public void print(Number n) {
		System.out.println(n);
	}
}

abstract class  Write{
	public void write(){
		System.out.println("Im in write");
	}
}

class Pen extends Write{
	public void write(){
		System.out.println("Im a pen");
	}
}

class Pencil extends Write{
	public void write(){
		System.out.println("Im a pencil");
	}
}

class book{
	
	/*
	 * public void doSomething(Pen p) { p.write(); }
	 */
	
	public void doSomething(Write w) { //Like using number instead of Integer and Double
		w.write();
	}
}
public class AbstractEg {
	
	
	public static void main(String[] args) {
		Human harsha = new Man();
		harsha.eat();
		harsha.walk();
		
		Printer p = new Printer();
		p.print(7.5f);
		
		/*
		 * Pen pe = new Pen(); Pencil pc = new Pencil();
		 */
//		best practice is referance the parent class
		
		Write pe = new Pen();
		Write pc = new Pencil();
		
		book b = new book();
		b.doSomething(pe);	//we can pass both pencil and pen as argument is write.
		b.doSomething(pc);
		
		
	}

}
