package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin {
	WebDriver driver;
	public Signin(WebDriver driver) {
		this.driver=driver;
	}
	By email=By.xpath("//input[@id='ap_email']");
	By cont=By.id("continue");
	By password=By.xpath("//input[@id='ap_password']");
    By submit=By.xpath("//input[@id='signInSubmit']");
    
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getcontbutton()
	{
		return driver.findElement(cont);
		
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
		
	}
	public WebElement getsubmit()
	{
		return driver.findElement(submit);
	}
}
