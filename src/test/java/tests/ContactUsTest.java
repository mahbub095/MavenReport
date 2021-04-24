package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase {
    HomePage homePage;
    ContactUsPage contactUsPage;
    String name = "Mahbubur";
    String email = "admin@gmail.com";
    String enquiry = "Is Enquiry works good ?!";

    @Test
    public void UserCanSendEnquiry() {
        homePage = new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        homePage.scrollTo("5000");
        homePage.openContactUsPage();
        contactUsPage.sendEnquiry(name, email, enquiry);
//        Assert.assertTrue(contactUsPage.enquiryConfirmationMessage
//                .getText().contains("Your enquiry has been successfully sent to the store owner."));
    }
}
