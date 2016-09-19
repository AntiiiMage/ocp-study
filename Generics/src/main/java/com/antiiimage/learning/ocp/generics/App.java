package com.antiiimage.learning.ocp.generics;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Parcel<String> parcel = new Parcel<String>();
		parcel.setMyClass("test");

	}
}
