package pages;


import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	//1.a: define page objects (PAGE OR) : using PageFactory Pattern
	
	@FindBy(id = "user_login")
	WebElement emailId;
	
	@FindBy(id = "user_pass")
	WebElement password;
	
	@FindBy(id = "wp-submit")
	WebElement loginButton;
	


	public LoginPage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	//Set user name in textbox
	public void setUserName(String strUserName){
		emailId.sendKeys(strUserName);

	}

	//Set password in password textbox
	public void setPassword(String strPassword){
		password.sendKeys(strPassword);
	}

	//Click on login button
	public void clickLogin(){
		loginButton.click();
	}

	/**
	 * This POM method will be exposed in test case to login in the application
	 * @param strUserName
	 * @param strPasword
	 * @return
	 */
	public void loginpage(String strUserName,String strPasword){
		//Fill user name
		this.setUserName(strUserName);
		//Fill password
		this.setPassword(strPasword);
		//Click Login button
		this.clickLogin();

	}
}
