package com.berkantepli;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscellaneousAppiumActions extends BaseTest {

    @Test
    public void MiscellaneousAppiumActionsTest() throws Exception {
        // App Package & App Activity

        // Activity activity = new Activity("io.appium.android.apis",
        // "io.appium.android.apis.preference.PreferenceDependencies");
        // driver.startActivity(activity);
        ((JavascriptExecutor) driver).executeScript(
                "mobile: startActivity",
                ImmutableMap.of(
                        "intent",
                        "io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));
        // driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        // driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3.Preference
        // dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        DeviceRotation landscape = new DeviceRotation(0, 0, 90);
        driver.rotate(landscape);
        Thread.sleep(1500);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");
        // copy paste
        // copy to clipboard- paste it clipboard
        driver.setClipboardText("Berk Wifi");
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));

    }
}