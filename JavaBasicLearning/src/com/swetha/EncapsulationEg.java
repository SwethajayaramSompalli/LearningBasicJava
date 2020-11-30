package com.swetha;
/*
 * Encapsulation: Binding data by making the variables private and accessing only by methods
 * Add getters and setters and make variables private
 * to maintain a log file as well, that can be done in methods
 */

class Student {
	private int rollNo;
	private String Name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}
public class EncapsulationEg {

	public static void main(String[] args) {
		Student s = new Student();
		//s.rollNo = 5;
		s.setRollNo(3);
		s.setName("Swetha");	
		System.out.println("Studet ID: "+s.getRollNo()+" Student Name: "+s.getName());
	}

}
