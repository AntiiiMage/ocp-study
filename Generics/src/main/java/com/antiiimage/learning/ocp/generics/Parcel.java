package com.antiiimage.learning.ocp.generics;

public class Parcel<MyClass> {
	private MyClass t;

	public void setMyClass(MyClass t) {
		this.t = t;
	}

	public MyClass getT() {
		return t;
	}
}
