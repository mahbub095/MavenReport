package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MinMax {

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
            driver.navigate().to("http://minmax.test/wp-admin/");
            driver.findElement(By.id("user_login")).sendKeys("admin");
            driver.findElement(By.id("user_pass")).sendKeys("admin");
            driver.findElement(By.id("wp-submit")).click();
            driver.findElement(By.linkText("WooCommerce")).click();
            driver.findElement(By.linkText("Min Max Quantities")).click();
            driver.findElement(By.linkText("General Settings")).click();


            driver.findElement(By.id("wc_minmax_quantity_general_settings[min_product_quantity]")).clear();
            driver.findElement(By.id("wc_minmax_quantity_general_settings[min_product_quantity]")).sendKeys("3");

            driver.findElement(By.id("wc_minmax_quantity_general_settings[max_product_quantity]")).clear();
            driver.findElement(By.id("wc_minmax_quantity_general_settings[max_product_quantity]")).sendKeys("8");

            driver.findElement(By.id("wc_minmax_quantity_general_settings[min_cart_price]")).clear();
            driver.findElement(By.id("wc_minmax_quantity_general_settings[min_cart_price]")).sendKeys("40");

            driver.findElement(By.id("wc_minmax_quantity_general_settings[max_cart_price]")).clear();
            driver.findElement(By.id("wc_minmax_quantity_general_settings[max_cart_price]")).sendKeys("200");

            driver.findElement(By.id("submit")).click();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MinMax myObj = new MinMax();
        myObj.openbrowser();
    }
}
