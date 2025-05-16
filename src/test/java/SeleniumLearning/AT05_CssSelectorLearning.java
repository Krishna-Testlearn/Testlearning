package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT05_CssSelectorLearning {

    @Test
    public void cssLearn() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");

        driver.findElement(By.id("personal_info_title")).click();

        driver.findElement(By.xpath("//*[@id=\"personal_info_title\"]/option[3]")).click();

        driver.findElement(By.cssSelector("#regAddForm_firstName")).sendKeys("Krishna");

        driver.findElement(By.xpath(" //*[@id=\"regAddForm_lastName\"]")).sendKeys("Cheeti");
    }
}
