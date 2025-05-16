package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class
AT02_NavigateTitleAssertScreenshot {

    @Test
    public void Navigation() throws IOException{
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.thegoodguys.com.au/");

        driver.findElement(By.xpath("//*[@id=\"myAcctId\"]/div/a")).click();

        driver.findElement(By.id("btn_register")).click();
    }
}
