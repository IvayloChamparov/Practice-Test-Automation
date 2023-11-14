package map;

import base.BaseTest;
import factory.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class LoginPageMap extends BaseTest {
    public static WebElement userName() {

        WebElement userName = driver.findElement(By.id("username"));
        return userName;
    }
    public static WebElement passwordField() {

        WebElement passwordField = driver.findElement(By.id("password"));
        return passwordField;
    }
    public static WebElement submitButton() {

        WebElement submitButton = driver.findElement(By.id("submit"));
        return submitButton;
    }
    public static WebElement actualInvalidUserNameErrorMessageElement() {
        WebElement actualInvalidUserNameErrorMessageElement = null;
        try{
            actualInvalidUserNameErrorMessageElement = wait10().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/section/section/div[2]")));
        } catch (TimeoutException e){
            System.out.println("TimeoutException: Invalid Username Error Message Element not found within the specified timeout.");
        }
        return actualInvalidUserNameErrorMessageElement;
    }
    public static void loginWithInvalidUserName(String userName) {

        driver.get(ConfigReader.getProperty("PracticeTestAutomationUrl"));
        userName().sendKeys(userName);
        passwordField().sendKeys(ConfigReader.getProperty("PasswordStudent"));
        submitButton().click();

    }
    public static void asserActualInvalidUserNameErrorMessageIsDisplayed() {

        Assert.assertTrue(actualInvalidUserNameErrorMessageElement().isDisplayed(), "Invalid Username Error Message is not displayed");
    }
    public static void asserActualInvalidUserNameErrorMessageIsCorrect(String expectedMessage) {

        String actualMessage = actualInvalidUserNameErrorMessageElement().getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }


    public static WebElement actualInvalidPasswordErrorMessageElement() {
        WebElement actualInvalidPasswordErrorMessageElement = null;
        try {
            actualInvalidPasswordErrorMessageElement = wait10().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/section/section/div[2]")));
        } catch (TimeoutException e){
            System.out.println("TimeoutException: Invalid Password Error Message Element not found within the specified timeout.");
        }
        return actualInvalidPasswordErrorMessageElement;
    }

    public static void loginWithInvalidPassword(String password) {

        driver.get(ConfigReader.getProperty("PracticeTestAutomationUrl"));
        userName().sendKeys(ConfigReader.getProperty("UsernameStudent"));
        passwordField().sendKeys(password);
        submitButton().click();

    }

    public static void asserActualInvalidPasswordErrorMessageIsDisplayed() {

        Assert.assertTrue(actualInvalidPasswordErrorMessageElement().isDisplayed(), "Invalid Password Error Message is not displayed");
    }
    public static void asserActualInvalidPasswordErrorMessageIsCorrect(String expectedMessage) {

        String actualMessage = actualInvalidPasswordErrorMessageElement().getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    public static void loginPracticeTestAutomationPageAsStudent() {

        driver.get(ConfigReader.getProperty("PracticeTestAutomationUrl"));
        userName().sendKeys(ConfigReader.getProperty("UsernameStudent"));
        passwordField().sendKeys(ConfigReader.getProperty("PasswordStudent"));
        submitButton().click();

    }
}
