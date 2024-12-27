package com.statics.variable;

public class Example {
	public static void main(String[] args) {

		// 1st way- preferred way
		System.out.println("by using class name>>" + StaticTest.b);
		// 2nd way- bad practice
		StaticTest staticTest = new StaticTest();
		System.out.println("by using object name>>" + staticTest.b);
	}

}
