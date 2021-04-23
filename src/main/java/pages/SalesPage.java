package pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SalesPage extends BasePage {

    @FindBy(linkText = "Add New")
    WebElement addrevene;

    @FindBy(id = "payment_date")
    WebElement payment;

    @FindBy(linkText = "23")
    WebElement tendate;

    @FindBy(id = "description")
    WebElement descr;

    @FindBy(id = "select2-account_id-1-container")
    WebElement selectacc;

    @FindBy(xpath = "//li[contains(text(),'Cash (USD)')]")
    WebElement link;

    @FindBy(xpath = "//span[@id='select2-category_id-3-container']")
    WebElement cat;

    @FindBy(xpath = "//li[contains(text(),'Sales')]")
    WebElement sales;
    @FindBy(xpath = "//input[@id='submit']")
    WebElement sub;

    public void setLink() {
        addrevene.click();
    }

    public void setDate() {
        payment.click();
    }

    public void setTendate() {
        tendate.click();
    }

    public void setDes(String des) {
        descr.sendKeys(des);
    }

    public void setACC() {
        selectacc.click();
    }

    public void setACC2() {
        link.click();
    }

    public void setCat() {
        cat.click();
    }

    public void setCat2() {
        sales.click();
    }

/*    public void submit() {
        sub.click();
    }*/

    public SalesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createNewRevene(String desc) {




        this.setLink();
        this.setDate();
        this.setTendate();
//        this.setACC();
//        this.setACC2();

        this.setCat();
        this.setCat2();
        this.setDes(desc);

        this.setACC();
        this.setACC2();


       /// this.submit();


    }


}
