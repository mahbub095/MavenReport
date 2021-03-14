package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class isbtest {
    WebDriver driver;

    public void openbrowser() {

        try {
            System.setProperty("webdriver.chrome.driver", "C:\\c\\c\\c\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            formtest();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void formtest() {
        try {

            driver.navigate().to("https://isb-cgc.appspot.com/cohorts/new_cohort/");
            driver.findElement(By.xpath("//body/main[@id='cohort-details']/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/a[1]/i[1]")).click();
            driver.findElement(By.xpath("//input[@id='5-PROGRAM_NAME-TCGA']")).click();
            driver.findElement(By.xpath("//body/main[@id='cohort-details']/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]/a[1]/i[1]")).click();
            driver.findElement(By.xpath("//input[@id='5-PROJECT_SHORT_NAME-TCGA-LUAD']")).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        isbtest myObj = new isbtest();
        myObj.openbrowser();
    }
}

