package Amazon.AmazonSignin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basewebdriver {
public static WebDriver driver;
public static Properties prop;
	public static WebDriver getDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\ashwi\\eclipse-workspace\\AmazonSignin\\src\\test\\java\\Amazon\\AmazonSignin\\global.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashwi\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(prop.getProperty("url"));
	    return driver;
	}
}
