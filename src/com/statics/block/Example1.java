package com.statics.block;

public class Example1 {
	static {
		System.out.println("this is 1st static block");
	}

	static {
		System.out.println("this is 2nd static block");
	}

	static {
		System.out.println("this is 3rd static block");
	}

	public static void main(String[] args) {

		System.out.println("Inside main method...");
	}

}
