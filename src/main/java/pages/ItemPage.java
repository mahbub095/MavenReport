package pages;

import Base.BasePage;
import com.sun.org.glassfish.gmbal.Description;
import constants.Constants;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ItemPage extends BasePage {


    @FindBy(id = "title")
    WebElement title;

    @FindBy(id = "content")
    WebElement content;

    @FindBy(linkText = "Accounting")
    WebElement accbtn;

    @FindBy(linkText = "Items")
    WebElement itembtn;

    @FindBy(linkText = "Add New")
    WebElement addbtn;

    @FindBy(id = "name")
    WebElement nameitem1;

    @FindBy(id = "sale_price")
    WebElement saleprice;

    @FindBy(id = "submit")
    WebElement submitbtn;

    //Constructor
    public ItemPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
  /*  public String getHomePageTitle(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.titleContains(Constants.HOME_PAGE_TITLE));
        return driver.getTitle();
    }*/
    public void setUserName(String a) {
        title.sendKeys(a);

    }

    //Set password in password textbox
    public void setPassword(String b) {
        content.sendKeys(b);
    }

    public void setNameitem(String itme) {
        nameitem1.sendKeys(itme);
    }

    public void clickacc() {
        accbtn.click();
    }

    public void clickbtn() {
        itembtn.click();
    }

    public void setAddbtn() {
        addbtn.click();
    }

    public void setSubmit() {
        submitbtn.click();
    }

    public void setPrice(String sale) {
        saleprice.sendKeys(sale);
    }


    public void homepage(String a, String b, String name, String sale) {

        this.setUserName(a);
        this.setPassword(b);
        this.clickacc();
        this.clickbtn();
        this.setAddbtn();
        this.setNameitem(name);
        this.setPrice(sale);
        this.setSubmit();

    }
}
	
	
	

