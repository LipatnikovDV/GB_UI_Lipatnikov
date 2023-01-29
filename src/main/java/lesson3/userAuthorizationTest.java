package lesson3;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class userAuthorizationTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.lamoda.ru/women-home/");

        //кнопка вход
         WebElement webElement1 = driver.findElement(By.xpath("//a[@class='_root_clp6c_2 _secondaryLabel_clp6c_13 _link_1gjtp_11 _link_1gjtp_11']"));
        webElement1.click();

        //поле ввода email
        WebElement webElement2 = driver.findElement(By.xpath("//input[@name='login']"));
        webElement2.click();
        webElement2.sendKeys("danilalipatnikoff@yandex.ru");

        //поле ввода password
        WebElement webElement3 = driver.findElement(By.xpath("//input[@name='password']"));
        webElement3.click();
        webElement3.sendKeys("danilalipatnikoff");

        //кнопка Войти
        WebElement webElement4 = driver.findElement(By.xpath("//button[@class='x-button x-button_primaryFilledWeb7184 x-button_40 x-button_intrinsic-width _submit_3z173_25']"));
        webElement4.click();

        //Завершаем работу с ресурсом
         driver.quit();
    }
}
