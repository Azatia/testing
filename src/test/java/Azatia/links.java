package Azatia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class links {


    @Test
    public void azatik() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


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
                .findElementsByClassName("llc__content")
                .get(0)
                .click();

        Thread.sleep(4000);

        // Переходим по ссылке
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
