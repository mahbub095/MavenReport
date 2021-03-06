package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {
    static WebDriver driver;

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\c\\90\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Title" + driver.getTitle());
        driver.findElement(By.name("txtUsername")).click();
        By calendar = By.cssSelector("table.ui-datepicker-calendar a");
        selectDate("25", calendar);
    }

    public static void selectDate(String day) {
        driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
    }

    public static void selectDate(String day, By locator) {
        List<WebElement> dateList = driver.findElements(locator);
        System.out.println(dateList.size());

        for (WebElement e : dateList) {
            String date = e.getText();
            //System.out.println(date);
            if (date.equals(day)) {
                e.click();
                break;
            }
        }
    }

    public static void selectDate(String day, int number) {
        driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
    }
}

