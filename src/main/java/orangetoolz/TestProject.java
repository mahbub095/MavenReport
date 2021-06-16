package orangetoolz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProject {


    public static void main(String[] args) {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "C:\\c\\90\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://159.89.38.11/login");
        WebElement productlist = driver.findElement(By.name("username"));
        productlist.sendKeys("test@orangetoolz.com");
        driver.findElement(By.name("password")).sendKeys("8Kh8nTe*^jdk");
        driver.findElement(By.id("m_login_signin_submit")).click();
        driver.findElement(By.xpath("//body/div[2]/div[1]/main[1]/aside[1]/div[1]/ul[1]/li[3]/a[1]/i[1]")).click();

        driver.navigate().to("http://159.89.38.11/virtual/number/list");

        driver.findElement(By.xpath("//span[contains(text(),'New Virtual Number List')]")).click();
        driver.findElement(By.id("name")).sendKeys("Test121");
        driver.findElement(By.id("description")).sendKeys("Lorem description");
        driver.findElement(By.xpath("//button[@id='submit-virtual-list-template']")).click();
    }

}