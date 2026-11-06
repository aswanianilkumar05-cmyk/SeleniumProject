package junit_Package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_pgm {
	ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void home() throws Exception
	{
		Thread.sleep(2000);  //Java wait, used to wait for a particular time period.Here it is 2sec
		WebElement search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		//search.sendKeys("Mobiles");  
		search.sendKeys("Mobiles",Keys.ENTER); //to press the enter key(Keys.Enter)
		
		WebElement Electronics=driver.findElement(By.xpath(""));
		
	}
}


