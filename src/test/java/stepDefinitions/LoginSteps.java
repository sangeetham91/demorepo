package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

public class LoginSteps {
	public WebDriver driver;
	public LoginPage lp;
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		driver.get(string);
	    
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
		
		lp.setEmail(string);
		lp.setPwd(string2);
	   	}

	@When("Click on login")
	public void click_on_login() {
		lp.clickButton();
	    	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		lp.checkCheckBox();
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Login was unsuccessful."))
		{
			driver.close();
		Assert.assertTrue(false);
		}
		else
		{Assert.assertEquals(title,driver.getTitle());
		}
		
	    
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	   lp.clickLogout();
	   Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	  
	}



}
