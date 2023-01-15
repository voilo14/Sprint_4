package scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentalForm {
    private WebDriver driver;

    private By dateSelection = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private By rentalPeriod = By.className("Dropdown-control");
    private By checkBoxBlack = By.xpath("//label[@for='black']");
    private By buttonOrder = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    private By buttonYes = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    private By infoWinOnRequest = By.xpath("//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");
    public RentalForm(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDateSelection() {
        driver.findElement(dateSelection).sendKeys("30.01.2023");
        driver.findElement(By.xpath("//div[text()='30']")).click();

    }
    public void clickRentalPeriod() {
        driver.findElement(rentalPeriod).click();
        driver.findElement(By.xpath("//div[text()='сутки']")).click();
    }
    public void clickCheckBox() {
        driver.findElement(checkBoxBlack).click();
    }
    public void clickButtonOrder() {
        driver.findElement(buttonOrder).click();
    }
    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }
    public void isDisplayedInfoWinOnRequest() {
        driver.findElement(infoWinOnRequest).isDisplayed();
    }
}
