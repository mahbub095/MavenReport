package orangetoolz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {


    public static void main(String[] args) {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "C:\\c\\90\\chromedriver.exe");
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

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

        driver.navigate().to("http://159.89.38.11/profile");

        driver.findElement(By.name("first_name")).clear();
        driver.findElement(By.name("first_name")).sendKeys("Mahbubur");

        driver.findElement(By.name("last_name")).clear();
        driver.findElement(By.name("last_name")).sendKeys("Rahman");

        driver.findElement(By.name("phone")).clear();
        driver.findElement(By.name("phone")).sendKeys("01838247249");

        driver.findElement(By.name("phone")).click();
        // This  will scroll down the page by  1000 pixel vertical
        js.executeScript("window.scrollBy(0,250)");

        driver.findElement(By.xpath("//body/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/button[1]")).click();


    }

}