package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_AssertionPGM {
ChromeDriver driver;
	
	@BeforeClass
	public void Browser_setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void Logo_Verification()
	{
		WebElement Logo= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img/"));
		boolean result= Logo.isDisplayed();
		System.out.println(result); 
		
		SoftAssert obj= new SoftAssert();
		obj.assertTrue(result); //to check whether the value of result is True
		obj.assertAll();
		System.out.println("Logo is displayed ");
		
	}
	
	@Test 
	public void Title_Verification()
	{
		
		String actual_title= driver.getTitle();
		//System.out.println(actual_title);
		
		String expected_title="Rediffmail Free Unlimited storage ";
		
		SoftAssert obj= new SoftAssert();
		obj.assertEquals(expected_title, actual_title);
		//obj.assertAll();
		System.out.println("Success");
		
}
}

