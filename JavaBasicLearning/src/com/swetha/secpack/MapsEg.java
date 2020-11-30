package com.swetha.secpack;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class MapsEg {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("Name", "Swethu");
		m.put("Edu", "Btech");		
		m.put("Spouse", "Hash");
		m.put("Job", "IT");
		m.put("Edu", "Btech");		//No error shown as value will be replaced, it recognizes only one key
		m.put("Mom", "Raji");
		m.put("Dad", "Dora");
		m.put("Edu", "MS");		//Value is replaced when we try to assign it again
		System.out.println("HashMap: "+m);
		
		//HashMap will use Hashing algorithm and may have saved randomly and pull the data nearest first.
		//To call Maps as it has a key value pair which may not be in sequence we use KeySet() method which has all keys.
		System.out.println("HashMap Individual:");
		Set<String> keys = m.keySet();
		
		for(String k: keys) {
			System.out.println("Key: "+k+", Value: "+m.get(k));
		}
		
		//Same goes for HashTable except it is synchronized. - Thread safety
		//HashMap is not synchronized - non thread safe
		System.out.println("HashTable: "+m);
		Map<String, String> hT = new HashMap<>();
		hT.put("Name", "Swethu");
		hT.put("Edu", "Btech");		
		hT.put("Spouse", "Hash");
		hT.put("Job", "IT");
		hT.put("Edu", "Btech");		//No error shown as value will be replaced, it recognizes only one key
		hT.put("Mom", "Raji");
		hT.put("Dad", "Dora");
		hT.put("Edu", "MS");		//Value is replaced when we try to assign it again
		
		
		//HashMap will use Hashing algorithm and may have saved randomly and pull the data nearest first.
		//To call Maps as it has a key value pair which may not be in sequence we use KeySet() method which has all keys.
		System.out.println("HashTable Individual:");
		Set<String> tkey = hT.keySet();
		
		for(String k: tkey) {
			System.out.println("Key: "+k+", Value: "+m.get(k));
		}
		
		/*
		 * int[] nums = {2,7,8,4,3,8,5,1,3}; int target = 9;
		 * 
		 * Map<Integer, Integer> map = new HashMap<>(); for (int i = 0; i < nums.length;
		 * i++) { map.put(nums[i], i); } for (int i = 0; i < nums.length; i++) { int
		 * complement = target - nums[i]; if (map.containsKey(complement) &&
		 * map.get(complement) != i) { //return new int[] { i, map.get(complement) }; }
		 * }
		 */
		
	}
		

}
