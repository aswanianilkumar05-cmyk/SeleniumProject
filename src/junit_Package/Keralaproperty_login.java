package junit_Package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralaproperty_login {
	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();  //to maximize the window
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		System.out.println("Title of the Web Page: "+actualtitle);
	}
	
	@Test
    public void testverification()
    {
		String sourcecode=driver.getPageSource(); //to retrieve the source code information
		if(sourcecode.contains("User Login")) 
		{
			System.out.println("Test is Present");
		}
		else
		{
			System.out.println("Test is not Present");
		}
    }
		
	    @Test
	    public void login()
	    {
	    	WebElement username=driver.findElement(By.id("ulogin")); //locating user_name with locater id
	    	username.sendKeys("abcd"); //only String values are accepted
	    	
	    	WebElement password=driver.findElement(By.name("upass")); //locating password key with locator id
	    	password.sendKeys("pass2255");
	    	
	    	WebElement loginbutton=driver.findElement(By.id("sub_logbtn"));
	    	loginbutton.click();
	    	
	    }
	    
	    @AfterEach
		public void closingmethod()
		{
			driver.quit();
		}
    }
    

