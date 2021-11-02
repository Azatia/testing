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

public class PasswordRecovery {

    @Test
    public void azatik() throws Exception {

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

        Thread.sleep(5000);


        // Открываем письмо
        driver
                .findElements(By.className("llc__content"))
                .get(0)
                .click();

        Thread.sleep(7000);

        // Переходим по ссылке
        driver
                .findElements(By.cssSelector("tbody"))
                .get(1)
                .findElements(By.cssSelector("tr"))
                .get(1)
                .findElement(By.cssSelector("p"))
                .findElement(By.cssSelector("a"))
                .click();

        // Открывается поле для пароля

        Thread.sleep(6000);

        String currentHandle = driver.getWindowHandle();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(currentHandle)) driver.switchTo().window(handle);
        }


        driver
                .findElement(By.className("card-body"))
                .findElements(By.className("form-group"))
                .get(0)
                .findElement(By.cssSelector("input"))
                .sendKeys("Astana21");

        driver
                .findElement(By.className("card-body"))
                .findElements(By.className("form-group"))
                .get(1)
                .findElement(By.cssSelector("input"))
                .sendKeys("Astana21");

        //Установить

        driver
                .findElementByClassName("rb-btn-next")
                .click();

        // Конец



    }
}