package Loan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void WebHomeLoan() {
		System.out.println("WebHomeLoan");
	}
	@Test(groups= {"Smoke"})
	public void mobileHomeLoan() {
		System.out.println("mobileHomeLoan");
	}
	@Test
	public void apiHomeLoan() {
		System.out.println("apiHomeLoan");
		Assert.assertTrue(false);
	}

}
