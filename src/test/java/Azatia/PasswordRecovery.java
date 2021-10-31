package Azatia;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class PasswordRecovery {

    @Test
    public void azatik() throws InterruptedException, IOException, UnsupportedFlavorException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rbd.kz/site/login");


        Thread.sleep(3000);

        //Кликаем на кнопку «Забыли пароль»
        driver
                .findElementById("bcol-forget-pass")
                .click();

        // Указываем в поле E-mail
        driver
                .findElement(By.className("form-control"))
                .sendKeys("vesrbd@mail.ru");


        //Нажимаем на кнопку «Восстановить»
        driver
                .findElementByClassName("rb-btn-next")
                .click();

        //Идём на почту Mail.ru
        driver.get("https://mail.ru/");

        Thread.sleep(3000);

        //Логинемся
        driver
                .findElementByClassName("email-input")
                .sendKeys("ves_rbd@mail.ru");

        // Нажимаем на ввести пароль
        driver
                .findElementByClassName("icon-next")
                .click();

        Thread.sleep(3000);

        driver
                .findElementById("mailbox")
                .findElement(By.className("password-input-container"))
                .findElement(By.className("password-input"))
                .sendKeys("astana21");


        driver
                .findElementById("mailbox")
                .findElement(By.className("second-button"))
                .click();

        Thread.sleep(3000);


        // Открываем письмо
        driver
                .findElementsByClassName("ll-sj__normal")
                .get(0)
                .click();

        Thread.sleep(3000);

        // Переходим по ссылке
        driver
                .findElementByClassName("cl_807188")
                .findElement(By.cssSelector("a"))
                .click();

























    }

}
