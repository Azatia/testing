package Azatia;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Azatik {

@Test
    public void Azatik() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Job/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    // В поисках временного пространства
//    driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
//
//    WebDriverWait wait = new WebDriverWait(driver,3);

    driver.get("https://rbd.kz/site/main");

    // Нажать на кнопку «Вход»
    driver.findElement(By.id("rb-nav-collapse"))
            .findElement(By.className("navbar-nav"))
            .findElements(By.className("nav-item"))
            .get(4)
            .click();
    // Авторизоваться

    WebElement loginInput = driver.findElement(By.className("rb-email"));

    //логин вводим
    loginInput.sendKeys("azat_too@mail.ru");

    //пароль вводим
    driver.findElementByClassName("rb-password").sendKeys("Astana21");

    //Нажимаем на Вход
    driver.findElementByClassName("btn-login").click();

    //Костыльный вариант Адиля с тайм-аутом. Спросить у Рустема, как правильно!
    Thread.sleep(5000);

//    wait.until(ExpectedConditions.presenceOfElementLocated ());

    //+ объекта
    //driver.findElementByClassName("rb-add-supply-btn").click();

    //Поиск, меняем фильтры
    driver.findElementByClassName("rb-search-section-input").findElement(By.className("dropdown-toggle")).click();
    driver.findElementsByClassName("rb-item").get(1).click();

    driver.findElementByClassName("v-btn-search").click();










}



}
