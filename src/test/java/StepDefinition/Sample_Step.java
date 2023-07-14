package StepDefinition;

import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Amazon.AmazonSignin.Basewebdriver;
import PageObjects.Signin;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class Sample_Step {
	public WebDriver driver;
	Signin signin;
	@Given("I am on the Sign in page")
	public void i_am_on_the_sign_in_page() throws IOException {
	  driver = Basewebdriver.getDriver();
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\ashwi\\chromedriver.exe");
	    //driver = new ChromeDriver();
	    
	}

	@When("Sign in to the account with {string}")
	public void sign_in_to_the_account_with(String string) {
		signin=new Signin(driver);
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	   // driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(string);
		signin.getemail().sendKeys(string);
	}

	@And("click the continue button")
	public void click_the_continue_button() {
		signin.getcontbutton().click();
		//driver.findElement(By.id("continue")).click();
	}

	@When("password is {string} click on Sign in button")
	public void password_is_click_on_sign_in_button(String string) {
		signin.getpassword().sendKeys(string);
		signin.getsubmit().click();
		//driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(string);
		 //driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

	@Then("sign in the account")
	public void sign_in_the_account() {
		String expUrl="https://www.amazon.in/?ref_=nav_custrec_signin";
		   String actUrl=driver.getCurrentUrl();
		   if(!expUrl.equals(actUrl)) {
			   fail("din't login to the account");
		   }
	}
	@After
	public void tearDown() {
	    driver.close();
	}
	}
