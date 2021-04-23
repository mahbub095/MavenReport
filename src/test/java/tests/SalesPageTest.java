package tests;

import java.util.Properties;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SalesPage;
import pages.ItemPage;
import pages.LoginPage;


public class SalesPageTest {

    public BasePage basePage;
    public WebDriver driver;
    public Properties prop;
    public LoginPage loginPage;
    public ItemPage itempage;
    public SalesPage salesPage;

    @BeforeMethod
    public void setUp() {
        basePage = new BasePage();
        prop = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(prop.getProperty("url"));
        loginPage = new LoginPage(driver);
        //homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        //	addRevene = homePage.navigateToContactsPage();
    }

/*	@DataProvider(name = "getContactsTestData")
	public Object[][] getContactsTestData() {
		//Object contactsData[][] = TestUtil.getTestData(Constants.CONTACTS_SHEET_NAME);
		return contactsData;
	}
	
	*/

    @Test/*(dataProvider = "getContactsTestData")*/
    public void createNewContactTest() {

        loginPage = new LoginPage(driver);
        loginPage.loginpage("admin", "admin");

        itempage = new ItemPage(driver);
        itempage.homepage("a", "b", "Ball", "10");
        System.out.println("Item Added");
        itempage.navigateToContactsPage();

        salesPage = new SalesPage(driver);
        System.out.println("Sales Link Working");
        salesPage.createNewRevene("A");
    }

    /*@AfterMethod // --this method will be executed after every test method
    public void tearDown() {
        driver.quit();
    }*/

}
