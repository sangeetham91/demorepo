package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
//constructor
	public LoginPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	}
	//locators
	@FindBy(id="Email") WebElement txtEmail;
	@FindBy(id="Password") WebElement txtPwd;
	@FindBy(xpath="//button[@type='submit']") WebElement btnLogin;
	@FindBy(xpath="//a[text()='Logout']") WebElement btnLogout;
	@FindBy(xpath="//input[@type='checkbox']") WebElement checkbox;
	
		
	//actions
	public void setEmail(String email)
	{ txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	public void setPwd(String pwd)
	{txtPwd.clear();
		txtPwd.sendKeys(pwd);
	}
	public void clickButton() {
		
		btnLogin.click();}
		public void clickLogout() {
			
			btnLogout.click();
	}
		public void checkCheckBox()
		{
			checkbox.click();
		}
}
