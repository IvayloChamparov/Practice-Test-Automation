package tests.practiceTestAutomationTests;

import base.BaseTest;
import factory.CommonAssertions;
import map.LoggedInSuccessfullyPageMap;
import map.LoginPageMap;
import org.testng.annotations.Test;

public class LoggedInSuccessfullyPageTests extends BaseTest {

    //Test suit 1: Positive LogIn tests
    private String expectedUrlAfterLogin = "https://practicetestautomation.com/logged-in-successfully/";
    private String expectedSuccessfullyLoggedInMessage = "Congratulations student. You successfully logged in!";

    //Test 1.1 - Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    @Test
    public void VerifyLoggedInSuccessfullyPageUrl(){
        LoginPageMap.loginPracticeTestAutomationPageAsStudent();
        CommonAssertions.assertCurrentUrl(expectedUrlAfterLogin);
    }

    //Test 1.2 - Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    @Test
    public void VerifyLoggedInSuccessfullyMessage(){
        LoginPageMap.loginPracticeTestAutomationPageAsStudent();
        LoggedInSuccessfullyPageMap.assertSuccessfullyLoggedInMessage(expectedSuccessfullyLoggedInMessage);
    }

    //Test 1.3 - Verify button Log out is displayed on the new page
    @Test
    public void VerifyLogOutButtonIsDisplayed(){
        LoginPageMap.loginPracticeTestAutomationPageAsStudent();
        LoggedInSuccessfullyPageMap.assertLogOutButtonIsDisplayed();
    }

}