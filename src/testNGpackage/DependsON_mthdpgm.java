package testNGpackage;

import org.testng.annotations.Test;

public class DependsON_mthdpgm {

	
	 @Test
	 public void Registration() 
	 {
		 System.out.println("Registration Method");
	 }
	 
	 @Test(dependsOnMethods = "Registration") //Login() method is depended on Registration() method so it will work only after execution
	 public void Login()
	 {
		 System.out.println("Login Method");
	 }
	 
	 @Test(dependsOnMethods = {"Registration","Login"})
	 public void Home()
	 {
		 System.out.println("Home Method");
	 }
	 

}
