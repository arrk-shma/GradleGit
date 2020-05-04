package myPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMix {

	@Test
	public void compare() {

		int a = 5, b = 3;

		Assert.assertTrue((a>b), "Incorrect");
	}
	
	@Test
	public void addition() {

		int a = 5, b = 3, sum =0;
		sum = a+b;

		Assert.assertTrue((sum>a &&sum>b ), "Incorrect");
	}
	
	@Test
	public void subtraction() {

		int a = 5, b = 3, diff =0;
		diff = a-b;

		Assert.assertTrue(((diff+b) ==a), "Incorrect");
	}
	
	@Test
	public void product() {

		int a = 5, b = 3, product =0;
		product = a*b;

		Assert.assertTrue(product ==15, "Incorrect");
		
		
	}
	
	@Test
	public void modulus() {

		int a = 5, b = 3, remainder =0;
		remainder = a%b;

		Assert.assertTrue((remainder <b), "Incorrect");
	}
	
}
