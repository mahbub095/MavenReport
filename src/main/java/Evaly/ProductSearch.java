package Evaly;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.fail;

public class ProductSearch {

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
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Motor Bike");
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/*[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Motor Bike");

        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]")).clear();
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]")).sendKeys("90000");

        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")).clear();
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")).sendKeys("200000");

        driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();

        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/label[1]/input[1]")).click();

        //Select TVS
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[4]/label[1]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/ul[1]/li[1]/label[1]/input[1]")).click();

        driver.findElement(By.xpath("//p[contains(text(),'TVS Apache RTR-160CC 4V (Single Disc)')]")).click();


        //Validate Brand Name
        String brandcheck = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/span[2]/a[1]")).getText();
        assertTrue(brandcheck.contains("TVS"));
        System.out.println("Check Brand Name:");
        System.out.println(brandcheck);


        //Validate Color

        String colorcheck = driver.findElement(By.xpath("//span[contains(text(),'Red')]")).getText();
        assertTrue(colorcheck.contains("Red"));
        System.out.println("Check Brand Color");
        System.out.println(colorcheck);

    }
}

