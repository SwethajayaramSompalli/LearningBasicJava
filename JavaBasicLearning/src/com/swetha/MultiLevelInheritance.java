package com.swetha;
class Calculator{
	public int add(int i, int j) {			//Super, Parent, Base  -Class
		return i+j;
	}
}

class AdvCalc extends Calculator{
	public int sub(int i, int j) {			//Sub , Child, Derived  - Class
		return i-j;
	}
}

class VeryAdvCalc extends AdvCalc{
	public int multi(int i, int j) {		//This is IS_A relationship, this dog is an animal
		return i*j;
	}
}

//All three levels class gives eg of multi level inheritance.

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		VeryAdvCalc obj = new VeryAdvCalc(); // This is HAS_A relationship, this class HAS A object
		
		System.out.println(obj.add(5,2));
		System.out.println(obj.sub(5,2));
		System.out.println(obj.multi(5,2));
		

	}

}
