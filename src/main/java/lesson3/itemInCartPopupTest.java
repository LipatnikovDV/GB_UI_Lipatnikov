package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class itemInCartPopupTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
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

        //активировать выпадающее окно
        WebElement moveTo = driver.findElement(By.xpath("//div[@class='_area_552z7_8'][1]"));
        new Actions(driver)
                .scrollByAmount(0,500)
                .moveToElement(moveTo)
                .perform();

        //кнопка подробнее
        WebElement webElement3 = driver.findElement(By.xpath("//div[@class='icon icon_quickview-hovered icon_direction-down icon_24']"));
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.xpath("//button[@class='x-button x-button_primaryPremium x-button_48 _cartButton_lky3q_11']"));
        webElement4.click();

        //выбор размера
        WebElement webElement5 = driver.findElement(By.xpath("//div[@class=\"recaptcha\"]/div[1]"));
        webElement5.click();

        //      //Кнопка Перейти в корзину
        WebElement webElement6 = driver.findElement(By.xpath("//a[@class='x-button x-button_primaryFilledWeb7184 x-button_32 x-button_link x-button_link_32 x-button_intrinsic-width']"));
        webElement6.click();


        //Завершаем работу с ресурсом
        driver.quit();
    }
}
