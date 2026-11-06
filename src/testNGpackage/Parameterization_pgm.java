package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class Parameterization_pgm {
	ChromeDriver driver;
	@BeforeClass
	public void Browser_Setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Parameters({"un","pw"})
	
	@Test
	public void Login(String un,String pw)
	{
		WebElement username=driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		username.sendKeys(un);
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		password.sendKeys(pw);
	}
	


}
