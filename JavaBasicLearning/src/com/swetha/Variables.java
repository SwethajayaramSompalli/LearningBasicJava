package com.swetha;

public class Variables {

	
	public static double fTod(float f) {
		double d = f;
		return d;
	}
	public static void main( String args[]) {
		int x=5_000_000, y=3_000;
		//Comments works like this.
		System.out.println("The integer x value is : "+x);
		System.out.println("The integer y value is : "+y);
		System.out.println("The sum of intergers x and y value is : "+(x+y));
		//float f = 5.5;
		//by default values with point is considered as double, hence we will give f next to the value.
		float f = 5.5f;
		double d = 3; //Implicit type conversion
		System.out.println("The float f value is : "+f);
		System.out.println("The double d value is : "+d);
		System.out.println("The sum of float f and d value is : "+(fTod(f)+d));
		System.out.println("The sum of float f and d value is : "+(f+(float)d));
		long l = 20_000l;
		//Explicit type conversion
		//Type casting small can be assigned to big or type caste it by giving primitive in brackets before variable
		System.out.println("The integer x value is : "+x);
		System.out.println("The long l value is : "+l);
		int i2= (int)l;
		System.out.println("The sum of intergers x and y value is : "+(x+i2));
		char c = 'a';
		String s = "abc";
		System.out.println("Char: "+c+" String: "+s);
				
	}
}
