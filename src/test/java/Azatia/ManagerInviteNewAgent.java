package Azatia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

import org.openqa.selenium.By;

public class ManagerInviteNewAgent {

    @Test
    public void azatik() throws Exception {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        //// МЕНЕДЖЕР АГЕНТСТВА ПРИГЛАШАЕТ СОТРУДНИКА В АГЕНТСТВО, НОВЫЙ АГЕНТ ПРОХОДИТ РЕГИСТРАЦИЮ ////

        // Создаем временную почту

        //Путь к временной почте

        driver.get("https://temp-mail.org/ru/");

        Thread.sleep(7000);

        // Копируем временную почту
        driver
                .findElementsByClassName("btn-rds")
                .get(2)
                .click();


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

        // Crtl + v
        driver
                .findElementByClassName("modal-body")
                .findElement(By.className("is-invalid")).sendKeys(Keys.CONTROL + "v");


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


        // Идём на временный сайт
        driver
                .get("https://temp-mail.org/ru/");

        Thread.sleep(9000);


        // Отркываем письмо
        driver
                .findElementByClassName("inbox-dataList")
                .findElement(By.className("hidden-xs-sm"))
                .click();

        // Переходим по ссылке в письме ------------------------------ не закончил

        driver
                .findElements(By.cssSelector("tbody"))
                .get(1)
                .findElements(By.cssSelector("tr"))
                .get(1)
                .findElement(By.cssSelector("p"))
                .findElement(By.cssSelector("a"))
                .click();



    }
}
