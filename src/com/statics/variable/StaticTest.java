package com.statics.variable;

public class StaticTest {
	static int a; // a is static variable or class variable
	// this is declaration of static variable
	// stored into metaspace area
	static int b = 10; // this is initialization of static variable
	// 10 value is stored into b
	// b is static variable

	public static void main(String[] args) {

		// 1st way- preferred way
		System.out.println("by using class name>>" + StaticTest.b); //variable calling or accessing or printing
		// 2nd way- bad practice
		StaticTest staticTest = new StaticTest();
		System.out.println("by using object name>>" + staticTest.b);
		// 3rd way- preferred way
		System.out.println("by using direct way>>" + b);
	}

}
