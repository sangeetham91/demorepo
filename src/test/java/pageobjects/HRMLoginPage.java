package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HRMLoginPage {
	public WebDriver driver;
	//constructor
	public HRMLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//locator
	@FindBy(name="username") WebElement txtUN;
	@FindBy(name="password") WebElement txtPwd;
	@FindBy(xpath="//button[text()=' Login ']") WebElement btnLogin;
	
	//Actions
	public void setUserName(String username)
	{
		txtUN.sendKeys(username);
	}
	public void setPassWord(String password)
	{
		txtPwd.sendKeys(password);
	}
public void clickButton()
{
	btnLogin.click();}


public void verifyTitle()
{
	String pageTitle = driver.getTitle();
	Assert.assertEquals(pageTitle, "OrangeHRM");
	}
}
