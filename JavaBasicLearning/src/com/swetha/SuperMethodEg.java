package com.swetha;
class A{
	public A(){
		System.out.println("In A");
	}
	public A(int i){
		System.out.println("In Int A");
	}
}

class B extends A{

	public B() {
		System.out.println("In B");
	}
	public B(int a){
		System.out.println("In Int B"+a);
	}
	public B(int a, int b){
		super(a);
		System.out.println("In double int B"+(a+b));
	}
		
	
}



public class SuperMethodEg{
	
	public static void main(String[] args) {
	
		System.out.println("__________________");
		B b = new B();
		System.out.println("__________________");
		B bb = new B(5);
		System.out.println("__________________");
		B bbb = new B(4,5);
		System.out.println("__________________");
		
	}
}


