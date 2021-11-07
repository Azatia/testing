package Azatia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class ManagerInviteAgent {

    @Test
    public void azatik() throws Exception {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Вход в программу
        driver.get("https://rbd.kz/site/login");


        // Заполнение поля почты
        driver
                .findElementByClassName("rb-email")
                .sendKeys("azat_too@mail.ru");

        // Заполнение поля пароля
        driver
                .findElementByClassName("rb-password")
                .sendKeys("Astana21");

        // Нажатие на кнопку «Войти»
        driver
                .findElementByClassName("rb-btn-voiti")
                .click();

        Thread.sleep(3000);

        // Входим в Кабинет пользователя
        driver
                .findElementByClassName("rb-app-menu")
                .findElement(By.className("b-avatar-img"))
                .click();

        Thread.sleep(5000);

        // Нажимаем на кнопку «Кабинет пользователя»
        driver
                .findElementsByClassName("mdi-cog")
                .get(1)
                .click();

        // Нажимаем на кнопку «Агентство»
        driver
                .findElementById("rb-si-agency")
                .click();

        Thread.sleep(3000);

        // Нажимаем на кнопку «+Пользователя»
        driver
                .findElementById("rb-agency-user-list-section")
                .findElement(By.className("mdi-plus"))
                .click();

        // Вводим E-mail
        driver
                .findElementByClassName("is-invalid")
                .sendKeys("ram_aza@mail.ru");

        // Даем роль агента
        driver
                .findElementByClassName("rb-tag-multi-select-search-input")
                .click();

        Thread.sleep(3000);

        // Нажимаем на инпут Агент
        driver
                .findElementByClassName("rb-tag-multi-select-input")
                .findElements(By.className("dropdown-item"))
                .get(0)
                .click();

        // Нажимаем на кнопку ОК
        driver
                .findElementById("rb-comp-3___BV_modal_footer_")
                .findElement(By.className("btn-primary"))
                .click();



        //// Приглашенный агент принимает приглашение ////

        // Вход в программу
        driver.get("https://rbd.kz/site/login");


        // Заполнение поля почты
        driver
                .findElementByClassName("rb-email")
                .sendKeys("ram_aza@mail.ru");

        // Заполнение поля пароля
        driver
                .findElementByClassName("rb-password")
                .sendKeys("Astana21");

        // Нажатие на кнопку «Войти»
        driver
                .findElementByClassName("rb-btn-voiti")
                .click();


        Thread.sleep(4000);

        // Нажимаем на кнопку «Кабинет пользователя»
        driver
                .findElementById("rb-si-user-profile")
                .click();

        Thread.sleep(2000);

        // Нажимаем на кнопку «Принять»
        driver
                .findElementByClassName("rb-invitation-card")
                .findElement(By.className("rb-row"))
                .findElement(By.className("rb-uppercase"))
                .click();

        Thread.sleep(4000);

        // Подтверждаем наши намерения
        driver.findElementById("rb-comp-3___BV_modal_footer_").findElement(By.className("btn-primary")).click();


        //Агент становится сотрудником агентства













    }
}
