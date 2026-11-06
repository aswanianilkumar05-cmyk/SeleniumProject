package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUpload_pgm {

ChromeDriver driver;

	
	@BeforeClass
	public void Browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void FileUpload()
	{
		WebElement File_btn = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		File_btn.sendKeys("C:\\Users\\Admin\\Pictures\\Deal of the Day.png");
	}

}
