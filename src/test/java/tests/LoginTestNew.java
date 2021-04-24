package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.LoginPageNew;

public class LoginTestNew extends TestBase {

    HomePage homePage;
    LoginPageNew loginPage;

    @Test
    public void userCanLoginSuccessfully() {
        homePage = new HomePage(driver);
        loginPage = new LoginPageNew(driver);
        homePage.openLoginPage();
        loginPage.login("test33@test.com", "FdJnx@SXP7uSspJ");
    }
}