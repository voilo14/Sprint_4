package scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderForm {
    private WebDriver driver;

    private By nameInputField = By.xpath("//input[@placeholder='* Имя']");
    private By lastNameInputField = By.xpath("//input[@placeholder='* Фамилия']");
    private By addressInputField = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroStationInputField = By.className("select-search");
    private By phoneInputField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");

    private By buttonNext = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public OrderForm(WebDriver driver) {
        this.driver = driver;
    }

    public void inputName(String name) {
        driver.findElement(nameInputField).sendKeys(name);
    }
    public void inputLastName(String lastName) {
        driver.findElement(lastNameInputField).sendKeys(lastName);
    }
    public void inputAddress(String address) {
        driver.findElement(addressInputField).sendKeys(address);
    }
    public void clickMetroStationInputField(String station) {
        driver.findElement(metroStationInputField).click();
        driver.findElement(By.xpath(station)).click();
    }
    public void inputPhone(String phone) {
        driver.findElement(phoneInputField).sendKeys(phone);
    }
    public void clickButtonNext() {
        driver.findElement(buttonNext).click();
    }
}
