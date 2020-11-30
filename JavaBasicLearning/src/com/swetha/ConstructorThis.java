package com.swetha;
class Caladd{
	int num1;
	int num2;
	int result;
	
	public Caladd() {
		result= 0;
	}
	public Caladd(int num1) {
		result = num1 +10;
	}
	public Caladd(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		result = this.num1+this.num2;
	}
	
}
public class ConstructorThis {

	public static void main(String[] args) {
		Caladd obj1 = new Caladd();
		System.out.println("The result is :"+obj1.result);
		Caladd obj2 = new Caladd(15);
		System.out.println("The result is :"+obj2.result);
		Caladd obj3 = new Caladd(12,34);
		System.out.println("The result is :"+obj3.result);
		
	}
}
