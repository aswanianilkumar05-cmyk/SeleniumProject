package junit_Package;

import java.io.File;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollDown_pgm {
ChromeDriver driver;
	
	@BeforeEach
	public void Browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
	}
	@Test
	public void ScrollDown_mthd() throws Exception 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,500)");
		Thread.sleep(2000);
		//Screenshots
		
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s,new File("./Screenshots/Amazon.png"));
		
		
		js.executeScript("scrollBy(0,2000)");
		Thread.sleep(2000);
		//Screenshots
		
		File scrn=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn,new File("./Screenshots/Footer.png"));
		
		
		js.executeScript("scrollBy(0,1500)");
		Thread.sleep(2000);
		//Screenshots
		
		File scrnsc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrnsc,new File("./Screenshots/Last.png"));
	}
}
  


