package Evaly;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.testng.AssertJUnit.assertTrue;

public class Career {


    WebDriver driver;

    @Test
    public void ByPixel() throws UnknownHostException {
        System.setProperty("webdriver.chrome.driver", "G:\\MavenReport\\Browser\\90\\chromedriver.exe");
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application
        driver.get("https://evaly.com.bd/career");

        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//body/reach-portal[1]/div[1]/div[1]/div[1]/section[1]/div[1]/button[1]/*[1]")).click();
        // This  will scroll down the page by  1000 pixel vertical
        js.executeScript("window.scrollBy(0,250)");

        driver.findElement(By.xpath("//h3[contains(text(),'Accounts & Treasury')]")).click();

        String accname = driver.findElement(By.xpath("//a[contains(text(),'at.career@evaly.com.bd')]")).getText();
        System.out.println(accname);
        InetAddress inetAddress = InetAddress.getByName("evaly.com.bd");
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());

        driver.findElement(By.xpath("//h3[contains(text(),'Commercial')]")).click();
        String commercial = driver.findElement(By.xpath("//h3[contains(text(),'Commercial')]")).getText();
        System.out.println(commercial);

        driver.findElement(By.xpath("//h3[contains(text(),'Engineering')]")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'HR & Admin')]")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'Content Management')]")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'Corporate Brand & Marketing')]")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'Customer Experience')]")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'Finance and Account')]")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'Issue Resolution')]")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'Operations')]")).click();


        driver.findElement(By.xpath("//h3[contains(text(),'Operations - (Bike Department)')]")).click();
    }
}
