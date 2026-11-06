package pomBase_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Base_Class 
{
	public static WebDriver driver;
	
	@BeforeTest
    public void Browser_setup()
    {
 	   driver=new ChromeDriver();
 	   driver.get("https://keralaproperty.in/member/login/");
 	   driver.manage().window().maximize();
    }
}
