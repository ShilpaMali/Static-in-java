package com.single.copy.storage;
//why static is called as single copy storage

public class StaticDemo {
	int a = 5;
	static int b = 5;

	public static void main(String[] args) {

		StaticDemo staticDemo1 = new StaticDemo();
		System.out.println("non static>>" + staticDemo1.a++); //5
		System.out.println("static>>" + staticDemo1.b++); //5
		StaticDemo staticDemo2 = new StaticDemo();
		System.out.println("non static>>" + staticDemo2.a++); //5
		System.out.println("static>>" + staticDemo2.b++);//6
		StaticDemo staticDemo3 = new StaticDemo();
		System.out.println("non static>>" + staticDemo3.a++); //5
		System.out.println("static>>" + staticDemo3.b++); //7
		StaticDemo staticDemo4 = new StaticDemo();
		System.out.println("non static>>" + staticDemo4.a++); //5
		System.out.println("static>>" + staticDemo4.b++); //8

	}

}
