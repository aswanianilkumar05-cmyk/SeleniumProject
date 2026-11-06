package junit_Package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_pgm {
	
	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize(); //to maximize the window
	}
	
	@Test
	public void login()
	{
		WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("Achu");
        
        WebElement password=driver.findElement(By.name("password")); //locating password key with locator id
    	password.sendKeys("1235");
    	
    	WebElement submit=driver.findElement(By.id("submit"));
   	 submit.click();
		
	}

}
