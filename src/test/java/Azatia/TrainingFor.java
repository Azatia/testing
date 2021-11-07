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

public class TrainingFor {

        @Test
        public void azatik() throws Exception {

                WebDriverManager.chromedriver().setup();

                ChromeOptions options = new ChromeOptions();

                options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
                options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

                ChromeDriver driver = new ChromeDriver();
                driver.manage().window().maximize();


                // Идём на временный сайт
                driver
                        .get("https://temp-mail.org/ru/");


                // Открываем письмо
                driver
                        .findElementByClassName("inbox-dataList")
                        .findElement(By.className("hidden-xs-sm"))
                        .click();


        }
}
