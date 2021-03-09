package tests;


import Base.BasePage;
import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.Properties;

public class LoginTest {
	
	public BasePage basePage;
	public WebDriver driver;
	public Properties prop;
	public LoginPage loginPage;


	@BeforeMethod //this method will be executed before every @test method
	public void setUp(){
		basePage = new BasePage();
		prop = basePage.initialize_Properties();
		driver = basePage.initialize_driver();
		driver.get(prop.getProperty("url"));

	}
	
	@Test(priority=1)
	public void verifyLoginPage(){
		loginPage = new LoginPage(driver);
		loginPage.loginpage("admin", "admin@1234");

	}

	@AfterMethod //--this method will be executed after every test method
	public void tearDown(){
		driver.quit();
	}


}
