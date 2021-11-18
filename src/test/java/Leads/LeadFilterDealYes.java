package Leads;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;


public class LeadFilterDealYes {


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


        // ФИЛЬТРАЦИЯ

        Thread.sleep(2000);

        // Нажимаем на Ещё фильтры
        driver
                .findElement(By.className("mdi-chevron-down"))
                .click();

        Thread.sleep(2000);

        // Нажимаем на Наличие сделки
        driver
                .findElement(By.className("rb-filter-section"))
                .findElements(By.className("v-filter-item"))
                .get(2)
                .findElement(By.className("rb-text"))
                .click();

        // Нажимаем на ДА в наличии сделки
        driver
                .findElement(By.className("rb-filter-section"))
                .findElements(By.className("v-filter-item"))
                .get(2)
                .findElement(By.className("dropdown-menu"))
                .findElements(By.className("dropdown-item"))
                .get(0)
                .click();





    }
}
