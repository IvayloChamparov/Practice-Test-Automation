package map;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoggedInSuccessfullyPageMap extends BaseTest {

    public static String actualSuccessfullyLoggedInMessage() {

        WebElement actualSuccessfullyLoggedInMessage = driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/p[1]/strong"));
        String actualMessage = actualSuccessfullyLoggedInMessage.getText();
        return actualMessage;
    }
    public static void assertSuccessfullyLoggedInMessage(String expectedMessage) {

        Assert.assertEquals(actualSuccessfullyLoggedInMessage(), expectedMessage);
    }
    public static WebElement logOutButton() {

        WebElement logOutButton = driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div/div/div/a"));
        return logOutButton;
    }
    public static void assertLogOutButtonIsDisplayed() {

        Assert.assertTrue(logOutButton().isDisplayed(), "Logout button is not displayed");
    }
}