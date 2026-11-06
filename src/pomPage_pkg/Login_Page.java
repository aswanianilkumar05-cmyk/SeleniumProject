package pomPage_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page
{
	WebDriver driver;
	
	//Locating WebElements using Page Factory
	@FindBy(xpath="//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(id="upass")WebElement password;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]")WebElement loginbtn;
	
	//Constructor
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	public void setvalues()
	{
		username.sendKeys("Achu");
		password.sendKeys("1234");
	}
	
	public void loginmthd()
	{
		loginbtn.click();
	}
	
	public String titlemthd()
	{
		String title=driver.getTitle();
		return title;
		
	}

}

