package com.swetha;
class H{
	
	//Final variable acts like a Constant and should be in caps
	final int DAY; 				//If not specified with value we can assign it once
	final String CEO = "Raji";	//If specified at declaration, we cannot change the value of final variable
	
	H(){
		DAY=0;
	}
	final public void show() {
		System.out.println("In H show");
	}
	public void display() {
		System.out.println("In H display");
	}

	public int getDAY() {
		return DAY;
	}

	public String getCEO() {
		return CEO;
	}
	
	//No setters for Final variables
	
}

class K extends H{
	
	//public void show() {
							// Final key word next to method will not allow overriding it.
	//}
	
	public void display() {
		System.out.println("In K display");
	}
}


//If a class is final it cannot be extended, Class J cannot be extended.

//final class J{
	
//}
//class I extends J

//Final key word can be used for Class, Variable, Methods
public class FinalEg {

	public static void main(String[] args) {
		
		H h = new H();
	
		System.out.println("CEO: "+h.getCEO());
		System.out.println("DAY: "+h.getDAY());
		
		K k = new K();
		
		System.out.println("Day in K: "+k.getDAY()); // Final variable can be accessed by extended classes
		k.show(); 			// Only parent - final keyword used show method will be accessed
		k.display();		// Display method from K class will be called.

	}
	
	
}
