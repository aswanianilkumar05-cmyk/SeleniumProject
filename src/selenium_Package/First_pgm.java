package selenium_Package;

import org.openqa.selenium.chrome.ChromeDriver;

public class First_pgm {

	public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
    //EdgdeDriver driver = new EdgeDriver(); - for opening Edge browser
    //FireFoxdriver = new FireFoxDriver(); - for opening Fire fox browser
    driver.get("https://www.google.com/");
    String actualtitle = driver.getTitle(); //to retrive the title
    System.out.println("The Title of the web Application is :"+actualtitle);
    
    String expectedtitle = "Google";
    if(actualtitle.equals(expectedtitle)){
       System.out.println("The title's matches");
    }
    else {
    	 System.out.println("Title is not matched");
    }
    
    }
}
