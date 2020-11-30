package com.swetha.secpack;

/*Synchronized - will make the method use one thread at a time. so that multiple thread wont work at a time and cause difference in 
 * result. asynchronized are called not thread safe classes or methods.
 * Synchronized word is written to methods between access modifiers and return type
 * 
*/

class Counter extends Thread{
	int c;
	public synchronized void count() {
		c++;
	}
}

public class SynchronizedEg {

	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					c.count();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					c.count();
				}
			}
			
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Total counter: "+c.c);
		
		/*
		 * //for each: int[] a = {1,4,5,6,7}; for(int k: a) {
		 * System.out.println("a value:"+k); }
		 */
	}

}

