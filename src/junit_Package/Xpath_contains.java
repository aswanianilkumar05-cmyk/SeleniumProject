package junit_Package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains {
	ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void email() throws Exception
	{
		Thread.sleep(2000);
		WebElement Reddiffmail=driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		Reddiffmail.sendKeys("admin");
		
		WebElement FullName=driver.findElement(By.xpath("//input[contains(@name,'name') and @placeholder=\"Enter your full name\"]"));
		FullName.sendKeys("Aswani",Keys.ENTER);
		
	}
	

}

