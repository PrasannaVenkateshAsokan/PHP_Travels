package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.Landing_Page;
public class Landing_Page_Test
{
	WebDriver driver;
	
	   @BeforeTest
	   public void Pre_Condition() throws InterruptedException
	   {
		   System.setProperty("webdriver.chrome.driver","E:\\Chromedriver\\chromedriver.exe");    
		   driver= new ChromeDriver(); 
		   driver.navigate().to("https://phptravels.com/demo"); 
		   driver.manage().window().maximize(); 
		   Thread.sleep(2000); 
	   }
	   
	   @Test
	   public void Form_Test() throws InterruptedException
	   {
		   Landing_Page LP = new Landing_Page(driver);
		   LP.First_Name("Prasanna");
		   LP.Last_Name("Venkatesh");
		   LP.Business_Name("Kryptos Technologies");
		   LP.Email("prasanna.v@kryptostech.com");
		   LP.Captcha();
		   LP.Submit();
		   Thread.sleep(2000);
	   }
	   
	   @AfterTest
	   public void Post_Condition()
	   {
		   driver.close();
	   }
}
