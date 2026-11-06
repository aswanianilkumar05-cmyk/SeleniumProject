package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Copy_Paste {
	ChromeDriver driver;
	
	@BeforeClass
	public void Browser_setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void CopyPaste_mthd()
	{
		WebElement FullName= driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
		FullName.sendKeys("abcd");
		
		//To select the value from full name field(Ctrl+a)
		Actions act= new Actions(driver);
		act.keyDown(FullName,Keys.CONTROL).sendKeys("a");
		act.keyUp(Keys.CONTROL);
		
		act.keyDown(FullName,Keys.CONTROL).sendKeys("c");
		act.keyUp(Keys.CONTROL);

		 WebElement mail= driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		 act.keyDown(mail,Keys.CONTROL).sendKeys("V");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
	}

}
