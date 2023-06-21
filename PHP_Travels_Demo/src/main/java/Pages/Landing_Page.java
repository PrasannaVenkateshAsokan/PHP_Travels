package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing_Page 
{
	WebDriver driver;

	public Landing_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@name=\"first_name\"]")
	WebElement fn;

	public void First_Name(String fnm) 
	{	
		fn.sendKeys(fnm);
	}

	@FindBy(xpath="//input[@name=\"last_name\"]")
	WebElement sn;

	public void Last_Name(String snm) 
	{	
		sn.sendKeys(snm);
	}

	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement em;

	public void Email(String eml) 
	{	
		em.sendKeys(eml);
	}

	@FindBy(xpath="//input[@name=\"business_name\"]")
	WebElement bn;

	public void Business_Name(String bsn) 
	{	
		bn.sendKeys(bsn);
	}

	@FindBy(xpath="//button[@class=\"btn w100\"]")
	WebElement smb;

	public void Submit() 
	{	
		smb.click();
	}

	@FindBy(xpath="//span[@id=\"numb1\"]")
	WebElement fnm;

	@FindBy(xpath="//span[@id=\"numb2\"]")
	WebElement snm;

	@FindBy(xpath="//input[@id=\"number\"]")
	WebElement res;
	
	@FindBy(xpath="//a[@class=\"link waves-effect\"]")
	WebElement bck;
	
	public void Captcha()  throws InterruptedException
	{
		String fme = fnm.getText();
		int fam = Integer.parseInt(fme);
		String sme = snm.getText();
		int sam = Integer.parseInt(sme);
		int rn = fam + sam;
		String resultString = String.valueOf(rn);
		res.sendKeys(resultString);
		System.out.println("The result is "+resultString);
		Thread.sleep(2000);
		bck.click();
	}
}