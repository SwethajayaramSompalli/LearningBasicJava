package com.swetha.secpack;

// how to set priority of the thread t1, while running it shows 5.
/*Multithreading 
 * multiple threads running parallel will give you faster output
 * start(), run(), wait(), sleep() all these are methods.
 * Thread is the main class and we have to extend it to use for our classes or implement the interface runnable
 * when you start a new thread run() method written in the user defined thread class will be called
 * different criteria for choosing a thread when multiple come at the same time like priority, time taken etc
*/

class Hello extends Thread{
	
	public void run() {
		System.out.println("Thread priority: "+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
}

class Hi extends Thread{
	public void run() {
		System.out.println("Thread priority: "+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

class Namaste implements Runnable {
	
	public void run() {
		System.out.println("Thread priority: "+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("Namaste");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
}

class Vanakkam implements Runnable{
	public void run() {
		System.out.println("Thread priority: "+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("Vanakkam");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
public class MultithreadingEg {

	public static void main(String[] args) throws Exception {
		
		Hello he = new Hello(); Hi hi = new Hi();
		  
		he.start(); 
		try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();} 
		hi.start();
		 		  
		he.join();
		hi.join();
		System.out.println("Now we will be using runnable interface as well "); //We need to
		 // create the threads from thread class and send class obj for reference
		 
		Namaste n = new Namaste();
		Vanakkam v = new Vanakkam();
		
		Thread t1 = new Thread(n);
		Thread t2 = new Thread(v);
		//Runnable interface is a functional interface with only one Abstract method run(), no start. so we will need to write run
		//in the new classes, also start the threads created.
		t1.setPriority(8);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Priority of the t1 thread: "+t1.getPriority());
		System.out.println("Priority of the t2 thread: "+t2.getPriority());
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();
		//System.out.println("Priority of the t1 thread: "+t1.getPriority());
		//System.out.println("Priority of the t2 thread: "+t2.getPriority());
		//The default priority is 5  of 1 to 10, 1 being least and 10 being highest
		
		
		System.out.println("After setting the priority");
		System.out.println("Priority of the t1 thread: "+t1.getPriority());
		System.out.println("Priority of the t2 thread: "+t2.getPriority());
		t1.setName("Namaste Thread");
		t2.setName("Vanakkam Thread");
		System.out.println("Name of the t1 thread: "+t1.getName());
		System.out.println("Name of the t2 thread: "+t2.getName());
		System.out.println("Priority of the t1 thread: "+t1.getPriority());
		System.out.println("Priority of the t2 thread: "+t2.getPriority());
		//The default priority is 5  of 1 to 10, 1 being least and 10 being highest
		t1.join();
		t2.join();
		System.out.println("Trying lambda expressions/ anaonumous class/ functional interface to reduce the code");
		
		Thread t3 = new Thread(()->  {
				for(int i=0;i<5;i++) {
					System.out.println("Sasrekal");
					try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				}
		},"Sasrekal Thread");
		
		Thread t4 = new Thread(()->  {
			for(int i=0;i<5;i++) {
				System.out.println("Ram Ram");
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			}
		},"RamRam Thread");
		System.out.println("Name of the t3 thread: "+t3.getName());
		System.out.println("Name of the t4 thread: "+t4.getName());
		System.out.println("checking for t3 alive before starting and joining Main:"+t3.isAlive());
		t3.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		t4.start();
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Priority of the t1 thread: "+t3.getPriority());
		System.out.println("Priority of the t2 thread: "+t4.getPriority());
		System.out.println("checking for t3 alive after starting and before joining Main:"+t3.isAlive());
		t3.join();
		t4.join();
		
		System.out.println("checking for t3 alive before joining Main:"+t3.isAlive());
		
		//isAlive() checks for thread status and join waits till the thread is joined to main
		
	}

}
