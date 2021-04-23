package Evaly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ValidateProduct {

    public static void main(String[] args) {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "G:\\MavenReport\\Browser\\90\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://evaly.com.bd/");

        driver.findElement(By.xpath("//body/reach-portal[1]/div[1]/div[1]/div[1]/section[1]/div[1]/button[1]/*[1]")).click();
        driver.findElement(By.linkText("Speaker")).click();
        java.util.List<WebElement> products = driver.findElements(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]"));
        for (WebElement product : products) {
            System.out.println("Your Product Name \n");
            System.out.println(product.getText());

        }

        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]/span[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='custom-popover']/div[1]/div[1]/div[1]/form[1]/div[1]/label[1]/input[1]")).sendKeys("0XXXXX");
        driver.findElement(By.xpath("//body/div[@id='custom-popover']/div[1]/div[1]/div[1]/form[1]/div[2]/label[1]/input[1]")).sendKeys("XXXXXXXXX");
        driver.findElement(By.xpath("//body/div[@id='custom-popover']/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")).click();


    }
}