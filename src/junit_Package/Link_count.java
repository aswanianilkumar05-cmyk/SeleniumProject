package junit_Package;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_count {
	ChromeDriver driver;
	
	@BeforeEach
	public void Browser_setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void linkcount_mthd()
	{
		
		List<WebElement> link=driver.findElements(By.tagName("a")); //to locate all 'a' tags
		System.out.println("Link count = "+link.size());
		
		for(WebElement li: link)
		{
			//System.out.println("Link -----"+li.getAttribute("href"));
			System.out.println(li.getText()+"---"+li.getAttribute("href"));
			
		}
	}
	

}
