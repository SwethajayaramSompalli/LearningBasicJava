package com.swetha;
class Emp{
	int eid;
	int sal;
	//Integer x ;
	static String ceo;//without static keyword, the ceo will be not be same.
	static String compName;
	static {
		ceo="Hema";
		compName="SwethaSoudham"; //Can access only static variables in static methods.
	}
	public void show() {
		System.out.println("Emp ID: "+eid+" Sal: "+sal+" CEO: "+ceo+" CompName: "+compName);
	}
	
}
public class StaticKeyword {
	public static void main (String[] args) {
		
		Emp swetha = new Emp();
		swetha.eid = 21;
		swetha.sal = 8000;
		//swetha.ceo = "Raji";
		//for static variables we will use class name
		//Emp.ceo="Raji";
		swetha.show();
		
		
		Emp harsha = new Emp();
		harsha.eid = 24;
		harsha.sal = 9000;
		//harsha.ceo = "Raji";
		
		
		harsha.show();
		
		//harsha.ceo = "Dora";
		Emp.ceo="Dora";
		
		swetha.show();
		harsha.show();
		
				
	}

}
