package Azatia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Registration {

    @Test
    public void azatik() throws InterruptedException, IOException, UnsupportedFlavorException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Путь к временной почте

        driver.get("https://temp-mail.org/ru/");

        Thread.sleep(7000);

        // Копируем временную почту
        driver
                .findElementsByClassName("btn-rds")
                .get(2)
                .click();

        // Идём на сайт регистрации
        driver.get("https://rbd.kz/site/main");

        // Регистрация
        driver
                .findElementByClassName("jumbotron")
                .findElement(By.className("btn-success"))
                .click();


        // Вводим скопированный E-mail
        driver
                .findElement(By.className("form-control"))
                .sendKeys("aza");


            //завис



















    }
}
