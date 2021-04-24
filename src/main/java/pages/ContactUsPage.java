package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FullName")
    WebElement yourNameTxtBox;

    @FindBy(id = "Email")
    WebElement emailTxtBox;

    @FindBy(id = "Enquiry")
    WebElement enquiryTxtBox;

    @FindBy(name = "send-email")
    WebElement submitEnquiryBtn;

    @FindBy(css = "div.result")
    public WebElement enquiryConfirmationMessage;

    public void sendEnquiry(String name, String email, String enquiry) {
        setTxtElement(yourNameTxtBox, name);
        setTxtElement(emailTxtBox, email);
        setTxtElement(enquiryTxtBox, enquiry);
        clickOnElement(submitEnquiryBtn);
    }

}
