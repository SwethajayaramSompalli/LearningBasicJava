package com.swetha;
class Casio{
	int num1, num2;
	String operation;
	
	//Constructor Overloading 
	public Casio() {
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
		System.out.println("num1: "+num1+" num2: "+num2+" Operation: "+operation);
	}
	public Casio(int i) {
		num1 = i;
		num2 = 0;
		operation = "Nothing";
		System.out.println("num1: "+num1+" num2: "+num2+" Operation: "+operation);
	}
	public Casio(int i, int j) {
		num1 = i;
		num2 = j;
		operation = "Nothing";
		System.out.println("num1: "+num1+" num2: "+num2+" Operation: "+operation);
	}
	public Casio(int i, int j, String k) {
		num1 = i;
		num2 = j;
		operation = k;
		System.out.println("num1: "+num1+" num2: "+num2+" Operation: "+operation);
	}
	
	//Method overloading
	
	public void add() {
		System.out.println("Addition: 0");
	}
	public void add(int i, int j) {
		System.out.println("Addition: "+(i+j));
	}
	public void add(int i, int j, int k) {
		System.out.println("Addition: "+(i+j+k));
	}
	public void add(double a, double b) {
		System.out.println("Addition: "+(a+b));
	}
}


public class MethodOverLoading {
	public static void main (String[] args) {
		
		Casio obj1 = new Casio();
		obj1.add();
		Casio obj2 = new Casio(2);
		obj2.add(3,5);
		Casio obj3 = new Casio(3,4);
		obj3.add(3.4,4);
		Casio obj4 = new Casio(3,4,"Add");
		obj4.add(2,4,6);
		
	}

}
