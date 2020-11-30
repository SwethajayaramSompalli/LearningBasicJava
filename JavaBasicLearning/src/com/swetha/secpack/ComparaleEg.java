package com.swetha.secpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Stud implements Comparable<Stud>  {
	
	int rollNo;
	String name;
	int marks;
	public Stud(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Stud s) {
		
		return name.length()>s.name.length()?1:-1;
	}
}
public class ComparaleEg {

	public static void main(String[] args) {
		
		List<Stud> studs = new ArrayList<>();
		
		studs.add(new Stud(2,"Swetha",87));
		studs.add(new Stud(4,"Hash", 78));
		studs.add(new Stud(7,"Ram", 99));
		studs.add(new Stud(8,"Sam", 36));
		studs.add(new Stud(9,"Ajy", 45));
		
		Collections.sort(studs);		//Collections class has Sort() method not the Collection interface.
		
		for(Stud s: studs) {
			System.out.println(s);
		}
		
		System.out.println("We can override it by using lamba expression by using comparator object");
		
		Collections.sort(studs, (i,j)->i.marks>j.marks?1:-1);
		for(Stud s: studs) {
			System.out.println(s);
		}
	}

}
