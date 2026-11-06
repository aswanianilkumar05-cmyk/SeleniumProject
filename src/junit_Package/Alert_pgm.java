package junit_Package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pgm 
{
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Alert.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Display_alertbox() throws Exception
	{
		WebElement Display_alertbox=driver.findElement(By.xpath("/html/body/input[1]"));
		Display_alertbox.click();
		
		//Handle AlertBox
		Alert alrt = driver.switchTo().alert(); // switch to control to the alert box 
		String alert_text = alrt.getText(); // to retrieve the text from the alert box
		System.out.println("Alert text : " + alert_text);
		
		Thread.sleep(2000);
		alrt.accept(); //to click the 'OK' button
		
		
		WebElement First_Name=driver.findElement(By.xpath("/html/body/input[2]"));
		First_Name.sendKeys("Aswani");
		
		WebElement Last_Name=driver.findElement(By.xpath("/html/body/input[3]"));
		Last_Name.sendKeys("Anilkumar");
		
		WebElement Submit_button=driver.findElement(By.xpath("/html/body/input[4]"));
		Submit_button.click();
		
		
	}
	
	

}
