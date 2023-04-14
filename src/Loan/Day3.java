package Loan;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebCarLoan(String website,String key) {
		System.out.println("WebCarLoan");
		System.out.println(website);
		System.out.println(key);
	}
	
	@BeforeClass
	public void bclass() {
		System.out.println("I will execute before class");
	}
	
	@AfterClass
	public void aclass() {
		System.out.println("I will execute after class");
	}

	@Test(groups= {"Smoke"})
	public void mobileCarLoan() {
		System.out.println("mobileCarLoan");
	}

	@BeforeSuite
	public void bsuite() {
		System.out.println("I am before suite");
	}

	@BeforeMethod
	public void bmethod() {
		System.out.println("I will Execute before each method");
	}

	@AfterMethod(timeOut=4000)
	public void amethod() {
		System.out.println("I will Execute after each method");
	}

	@Test(enabled=false)
	public void mobileCarLoan1() {
		System.out.println("mobileCarLoan1");
	}

	@Test (dataProvider= "getData")
	public void CarLoan2(String username,String password) {
		System.out.println("mobileCarLoan2");
		System.out.println(username);
		System.out.println(password);
		
	}

	@Test(dependsOnMethods= {"WebCarLoan"})
	public void apiCarLoan() {
		System.out.println("apiCarLoan");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[3][2];
		
		data[0][0]="username";
		data[0][1]="pasword";
		
		data[1][0]="secondusername";
		data[1][1]="secondPassword";
		
		data[2][0]="thirdUsername";
		data[2][1]="thirdPassword";
		return data;
	}

}
