package base;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;

    public static WebDriverWait wait10(){
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        return wait;
    }

    //Change the driver in initDriver to newChromeDriver(), newEdgeDriver(), newFirefoxDriver() or newDevice("Nexus 5") or ("iPhone 12 Pro")... to switch browsers
    @BeforeMethod
    public void setup() {
        driver = DriverFactory.newChromeDriver(true);
    }
    @AfterMethod(alwaysRun = true)
    public void closeDriver(){
        driver.quit();
    }
}