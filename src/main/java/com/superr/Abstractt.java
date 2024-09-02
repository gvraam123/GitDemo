package com.superr;

public abstract class Abstractt {

	// 1. if abstract keyword is present in method level, class should be abstract
	// class
	// 2. abstract class contains abstract method and non-abstract method/concrete
	// method/normal method
	// 3. we can't object in abstract method
	public abstract int MultiplyTwo(int n1, int n2);

	public abstract int MultiplyThree(int n1, int n2, int n3);

	// regular method with body
	public void show() {
		System.out.println("Method of abstract class Multiply");
	}

}
