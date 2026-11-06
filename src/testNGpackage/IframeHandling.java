package testNGpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframeHandling {
	WebDriver driver;
	
	@BeforeTest
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void logintest()
	{
		WebElement user = driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		user.sendKeys("aswani.anilkumar7@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		pass.sendKeys("123456");
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
		loginbtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
	}
	
	@Test(priority=2)
	public void Addpropertymthd()
	{
		WebElement AddPPTbtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
		AddPPTbtn.click();
		
		//summary box comes under Iframe so we need to Switch to the Iframe and
	    WebElement Frametag = driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
	    driver.switchTo().frame(Frametag);
		
		WebElement summarybox = driver.findElement(By.xpath("/html/body"));
		summarybox.click();
		summarybox.sendKeys("abcdef");
		
		driver.switchTo().defaultContent();
	
	}

}
