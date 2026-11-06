package pomTest_pkg;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomBase_pkg.Base_Class;
import pomPage_pkg.Login_Page;

public class Login_Test extends Base_Class  //Base_Class is used to inherit the driver information from Base_Class
{
       Login_Page obj;
       
       
       
       @BeforeMethod
       public void objectmthd()
       {
    	   obj= new Login_Page(driver);       }
       
       
       @Test
       public void logintest_mthd()
       {
    	   Login_Page obj= new Login_Page(driver);
    	   obj.setvalues();
    	   obj.loginmthd();
    	   System.out.println(obj.titlemthd());
    	   
    	   
       }
       
       @Test
       public void title_verification()
       {
    	   System.out.println(obj.titlemthd());
       }
   
}





