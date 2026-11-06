package testNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser {
	
	WebDriver driver;
	
	@Parameters("Browser")
	
	@BeforeTest
	public void Browser_setup(String Browser)
	{
		if (Browser.equalsIgnoreCase("Chrome"))
		{
			driver= new ChromeDriver();
			System.out.println("Chrome Browser");
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
			System.out.println("Edge Browser");
			
		}
		else
		{
			driver= new FirefoxDriver();
			System.out.println("Firefox Browser");
		}
		
		
	}
	
	@Test
	public void Mthd_1()
	{
		System.out.println("https://www.google.com/");
		driver.manage().window().maximize();
		
	
	}

}
