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
           /* driver.navigate().to("http://minmax.test/wp-admin/");
            driver.findElement(By.id("user_login")).sendKeys("admin");
            driver.findElement(By.id("user_pass")).sendKeys("admin");
            driver.findElement(By.id("wp-submit")).click();
            driver.findElement(By.linkText("WooCommerce")).click();
            driver.findElement(By.linkText("Min Max Quantities")).click();
            driver.findElement(By.linkText("General Settings")).click();


            driver.findElement(By.id("wc_minmax_quantity_general_settings[min_product_quantity]")).clear();
            driver.findElement(By.id("wc_minmax_quantity_general_settings[min_product_quantity]")).sendKeys("1");

            driver.findElement(By.id("wc_minmax_quantity_general_settings[max_product_quantity]")).clear();
            driver.findElement(By.id("wc_minmax_quantity_general_settings[max_product_quantity]")).sendKeys("8");

            driver.findElement(By.id("wc_minmax_quantity_general_settings[min_cart_price]")).clear();
            driver.findElement(By.id("wc_minmax_quantity_general_settings[min_cart_price]")).sendKeys("10");

            driver.findElement(By.id("wc_minmax_quantity_general_settings[max_cart_price]")).clear();
            driver.findElement(By.id("wc_minmax_quantity_general_settings[max_cart_price]")).sendKeys("100");
            driver.findElement(By.id("submit")).click();
*/
            driver.navigate().to("http://minmax.test/shop/");
            driver.findElement(By.xpath("//body/section[@id='primary']/main[@id='main']/ul[1]/li[2]/a[2]")).click();

            driver.findElement(By.xpath("//a[contains(text(),'View cart')]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
            driver.findElement(By.id("billing_first_name")).sendKeys("Mahbubur");
            driver.findElement(By.id("billing_last_name")).sendKeys("Rahman");
            driver.findElement(By.id("billing_address_1")).sendKeys("Dhaka");
            driver.findElement(By.id("billing_city")).sendKeys("Mirpur");
            driver.findElement(By.id("billing_phone")).sendKeys("01671816194");
            driver.findElement(By.id("billing_email")).sendKeys("mahbub.095@gmail.com");

            driver.findElement(By.id("place_order")).click();

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
