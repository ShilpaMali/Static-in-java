package com.statics.members.access;
//How to access static members from non static members ? yes we can
public class Static {

	static void getTest() {
		System.out.println("this is static method");
	}

	void getExample() {
		System.out.println("this is non static method");
		getTest(); // calling static method
	}

	public static void main(String[] args) {
		Static static1 = new Static();
		static1.getExample();

	}
}
