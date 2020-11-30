package com.swetha.secpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* Integer implements Comparator. we use the compare abstract method declared in comparator and override in Integer to solve this.
 * j%10 gives 1 unit's place value of any number.
*/
public class ComparatorEg {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(289);
		l.add(345);
		l.add(346);
		l.add(981);
		l.add(787);
		System.out.println(l);
		
		Comparator<Integer> c = new Comparator<Integer>() {
			//Comparator c = new Comparator() {		//It wont work without type definition
			public int compare(Integer i, Integer j) {
				i=i%10;
				j=j%10;
				return (i < j) ? -1 : ((i == j) ? 0 : 1);
			}
		};
		Collections.sort(l,c);
		System.out.println("After sorting");
		System.out.println(l);
		
		//lambda expression
		
		Comparator<Integer> c1 = ( i, j) -> (i%10>j%10?1:-1); //Lamda expression removing return anonymous class, types
		Collections.sort(l,c1);
		//Further we can also place all the code in sort method instead of invoking the object.
		
		
		Collections.sort(l,( i, j) -> (i%10>j%10?1:-1));
		}
}
