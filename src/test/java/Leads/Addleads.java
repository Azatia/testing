package Leads;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class Addleads {


    @Test
    public void azatik() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // ДОБАВЛЯЕМ ЛИДЫ


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

        // Нажимаем на Добавить лид
        driver
                .findElementByClassName("rb-toolbar-actions-section")
                .findElement(By.className("mdi-plus"))
                .click();

        // ЗАПОЛНЕНИЕ ЛИДА

        // Заполняем имя
        driver
                .findElementByClassName("rb-lead-form-section-wrapper")
                .findElement(By.className("lead-form-section-name-item"))
                .findElement(By.className("form-control"))
                .sendKeys("Zarina");

        // Заполняем E-mail
        driver
                .findElementByClassName("rb-lead-form-section-wrapper")
                .findElement(By.className("lead-form-section-email-item"))
                .findElement(By.className("form-control"))
                .sendKeys("Askar_com@mail.ru");

        // Заполняем телефон
        driver
                .findElementByClassName("rb-lead-form-section-wrapper")
                .findElement(By.className("lead-form-section-phone-item"))
                .findElement(By.className("form-control"))
                .sendKeys("+77773209095");

        // Заполняем источник
        driver
                .findElementByClassName("rb-lead-form-section-wrapper")
                .findElement(By.className("lead-form-section-source-item"))
                .findElement(By.className("btn-light"))
                .click();

        // Выбираем тип источника
        driver
                .findElementByClassName("rb-lead-form-section")
                .findElement(By.className("dropdown-menu"))
                .findElements(By.className("dropdown-item"))
                .get(5)
                .click();

        // Нажимаем на кнопку Добавить
        driver
                .findElementByClassName("rb-footer-buttons")
                .findElement(By.className("btn-primary"))
                .click();


    }



}