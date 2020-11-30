package com.swetha.secpack;

public class newException extends Exception {

	public newException(String s) {
		super(s);
		//cannot set getters and setters in constructor.
		//If we see Exception class has a super.message() in the class which calls throwable class.
	}
}
