package com.finall;

public final class finall {

	// final is keyword
	// used in variable, method and class level
	// we can't change the value
	
	//when we use final method, can't overridden
	
	
	final int age = 18;

	void display() {
		// reassigning value to age variable
		// gives compile time error
//		age = 55;
		System.out.println(age);
	}

	public static void main(String[] args) {
		finall obj = new finall();
		// gives compile time error
		obj.display();

	}
}