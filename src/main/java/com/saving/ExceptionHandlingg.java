package com.saving;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandlingg {

	public static void main(String[] args) {
	}
		// try catch

		// try catch catch catch

		// try catch finally

//		try {
////			int num = 6 / 0;
//			int[] m = { 1, 2, 3 };
//			System.out.println(m[10]);
//		} catch (ArrayIndexOutOfBoundsException excp) {
//			System.out.println("Exception is : " + excp);
//		} catch (ArithmeticException excp) {
//			System.out.println("Exception is : " + excp);
//		} catch (ArrayIndexOutOfBoundsException excp) {
//		System.out.println("Exception is : " + excp);
//	} catch (ArrayIndexOutOfBoundsException excp) {
//		System.out.println("Exception is : " + excp);
//	} catch (ArrayIndexOutOfBoundsException excp) {
//		System.out.println("Exception is : " + excp);
//	}

//		try {
//			int[] myNumbers = { 1, 2, 3 };
//			System.out.println(myNumbers[10]);
//		} catch (Exception e) {
//			System.out.println("Something went wrong.");
//		} finally {
//			System.out.println("The 'try catch' is finished.");
//		}
//	}
//		      finally {
//		      System.out.println("The 'try catch' is finished.");
//		    }

//		execute();
//	System.out.println("Good Day");	//compile runtime error

//	int a =100;                     
//	int b =0;
////	System.out.println(a/b);              //run time error / exception
//	
//	
//	int [] c = {10,20,30,40};  //0,1,2,3
////	System.out.println(c[3]);
//	
//	//checked Exception and unchecked Exception
//	
//	File f = new File("C:\\Users\\shree\\OneDrive\\Desktop\\123.txt");
////	FileReader fr = new FileReader(f);

//		}

	public static void execute() {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.saucedemo.com/");

		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("passwor")).sendKeys("secret_sauce");
		// TODO Auto-generated catch block
	}
}
