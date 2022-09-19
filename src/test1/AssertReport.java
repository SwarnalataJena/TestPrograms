package test1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertReport {
	@Test
	public void hassert()
	{
		System.out.println("main starts");
		Assert.assertEquals("a", "b");
		System.out.println("main ends");
		System.out.println("main ended");
	}
	@Test
	public void sassert()
	{
		System.out.println("Smain starts");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("x", "y");
		System.out.println("Smain ends");
		System.out.println("Smain ended");
		sa.assertAll();
	}
}
