package testNGpackage;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatePicker_pgm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void date_picker() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Calender = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		Calender.click();
		
		while (true) //to find month
		{
			String Month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			System.out.println("Month = " + Month);
			
			if (Month.equalsIgnoreCase("December 2026"))
			{
				break;
			}
			else
			{
				WebElement next_arrow = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
				next_arrow.click(); //click on the next icon
			}
		}
		//driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]/a")).click();
		
		List<WebElement> date= driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		
		for (WebElement d : date)
		{
			String datetext = d.getText();
			if (datetext.equals("8"))
			{
				d.click();
				System.out.println("Date Selected");
				break;
			}
		}
	}
}