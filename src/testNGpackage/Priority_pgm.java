package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority_pgm {
	
	@BeforeClass
	public void BfClass_mthd()
	{
		System.out.println("BeforeClass Method");
	}
  
	@Test(priority=1,invocationCount = 3)
	public void mthd_x()
	{
		System.out.println("Method X");
	}
	
	@Test(priority=2,enabled = false)
	public void mthd_A()
	{
		System.out.println("Method A");
	}
	
	@Test
	public void mthd_F()
	{
		System.out.println("Method F");
	}
	
	@AfterClass
	public void AfClass_mthd() 
	{
	  System.out.println("AfterClass Method");
	}

}
