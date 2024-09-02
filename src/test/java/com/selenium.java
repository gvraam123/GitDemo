package com;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium {

	public static void charat(String input) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] ca = input.toCharArray();
		for (char c : ca) {
			for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
				Character key = entry.getKey();
				Integer val = entry.getValue();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		charat("javaaa");
	}
	@Test(enabled = false)
	public void tc_001(){
		System.out.println("Test Case one");
	}
	@Test
	public void tc_002(){
		Assert.assertEquals("Hello", "Hello", "[Error ] test case asssertion is passed");
//		Assert.assertEquals("Hello", "Hell");
	}
}
