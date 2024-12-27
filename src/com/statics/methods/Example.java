package com.statics.methods;

public class Example {

	//getExample() is static method
	//or getExample() is class method
	static void getExample() {
		System.out.println("this is static method");
	}

	public static void main(String[] args) {

		// 1st way- classname.methodname
		Example.getExample(); // method calling
		// 2nd way- objectname.methodname
		Example example = new Example(); //object creation
		example.getExample();
		// 3rd way- applicable for same class not different class
		getExample();
	}

}
