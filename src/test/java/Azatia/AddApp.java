package Azatia;

import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AddApp {

    @Test
    public void azatik() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

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
        driver
                .findElementByClassName("rb-search-section-input")
                .findElement(By.className("dropdown-toggle")).click();

        driver
                .findElementsByClassName("rb-item").get(1).click();

        // выбираем комнатность
        driver.findElementByClassName("rb-room-count-filter-item").findElements(By.className("btn-light")).get(2).click();

        // Кнопка «Поиск»
        driver.findElementByClassName("v-btn-search").click();
        Thread.sleep(5000);

        // Выбираем объект
        driver
                .findElement(By.className("v-demand-start-frame-result-body"))
                .findElement(By.className("v-secondary-supply-table-card"))
                .findElement(By.className("card-body"))
                .findElement(By.cssSelector("table"))
                .findElement(By.cssSelector("tbody"))
                .findElements(By.cssSelector("tr"))
                .get(2)
                .click();

        Thread.sleep(3000);

        // Нажимаем на АКТИВНОСТЬ
        driver
                .findElement(By.className("main-row"))
                .findElement(By.className("dropdown-toggle"))
                .click();

        Thread.sleep(3000);

        // Нажимаем добавить в «Мои объекты»
        driver
                .findElement(By.className("dropdown-menu-right"))
                .findElements(By.className("rb-action"))
                .get(2)
                .click();


        Thread.sleep(3000);

        //Пытаемся нажать на поле номер кв и внести данные

        driver
                .findElement(By.className("sf-flat-num-item"))
                .findElement(By.cssSelector("input"))
                .sendKeys("88");

        // Нажимаем на «Копировать»
        driver
                .findElementById("rb-comp-5___BV_modal_footer_")
                .findElement(By.className("btn-primary"))
                .click();
    }


}
