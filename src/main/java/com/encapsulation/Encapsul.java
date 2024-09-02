package com.encapsulation;
 
//encapsulation = to hiding data from user
//variable should be private
//it writes by get and set method
//it used to hidding data from user
public class Encapsul {
	
	private String name;
	private String college;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
