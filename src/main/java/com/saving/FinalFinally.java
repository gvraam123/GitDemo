package com.saving;

public class FinalFinally {

	// final is keyword.
	// FINAL variable can't change
	// it uses in variable, method and block
//		final int age = 18;
//		void display() {
//	
//			// reassigning value to age variable
//			// gives compile time error
//	//		age = 55;
//	
//			System.out.println(age);
//	}

	public static void main(String[] args) {
//					

		FinalFinally obj = new FinalFinally(); // printing the hashcode
		System.out.println("Hashcode is: " + obj.hashCode());
		obj = null;
		// calling the garbage collector using gc()
		System.gc();
		System.out.println("End of the garbage collection");
	}

	// defining the finalize method
	protected void finalize() {
		System.out.println("Called the finalize() method");
	}

//		FinalFinally obj = new FinalFinally();
// gives compile time error
//		obj.display();
}
