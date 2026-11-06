package junit_Package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo_Verification {

ChromeDriver driver;
	
	@BeforeEach
	public void Browsersetup() {
		driver =new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Logo() throws Exception  {
		WebElement Logo=driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		boolean result= Logo.isDisplayed();
		
		if(result==true)
		{
			System.out.println("Logo is Displayed");
		}
		else
		{
			System.out.println("Logo is not Displayed");
		}
		Thread.sleep(2000);
		
		WebElement Female=driver.findElement(By.xpath("//input[@type=\"radio\"]"));
		boolean buttonenb=Female.isEnabled(); //to verify whether the button is enabled or not
		System.out.println("Female Button is enabled"+buttonenb); 
		Female.click();	
		WebElement Checkbox=driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		boolean Checkboxbtn = Checkbox.isSelected();
		
		Checkbox.click();
		
		if(Checkboxbtn== true)
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
			
			
		}
		
		
		
	}
	@AfterEach
	public void closing_mthd()
	{
		driver.quit();
	}

}
