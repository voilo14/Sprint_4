package scooterTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import scooter.HomePage;


public class CheckTextPopupListTest extends Base {


    @Test
    public void checkOpenTextChrome(){
        WebDriver driver = getChromeDriver();
        HomePage homePage = new HomePage(driver);

        homePage.openPage();
        homePage.scrollPageToDownload().clickPopupListOne();
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", homePage.textPopupListOneDisplayed());

        homePage.scrollPageToDownload().clickPopupListSeven();
        Assert.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", homePage.textPopupListSevenDisplayed());
    }

    @Test
    public void checkOpenTextFirefox(){
        WebDriver driver = getFirefoxDriver();
        HomePage homePage = new HomePage(driver);

        homePage.openPage();
        homePage.scrollPageToDownload().clickPopupListOne();
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", homePage.textPopupListOneDisplayed());

        homePage.scrollPageToDownload().clickPopupListSeven();
        Assert.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", homePage.textPopupListSevenDisplayed());
    }
}
