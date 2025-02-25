package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HRMLoginPage;

public class OrangeHRMLoginSteps {
	public WebDriver driver;
	HRMLoginPage lp;
	
	@Given("User able to launch the browser")
	public void user_able_to_launch_the_browser() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	@When("User able to load the URL {string}")
	public void user_able_to_load_the_url(String url) {
	   driver.get(url);
	   driver.manage().window().maximize();
	}

	@Then("User able to enter username {string} and password {string}")
	public void user_able_to_enter_username_and_password(String username, String password) 
	{
	    lp=new HRMLoginPage(driver);
	    lp.setUserName(username);
	    lp.setPassWord(password);
	}

	@Then("click on login")
	public void click_on_login() {
		lp.clickButton();
	    
	}

	@Then("page title should be\"OrangeHRM\"")
	public void page_title_should_be_orange_hrm() {
		lp.verifyTitle();
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	    
	}

}
