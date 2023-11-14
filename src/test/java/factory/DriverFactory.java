package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Map;

public class DriverFactory {
    public static WebDriver newChromeDriver(){
        return applyCommonSetup(new ChromeDriver());
    }

    public static WebDriver newEdgeDriver(){
        return applyCommonSetup(new EdgeDriver());
    }

    public static WebDriver newFirefoxDriver(){return applyCommonSetup(new FirefoxDriver());
    }

    public static WebDriver newDevice(String deviceName){

        Map<String, String> mobileEmulation = Map.of("deviceName", deviceName);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }

    private static WebDriver applyCommonSetup(WebDriver driver) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

}