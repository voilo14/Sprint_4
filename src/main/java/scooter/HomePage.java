package scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;

    // первая строка списка
    private By popupListOne = By.id("accordion__heading-0");
    // седьмая строка списка
    private By popupListSeven = By.id("accordion__heading-7");
    // выпадающий текст первой строки
    private By textPopupListOne = By.id("accordion__panel-0");
    // выпадающий текст седьмой строки
    private By textPopupListSeven = By.id("accordion__panel-7");


    // кнопка "заказать" в шапке страницы
    private By buttonOrderHeader = By.xpath("//button[@class='Button_Button__ra12g']");
    // кнопка "заказать" внизу страницы
    private By buttonOrderDown = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    // метод нажатия по первой строчке
    public void clickPopupListOne() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement button = driver.findElement(popupListOne);
        wait.until(ExpectedConditions.visibilityOf(button));
        button.click();

    }

    // метод нажатия по седьмой строчке
    public void clickPopupListSeven() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement button = driver.findElement(popupListSeven);
        wait.until(ExpectedConditions.visibilityOf(button));
        button.click();
    }

    // метод проверки отображения текста первой строки
    public String textPopupListOneDisplayed() {
        return driver.findElement(textPopupListOne).getText();
    }

    // метод проверки отображения текста седьмой строки
    public String textPopupListSevenDisplayed() {
        return driver.findElement(textPopupListSeven).getText();
    }

    public HomePage scrollPageToDownload() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        return this;
    }

    public void clickButtonOrderHeader() {
        driver.findElement(buttonOrderHeader).click();
    }
    public void clickButtonOrderDown() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement button = driver.findElement(buttonOrderDown);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", button);
        button.click();
    }

    public void openPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
}
