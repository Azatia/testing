package Leads;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class LeadPushToAnotherLeads {

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

        // Нажимаем на Другие лиды
        driver
                .findElements(By.className("rb-lead-show-section"))
                .get(5)
                .findElement(By.className("deals-with-lead-section"))
                .findElement(By.className("row-cards"))
                .findElement(By.className("card-item-field"))
                .click();

        // Конец





    }

}
