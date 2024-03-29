package Leads;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class Leadedit2 {

    @Test
    public void azatik() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // Лиды
        driver.get("http://167.71.49.98/site/login");


        // Логинемся
        driver
                .findElementByClassName("rb-email")
                .sendKeys("k.hamzina@bi-agency.kz.staging");

        // Заполнение поля пароля
        driver
                .findElementByClassName("rb-password")
                .sendKeys("111");

        // Нажатие на кнопку «Войти»
        driver
                .findElementByClassName("rb-btn-voiti")
                .click();

        Thread.sleep(5000);

        // Нажимаем на раздел Лиды
        driver
                .findElementById("rb-si-leads")
                .findElement(By.className("rb-title"))
                .click();

        Thread.sleep(3000);

        // Выбираем лид
        driver
                .findElementByClassName("rb-table-card-lead")
                .findElements(By.className("rb-name-column"))
                .get(1)
                .click();

        Thread.sleep(5000);

        // Нажимаем на Разобрать Лид
        driver
                .findElementByClassName("main-row")
                .findElement(By.className("rb-actions"))
                .findElement(By.className("mdi-check-circle"))
                .click();


        Thread.sleep(3000);

        // Нажимаем на инпут Категорию Лида
        driver
                .findElementByClassName("lead-form-section-category-item")
                .findElement(By.className("rb-bordered"))
                .findElement(By.className("btn-light"))
                .findElement(By.className("rb-text"))
                .click();

        // Выбираем категорию
        driver
                .findElementByClassName("lead-form-section-category-item")
                .findElement(By.className("rb-bordered"))
                .findElements(By.className("dropdown-item"))
                .get(1)
                .click();


        // Нажимаем на инпут тип сделки
        driver
                .findElementByClassName("deal-form-section-deal-type")
                .findElement(By.className("btn-light"))
                .click();

        Thread.sleep(3000);

        // Выбираем тип сделки Покупатель
        driver
                .findElementByClassName("deal-form-section-deal-type")
                .findElement(By.className("dropdown-menu"))
                .findElements(By.className("dropdown-item"))
                .get(4)
                .click();

        Thread.sleep(3000);

        // Нажимаем на кнопку Создать сделку
        driver
                .findElementByClassName("btn-success")
                .click();


        Thread.sleep(3000);

        // Нажимаем на поле Агент и вводим имя агента
        driver
                .findElement(By.className("lead-deal-form"))
                .findElements(By.className("form-group"))
                .get(1)
                .findElement(By.className("rb-typeahead-input"))
                .findElement(By.className("multiselect__tags"))
                .findElement(By.cssSelector("span"))
                .click();

        Thread.sleep(1000);

        driver
                .findElementByClassName("lead-deal-form")
                .findElements(By.className("form-group"))
                .get(1)
                .findElement(By.className("rb-typeahead-input"))
                .findElement(By.className("multiselect__tags"))
                .findElement(By.cssSelector("input"))
                .sendKeys("Azat Ramazanov");

        Thread.sleep(1000);

        driver
                .findElementByClassName("lead-deal-form")
                .findElements(By.className("form-group"))
                .get(1)
                .findElement(By.className("rb-typeahead-input"))
                .findElement(By.className("multiselect__tags"))
                .findElement(By.cssSelector("input"))
                .sendKeys(Keys.ENTER);


        // Нажимаем на Тип договора

        driver
                .findElement(By.className("lead-deal-form"))
                .findElement(By.className("deal-form-section-agreement-type"))
                .findElement(By.className("rb-bordered"))
                .click();

        Thread.sleep(1000);

        // Нажимаем на Типовой
        driver
                .findElement(By.className("lead-deal-form"))
                .findElement(By.className("deal-form-section-agreement-type"))
                .findElements(By.className("dropdown-item"))
                .get(2)
                .click();

        Thread.sleep(2000);

        // Нажимаем на Создать

        driver
                .findElement(By.className("btn-sm"))
                .click();













    }

}
