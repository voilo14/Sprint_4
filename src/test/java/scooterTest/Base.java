package scooterTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public abstract class Base {
    private WebDriver chromeDriver;
    private WebDriver firefoxDriver;

    public WebDriver getChromeDriver() {

        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return chromeDriver;
    }
    public WebDriver getFirefoxDriver() {

        System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\bin\\geckodriver.exe");
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return firefoxDriver;
    }

    @After
    public void quit() {
        // Закрыть браузер
        if(chromeDriver != null) {
            chromeDriver.quit();
        }
        if(firefoxDriver != null) {
            firefoxDriver.quit();
        }
    }

}
