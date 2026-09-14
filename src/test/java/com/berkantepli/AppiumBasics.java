package com.berkantepli;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class AppiumBasics extends BaseTest {

    @Test
    public void AppiumTest() throws Exception {
        // code to start server
        // Android Driver, iOS Driver
        // Appium code -> Appium Server -> Mobile
        System.out.println("Application started");
        // Actual automation
        // Xpath, Accessibility ID, ID, ClassName, AndroidUIAutomator

        //tagName[@attribute='value'] -> //tagName
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");
        driver.findElement(By.id("android:id/edit")).sendKeys("Berk Wifi");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();

        //set wifi name




    }
}
