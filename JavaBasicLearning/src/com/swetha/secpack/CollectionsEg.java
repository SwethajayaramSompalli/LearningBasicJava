package com.swetha.secpack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



/*collection - concepts
 * Collection - Interface
 * Collections - Class
 * 
 * 
 * Collection - interface -> List - interface -> Array List class
 * Generics <>  - in this you mention value type in angular brackets - Integer for List, key value <Integer, Strings> for maps
 * Collection implements Iterator, which has next(), hasNext(), size() etc methods
 * 
 * 
 * 
*/
public class CollectionsEg {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		Collection<Integer> a = new ArrayList<>();
		Set<Integer> b = new HashSet<>();
		List<Integer> d = new ArrayList<>();
		Map<Integer,String> e = new HashMap<>();
		Set<Integer> f = new TreeSet<>();
		
		//Iterator i = (Iterator) new ArrayList();
		
		
		Collection g = new ArrayList();
		g.add(3);
		g.add(5);
		g.add("Swetha");
		g.add('d');
		g.add(5.46);
		
		System.out.println(g);
		
		Iterator ie = g.iterator(); // Sending all values of g to ie and iterating it to view all elements
		
		while(ie.hasNext()) {
			//System.out.println(ie); // Infinite loop if next element is not called.
			System.out.println(ie.next());
		}
		
		List l = new ArrayList();
		l.add(4);
		l.add(5);
		l.add(90);
		l.add(2,6);
		l.add(5);
		l.add("Swethu Harsha");		//wrapper class will take objects for boxing and unboxing
		
		
		for (Object o: l) {
			System.out.println(o);
		}
		

		List<Integer> ll = new ArrayList<>();
		ll.add(4);
		ll.add(5);
		ll.add(90);
		ll.add(2,6);
		ll.add(5);		//wrapper class will take objects for boxing and unboxing
		//ll.add("Swethu Harsha");		
		
		
		for (Object o: ll) {
			System.out.println(o);
		}
		
		
	}

}
