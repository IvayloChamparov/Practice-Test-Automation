package factory;

import base.BaseTest;

public class CommonMethods extends BaseTest {
    public static void waitUntilURLChanges(String expectedURL) {

        long startTime = System.currentTimeMillis();
        long timeout = 5000; // Maximum wait time in milliseconds

        while (System.currentTimeMillis() - startTime < timeout) {
            if (driver.getCurrentUrl().equals(expectedURL)) {
                return;
            }
        }

    }
}