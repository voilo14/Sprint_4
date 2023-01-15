package scooterTest;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import scooter.HomePage;
import scooter.OrderForm;
import scooter.RentalForm;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CheckOrderTest extends Base {

    @Test
    public void checkOrderChromeButtonHeader() {
        WebDriver driver = getChromeDriver();
        HomePage homePage = new HomePage(driver);
        OrderForm orderForm = new OrderForm(driver);
        RentalForm rentalForm = new RentalForm(driver);

        homePage.openPage();
        homePage.clickButtonOrderHeader();

        orderForm.inputName("Петя");
        orderForm.inputLastName("Головин");
        orderForm.inputAddress("Дутово");
        orderForm.clickMetroStationInputField("//div[text()='Сокольники']");
        orderForm.inputPhone("89992221133");
        orderForm.clickButtonNext();

        rentalForm.clickDateSelection();
        rentalForm.clickRentalPeriod();
        rentalForm.clickCheckBox();
        rentalForm.clickButtonOrder();

        rentalForm.clickButtonYes();

        rentalForm.isDisplayedInfoWinOnRequest();
    }
    @Test
    public void checkOrderFirefoxButtonHeader() {
        WebDriver driver = getFirefoxDriver();
        HomePage homePage = new HomePage(driver);
        OrderForm orderForm = new OrderForm(driver);
        RentalForm rentalForm = new RentalForm(driver);

        homePage.openPage();
        homePage.clickButtonOrderHeader();

        orderForm.inputName("Петя");
        orderForm.inputLastName("Головин");
        orderForm.inputAddress("Дутово");
        orderForm.clickMetroStationInputField("//div[text()='Сокольники']");
        orderForm.inputPhone("89992221133");
        orderForm.clickButtonNext();

        rentalForm.clickDateSelection();
        rentalForm.clickRentalPeriod();
        rentalForm.clickCheckBox();
        rentalForm.clickButtonOrder();

        rentalForm.clickButtonYes();

        rentalForm.isDisplayedInfoWinOnRequest();

    }@Test
    public void checkOrderChromeButtonDown() {
        WebDriver driver = getChromeDriver();
        HomePage homePage = new HomePage(driver);
        OrderForm orderForm = new OrderForm(driver);
        RentalForm rentalForm = new RentalForm(driver);

        homePage.openPage();
        homePage.clickButtonOrderDown();

        orderForm.inputName("Вася");
        orderForm.inputLastName("Пупкин");
        orderForm.inputAddress("Пупово");
        orderForm.clickMetroStationInputField("//div[text()='Черкизовская']");
        orderForm.inputPhone("89997774455");
        orderForm.clickButtonNext();

        rentalForm.clickDateSelection();
        rentalForm.clickRentalPeriod();
        rentalForm.clickCheckBox();
        rentalForm.clickButtonOrder();

        rentalForm.clickButtonYes();

        rentalForm.isDisplayedInfoWinOnRequest();
    }
    @Test
    public void checkOrderFirefoxButtonDown() {
        WebDriver driver = getFirefoxDriver();
        HomePage homePage = new HomePage(driver);
        OrderForm orderForm = new OrderForm(driver);
        RentalForm rentalForm = new RentalForm(driver);

        homePage.openPage();
        homePage.clickButtonOrderDown();

        orderForm.inputName("Вася");
        orderForm.inputLastName("Пупкин");
        orderForm.inputAddress("Пупово");
        orderForm.clickMetroStationInputField("//div[text()='Черкизовская']");
        orderForm.inputPhone("89997774455");
        orderForm.clickButtonNext();

        rentalForm.clickDateSelection();
        rentalForm.clickRentalPeriod();
        rentalForm.clickCheckBox();
        rentalForm.clickButtonOrder();

        rentalForm.clickButtonYes();

        rentalForm.isDisplayedInfoWinOnRequest();
    }
}
