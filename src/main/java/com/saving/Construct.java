package com.saving;

public class Construct {

	// constructor name should be class name
	// constructor is used to create object

	// Type of construct
	// 1. default construct
	// 2. No argument construct
	// 3. parameterized construct

	// Default construct
	String name; // null
	int id, idd; // 0
	double d; //0.0
	
	// No argument
	Construct() {
		name = "ram";
		id = 90990;
		d = 50.50;
	}

	// parameterized / argument
	Construct(String name, int id) {
		this.name = name;
		this.id = id;
		// this.name = name;
		// this.id = id;
	}

	Construct(int id, String name) {
		this.name = name;
		this.id = id;
		// this.name = name;
		// this.id = id;
	}

	Construct(String name, int id, double d) {
		this.name = name;
		this.id = id;
		this.d = d;
	}

	Construct(int id, int idd) {
		this.id = id;
		this.idd = idd;
	}

	void Result() {
		System.out.println("name is     " + name + "\n" + "number       " + id);
	}

	public static void main(String[] args) {
		// it executes based upon line number 43 method
		Construct con = new Construct(980, 300);
		con.Result();

		// it executes based upon line number 26 method
		Construct con6 = new Construct(980, "java");
		con.Result();
		// it executes based upon line number 32 method
		Construct co1 = new Construct("javascript", 98000);
		co1.Result();
		// it executes based upon line number 38 method
		Construct cc = new Construct("rishi", 989980, 50.50);
		cc.Result();
		// it executes based upon line number 38 method
		Construct dd = new Construct("Vija", 980, 25.35);
		dd.Result();

	}

	// public static void main(String[] args) {
	// Construct a = new Construct();
	// a.sum();
	// }
	//
	// public void sum() {
	// System.out.println(100+200);
	// }

}
