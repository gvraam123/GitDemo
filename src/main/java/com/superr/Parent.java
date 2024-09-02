package com.superr;

public class Parent extends GP {
	int a = 6000; // global variable

	public void sum() {
		int a = 8000; // local variable
		System.out.println("Local variable : " +a +"\n");
		System.out.println("Immeidate parent : " + this.a +"\n"); // immediate parent
		System.out.println("Grand Parent : " +super.a +"\n"); // super = GP
		System.out.println(a+this.a+super.a);
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		p.sum();
	}
}
