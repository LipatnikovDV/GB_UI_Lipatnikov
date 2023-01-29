package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class itemInFavorites {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.lamoda.ru/women-home/");

//        //кнопка вход
//        WebElement webElement0 = driver.findElement(By.xpath("//a[@class='_root_clp6c_2 _secondaryLabel_clp6c_13 _link_1gjtp_11 _link_1gjtp_11']"));
//        webElement0.click();
//
//        //поле ввода email
//        WebElement webElement02 = driver.findElement(By.xpath("//input[@name='login']"));
//        webElement02.click();
//        webElement02.sendKeys("danilalipatnikoff@yandex.ru");
//
//        //поле ввода password
//        WebElement webElement03 = driver.findElement(By.xpath("//input[@name='password']"));
//        webElement03.click();
//        webElement03.sendKeys("danilalipatnikoff");
//
//        //кнопка Войти
//        WebElement webElement04 = driver.findElement(By.xpath("//button[@class='x-button x-button_primaryFilledWeb7184 x-button_40 x-button_intrinsic-width _submit_3z173_25']"));
//        webElement04.click();



        //кнопка меню Женщинам
        WebElement webElement1 = driver.findElement(By.xpath("//a[@href='/c/4153/default-women/?is_new=1&sitelink=topmenuW&l=2']"));
        webElement1.click();

//        кнопка меню ОдеждаЖ
        WebElement webElement2 = driver.findElement(By.xpath("//a[@href='/c/4153/default-women/?is_new=1&sitelink=topmenuW&l=2']"));
        webElement2.click();

        //кнопка Сердечко
        WebElement webElement3 = driver.findElement(By.xpath("//div[@class='x-product-card__overlay-top-right'][1]"));
        webElement3.click();

        //Завершаем работу с ресурсом
        driver.quit();
    }
}
