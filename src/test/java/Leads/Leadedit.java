package Leads;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class Leadedit {

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

        // Нажимаем на Разобрать Лид
        driver
                .findElementByClassName("main-row")
                .findElement(By.className("rb-actions"))
                .findElement(By.className("mdi-check-circle"))
                .click();


        Thread.sleep(3000);

        // Нажимаем на инпут Категорию Лида
        driver
                .findElementByClassName("lead-form-section-category-item")
                .findElement(By.className("rb-bordered"))
                .findElement(By.className("btn-light"))
                .findElement(By.className("rb-text"))
                .click();

        // Выбираем категорию
        driver
                .findElementByClassName("lead-form-section-category-item")
                .findElement(By.className("rb-bordered"))
                .findElements(By.className("dropdown-item"))
                .get(1)
                .click();


        // Нажимаем на инпут тип сделки
        driver
                .findElementByClassName("deal-form-section-deal-type")
                .findElement(By.className("btn-light"))
                .click();

        Thread.sleep(3000);

        // Выбираем тип сделки Продавец
        driver
                .findElementByClassName("deal-form-section-deal-type")
                .findElement(By.className("dropdown-menu"))
                .findElements(By.className("dropdown-item"))
                .get(5)
                .click();

        Thread.sleep(3000);

        // Нажимаем на кнопку Создать сделку
        driver
                .findElementByClassName("btn-success")
                .click();

        // ПОЛЕ СОЗДАНИЯ СДЕЛКИ

        Thread.sleep(3000);

        // Нажимаем на поле Агент и вводим имя агента
        driver
                .findElementByClassName("lead-deal-form")
                .findElements(By.className("form-group"))
                .get(0)
                .findElement(By.className("rb-typeahead-input"))
                .findElement(By.className("multiselect__tags"))
                .findElement(By.cssSelector("span"))
                .click();

        Thread.sleep(1000);

        driver
                .findElementByClassName("lead-deal-form")
                .findElements(By.className("form-group"))
                .get(0)
                .findElement(By.className("rb-typeahead-input"))
                .findElement(By.className("multiselect__tags"))
                .findElement(By.cssSelector("input"))
                .sendKeys("Azat Ramazanov");
        Thread.sleep(1000);

        driver
                .findElementByClassName("lead-deal-form")
                .findElements(By.className("form-group"))
                .get(0)
                .findElement(By.className("rb-typeahead-input"))
                .findElement(By.className("multiselect__tags"))
                .findElement(By.cssSelector("input"))
                .sendKeys(Keys.ENTER);



        // Заполняем поле Цены
        driver
                .findElement(By.className("rb-sf-price-item"))
                .findElement(By.className("form-control"))
                .sendKeys("2500000");

        Thread.sleep(3000);

        // Заполняем ЖК
        driver
                .findElement(By.className("sf-complex-item"))
                .findElement(By.className("multiselect__tags"))
                .findElement(By.cssSelector("span"))
                .click();

        Thread.sleep(1000);

        driver
                .findElement(By.className("sf-complex-item"))
                .findElement(By.className("multiselect__tags"))
                .findElement(By.cssSelector("input"))
                .sendKeys("Vivat");

        Thread.sleep(1000);

        driver
                .findElement(By.className("sf-complex-item"))
                .findElement(By.className("multiselect__tags"))
                .findElement(By.cssSelector("input"))
                .sendKeys(Keys.ENTER);

        // Заполняем номер квартиры

        driver
                .findElement(By.className("sf-flat-num-item"))
                .findElement(By.cssSelector("input"))
                .sendKeys("808");

        // Переходим в раздел ДОПОЛНИТЕЛЬНАЯ ИНФОРМАЦИЯ

        driver
                .findElement(By.className("rb-supply-form-secondary-section"))
                .findElement(By.className("mdi-plus-box"))
                .click();

        // Нажимаем на санузел

        driver
                .findElement(By.className("sf-toilet-type-item"))
                .findElement(By.className("dropdown-toggle"))
                .click();

        Thread.sleep(1000);

        // Нажимаем на варианты в санузле

        driver
                .findElement(By.className("sf-toilet-type-item"))
                .findElement(By.className("dropdown-menu"))
                .findElements(By.className("dropdown-item"))
                .get(0)
                .click();


        // Нажимаем на Мебель
        driver
                .findElement(By.className("sf-furniture-type-item"))
                .findElement(By.className("dropdown-toggle"))
                .click();


        Thread.sleep(1000);

        // Выбираем Полностью меблирована
        driver
                .findElement(By.className("sf-furniture-type-item"))
                .findElement(By.className("dropdown-item"))
                .click();


        // Нажимаем на балкон
        driver
                .findElement(By.className("sf-balcony-type-item"))
                .findElement(By.className("dropdown-toggle"))
                .click();


        // Выбираем застеклен
        driver
                .findElement(By.className("sf-balcony-type-item"))
                .findElements(By.className("dropdown-item"))
                .get(1)
                .click();


        // Нажимаем на класс жилья
        driver
                .findElement(By.className("sf-property-class-item"))
                .findElement(By.className("dropdown-toggle"))
                .click();

        Thread.sleep(1000);

        // Выбираем класс жилья Комфорт
        driver
                .findElement(By.className("sf-property-class-item"))
                .findElements(By.className("dropdown-item"))
                .get(3)
                .click();


        // Нажимаем на В Залоге
        driver
                .findElement(By.className("sf-bail-item"))
                .findElement(By.className("rb-false-button"))
                .click();

        // Нажимаем на Создать

        driver
                .findElement(By.className("btn-sm"))
                .click();
















    }

}
