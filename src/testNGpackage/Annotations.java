package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
  @BeforeTest
  public void BeforeTest_mthd() 
  {
	  System.out.println("BeforeTest Method");
  }
  
  @BeforeClass
  public void BeforeClass_mthd()
  {
	 System.out.println("BeforeClass Method"); 
  }
  
  @BeforeMethod
  public void mthd()
  {
	  System.out.println("BeforeMethod");
  }
  
  @Test
  public void testmthd_A()
  {
	  System.out.println("Testmthd_A");
  }
  
  @AfterMethod
  public void Af_mthd()
  {
	  System.out.println("AfterMethod");
  }
  
  @AfterClass
  public void AfterClass_mthd()
  {
	  System.out.println("AfterClass Method");
  }
  
  @AfterTest
  public void AfterTest_mthd()
  {
	  System.out.println("AfterTest Method");
  }
}
