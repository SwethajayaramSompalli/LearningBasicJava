package com.swetha;

public class ArrayEx {

	public static void main(String[] args) {
	//	int[] a = new int[10];
	//	int[] b;
	//	b = new int[8];
		int c[] = {2,6,5,9,3,6,8};
		System.out.println(c[4]);
		System.out.println("Enhanced or for each loop \n");
		
		for(int i : c) {			//c[0] etc values goes to 'i'
			System.out.print(i+" ");
		}
		
		int[][] d = {
						{1,4,7,6},
						{5,7,8,7,4},    			//Jagged array
						{6,7,2,3},
						{6,1,4}
					};
		
		System.out.println(d[2][1]);
		
		for(int i=0; i<d.length;i++) {
			System.out.println("");
			for (int j=0; j<d[i].length;j++) {
				System.out.print(d[i][j]+" ");
			}
		}
		
		System.out.println("\nEnhanced or for each loop \n");
		for (int[] k : d) {
			for (int i : k) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		
		
		
	}
}
