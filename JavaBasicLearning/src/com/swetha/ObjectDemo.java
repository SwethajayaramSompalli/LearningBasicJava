package com.swetha;
class Calc{
	int num1;
	int num2;
	int result=0;
	//result=num1+num2;
	//result = num1+num2;
	public void perform()
	{
		result=num1+num2;
	}
}

public class ObjectDemo {
	public static void main(String args[]) {
		Calc obj1; // This is just reference
		obj1 = new Calc(); // this is creating an object with key work new and the constructor
		//Calc obj1 = new Calc();
		obj1.num1=2;
		obj1.num2=4;
		obj1.perform();
		System.out.println("the result is: "+obj1.result);
		
	}
}

