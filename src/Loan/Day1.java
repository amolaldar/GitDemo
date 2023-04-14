package Loan;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
@Test
	public void demo1() {
		System.out.println("Hello World");
		
	}
@BeforeTest
public void firstExecution() {
	System.out.println("I will execute first");
}
@AfterSuite
public void asuite() {
	System.out.println("I am the last suite");
}
@Test
public void demo2() {
	System.out.println("bye");
}
}
