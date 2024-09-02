package com.encapsulation;

public class Mainn {
	public static void main(String[] args) {

		Encapsul s = new Encapsul();
		s.setName("ram");
		s.setCollege("anna university");
		s.setAge(25);
		
		System.out.println("Applicant Name is : " +s.getName());
		System.out.println("College is : " + s.getCollege());
		System.out.println("Age is : " +s.getAge());

	}
}
