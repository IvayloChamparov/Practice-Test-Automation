package tests.practiceTestAutomationTests;

import base.BaseTest;
import map.LoginPageMap;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {

    //Test suit 2: Negative LogIn tests
    private String expectedInvalidUserNameErrorMessage = "Your username is invalid!";
    private String expectedInvalidPasswordErrorMessage = "Your password is invalid!";

    //Test 2.1 - Verify error message for Incorrect Username is displayed
    @Test
    public void VerifyErrorMessageForInvalidUserNameIsDisplayed(){
        LoginPageMap.loginWithInvalidUserName("incorrectUser");
        LoginPageMap.asserActualInvalidUserNameErrorMessageIsDisplayed();
    }

    //Test 2.2 - Verify error message text is "Your username is invalid!"
    @Test
    public void VerifyErrorMessageForInvalidUserNameIsCorrect(){
        LoginPageMap.loginWithInvalidUserName("incorrectUser");
        LoginPageMap.asserActualInvalidUserNameErrorMessageIsCorrect(expectedInvalidUserNameErrorMessage);
    }

    //Test 2.3 - Verify error message for Incorrect Password is displayed
    @Test
    public void VerifyErrorMessageForInvalidPasswordIsDisplayed(){
        LoginPageMap.loginWithInvalidPassword("incorrectPassword");
        LoginPageMap.asserActualInvalidPasswordErrorMessageIsDisplayed();
    }

    //Test 2.4 - Verify error message text is "Your password is invalid!"
    @Test
    public void VerifyErrorMessageForInvalidPasswordIsCorrect(){
        LoginPageMap.loginWithInvalidPassword("incorrectPassword");
        LoginPageMap.asserActualInvalidPasswordErrorMessageIsCorrect(expectedInvalidPasswordErrorMessage);
    }
}