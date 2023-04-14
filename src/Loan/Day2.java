package Loan;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	@Test(groups= {"Smoke"})
	public void demo3() {
		System.out.println("great");
		
	}
	@Parameters({"URL"})
	@AfterTest
	public void lastExecution(String urlname) {
		System.out.println("I will execute last");
		System.out.println(urlname);
	}

}
