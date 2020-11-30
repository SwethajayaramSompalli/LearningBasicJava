package com.swetha;
/*
 * Dynamic method dispatch and run time polymorphism
 */
class E{
	public void show() {
		System.out.println("In Class E");
	}
}
class F extends E{
	public void show() {
		System.out.println("In Class F");
	}
	public void config() {
		System.out.println("In Class F - config");
	}
}
class G extends E{
	public void show() {
		System.out.println("In Class G");
	}
}



public class DynamicMethodDispatch {

	public static void main(String[] args) {
		
		//F f = new F();	instead of this we will use E referance
		
		E e = new F(); 	//runtime polymorphism
		e.show();
		//e.config(); This wont work as refernced class E dont have config medthod

		e = new G();	//Dynamic method dispatch
		e.show();
	}

}
