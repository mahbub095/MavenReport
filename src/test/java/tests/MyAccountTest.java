package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPageNew;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class MyAccountTest extends TestBase {
    HomePage homePage;
    UserRegistrationPage userRegistrationPage;
    LoginPageNew loginPage;
    MyAccountPage myAccountPage;
    private final String email = "testtestssfsfsffs13003@test.com";
    private final String newPassword = "FdJnx@SXP7uSaaspJ";

    @Test(priority = 1, alwaysRun = true)
    public void UserCanRegisterSuccessfully() {
        homePage = new HomePage(driver);
        //open reg link
        homePage.openRegistrationPage();

        //initialize date from userRegistration
        userRegistrationPage = new UserRegistrationPage(driver);
        String fName = "test";
        String lName = "test";
        String password = "FdJnx@SXP7uSspJ";
        userRegistrationPage.userRegistration(fName, lName,
                email, password, password);
    }

    @Test(priority = 2, dependsOnMethods = "UserCanRegisterSuccessfully")
    public void userCanChanePassword() {
        myAccountPage = new MyAccountPage(driver);
        //click my account
        homePage.openMyAccountPage();

        //initialize date from changepassword
        String oldPassword = "FdJnx@SXP7uSspJ";
        myAccountPage.changePassword(oldPassword, newPassword);
    }

    @Test(priority = 3, dependsOnMethods = "userCanChanePassword")
    public void RegisteredUserCanLogout() {
        homePage = new HomePage(driver);
        //click logout
        homePage.userLogout();
    }

    @Test(priority = 4, dependsOnMethods = "RegisteredUserCanLogout")
    public void RegisteredUserCanLogin() {
        loginPage = new LoginPageNew(driver);
        //click login
        homePage.openLoginPage();
        //initialize date from login
        loginPage.login(email, newPassword);
    }
}
