package JLR_RTCLoginCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RTClogin {

	public RTClogin(WebDriver driver)
	{
		this.driver = driver;
	}
		
		
	WebDriver driver;	

	By login = By.xpath("//input[@name='j_username']");
	By password = By.xpath("//input[@name='j_password']");
	By submit = By.xpath("//button[@type='submit']");
	


	public void login(String lname)
	{
		
		driver.findElement(login).sendKeys(lname);
		
	}
	
	public void password(String passWrd)
	{
		
		driver.findElement(password).sendKeys(passWrd);
		
	}
	
	public void submit()
	{
		
		driver.findElement(submit).click();
		
	}

	
	
}	
	

