package Tasks;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class AddTask {

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

        // Нажимаем на раздел Лиды
        driver
                .findElementById("rb-si-todos")
                .findElement(By.className("rb-title"))
                .click();


        Thread.sleep(3000);

        // Нажимаем на кнопку Добавить задачу
        driver
                .findElement(By.className("rb-toolbar-actions-section"))
                .findElement(By.className("mdi-plus"))
                .click();

        Thread.sleep(3000);

        // Нажимаем на Описание и заполняем текстом
        driver
                .findElement(By.className("todo-description-form-section"))
                .findElement(By.className("form-control"))
                .sendKeys("Азат самый лучший любовник на свете");

        // Нажимаем на Дата и время
        driver
                .findElement(By.className("rb-field-group"))
                .findElements(By.className("form-group"))
                .get(0)
                .click();


        Thread.sleep(3000);

        // В поле Дата и время нажимаем на ОК
        driver
                .findElement(By.className("rb-field-group"))
                .findElements(By.className("form-group"))
                .get(0)
                .findElement(By.className("el-picker-panel__footer"))
                .findElement(By.className("el-button--default"))
                .click();



    }
}
