package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Grouping_pgm {
	
	@BeforeClass(alwaysRun=true)
	public void BfClass_mthd()
	{
		System.out.println("BeforeClass Method");
	}
	
	@Test(priority=1,groups="Smoke")
	public void Test_mthd()
	{
		System.out.println("Test Method 1");
	}
	
	@Test(priority=2,groups="Sanity")
	public void Test_mthd2()
	{
		System.out.println("Test Method 2");
	}
	
	@Test(priority=3,groups={"Regression","Smoke"})
	public void Test_mths3()
	{
		System.out.println("Test Method 3");
	}
	
	@AfterClass
	public void AfClass_mthd()
	{
		System.out.println("AfterClass Method");
	}

}
