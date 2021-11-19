package Tasks;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class TaskClose {

    @Test
    public void azatik() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // Сайт
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

        // Нажимаем на раздел Задачи
        driver
                .findElementById("rb-si-todos")
                .findElement(By.className("rb-title"))
                .click();


        Thread.sleep(3000);

        // Открываем задачу
        driver
                .findElements(By.className("rb-todo-column"))
                .get(1)
                .findElement(By.className("rb-todo-name"))
                .click();







    }
}
