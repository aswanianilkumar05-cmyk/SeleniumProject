package junit_Package;

import java.sql.Driver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_pgm {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browsersetup() //method
    { 	
		System.out.println("BeforeEach Method");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void titleverification()
	{
		System.out.println("Test Method1");

		String actualtitle = driver.getTitle();
		String expectedtitle = "Google";
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Same Title");
		}
		else
		{
			System.out.println("Mismatch Title");
		}
	}
	
	@Test
    public void method2()
    {
		System.out.println("Method 2");
    }
	
	@AfterEach
	public void closingmethod()
	{
		System.out.println("AfterEach Method");

		//driver.close();  //to close the browser tab.
		driver.quit();  //to close the complete browser window and end the section
	}
}









