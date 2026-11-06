package testNGpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hard_Assertion_pgm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void Browser_setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1) //to execute it 1st
	public void Title_Verification()
	{
		
		String actual_title= driver.getTitle();
		//System.out.println(actual_title);
		
		String expected_title="Rediffmail Free Unlimited";
		Assert.assertEquals(expected_title, actual_title);
		System.out.println("Success"); //The line will execute only after passing the Assertion.
		
	}
	@Test(priority=2)
	public void URL_Verification()
	{
		String Actual_URL= driver.getCurrentUrl();//to get current URL of the Web application
       // System.out.println(Actual_URL);
        
        String Expected_URL="https://register.rediff.com/register/register.php?FormName=user_details";
        Assert.assertEquals(Expected_URL, Actual_URL);
        System.out.println("URL Verification Completed");
        
        
	}
	






}
