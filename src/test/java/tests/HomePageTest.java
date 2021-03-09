package tests;


import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import java.util.Properties;

public class HomePageTest {

    public BasePage basePage;
    public WebDriver driver;
    public Properties prop;
    public LoginPage loginPage;
    public HomePage homepage;


    @BeforeMethod //this method will be executed before every @test method
    public void setUp() {
        basePage = new BasePage();
        prop = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(prop.getProperty("url"));

    }

    @Test(priority = 1)
    public void verifyLoginTest() {
        loginPage = new LoginPage(driver);
        loginPage.loginpage("admin", "admin@1234");
    }

    @Test(priority = 2)
    public void verifyAddItem() {
        loginPage = new LoginPage(driver);
        loginPage.loginpage("admin", "admin@1234");
        homepage = new HomePage(driver);
        homepage.homepage("a", "b", "Bag", "100");
    }

    @AfterMethod //--this method will be executed after every test method
    public void tearDown() {
        driver.quit();
    }
}
