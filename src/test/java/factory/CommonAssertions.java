package factory;

import base.BaseTest;
import org.testng.Assert;

public class CommonAssertions extends BaseTest {
    public static void assertCurrentUrl(String expectedUrl) {

        // Wait for the URL to change and check it
        CommonMethods.waitUntilURLChanges(expectedUrl);
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }
}