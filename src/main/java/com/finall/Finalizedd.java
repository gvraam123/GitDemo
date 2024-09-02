package com.finall;

public class Finalizedd {
	
public static void name() {
	
}
	public static void main(String[] args) {
		Finalizedd obj = new Finalizedd(); // printing the hashcode

		System.out.println("Hashcode is: " + obj.hashCode());
		obj=null;
		// calling the garbage collector using gc()
		System.gc();
		System.out.println("After NuHashcode is: " + obj.hashCode());
//		System.out.println("Hashcode is: " + obj.hashCode());
//		System.out.println("End of the garbage collection");
	}

	// defining the finalize method
//	protected void finalize() {
//		System.out.println("Called the finalize() method");
//	}
}
