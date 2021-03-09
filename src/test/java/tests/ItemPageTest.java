package tests;


import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ItemPage;
import pages.LoginPage;
import java.util.Properties;

public class ItemPageTest {

    public BasePage basePage;
    public WebDriver driver;
    public Properties prop;
    public LoginPage loginPage;
    public ItemPage itempage;


    @BeforeMethod
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
        System.out.println("Login Success");
    }

    @Test(priority = 2)
    public void verifyAddItem() {
        loginPage = new LoginPage(driver);
        loginPage.loginpage("admin", "admin@1234");
        itempage = new ItemPage(driver);
        itempage.homepage("a", "b", "Bag", "100");
        System.out.println("Item Added");
    }
    @Test(priority = 3)
    public void verifyContactsLinkTest(){
        loginPage = new LoginPage(driver);
        itempage = new ItemPage(driver);
        itempage.navigateToContactsPage();
        System.out.println("Link Not Working");
    }
/*
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }*/
}
