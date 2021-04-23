package Evaly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class HighestValue {

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
        driver.findElement(By.xpath("//p[contains(text(),'MI')]")).click();
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[3]/a[2]/div[1]/div[1]/div[1]/img[1]")).click();

        String brandcheck = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/span[2]/a[1]")).getText();
        assertTrue(brandcheck.contains("MI"));
        System.out.println(brandcheck);

        //Click button

        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/button[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/button[2]")).click();


        //Check Cart Value
        String actualString = driver.findElement(By.xpath("//h5[contains(text(),'Xiaomi Tv Speaker - 33\"- 80W - Black')]")).getText();
        assertTrue(actualString.contains("Xiaomi Tv Speaker - 33\"- 80W - Black"));
        System.out.println(actualString);

    }
}
