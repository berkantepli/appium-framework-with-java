package com.berkantepli;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class SwipeDemo extends BaseTest {

    @Test
    public void SwipeDemoTest() throws Exception {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='1. Photos']")).click();
        WebElement firstImage = driver.findElement(By.xpath("//android.widget.ImageView[1]"));
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),
                "true");
        swipeAction(firstImage, "left");
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),
                "false");
    }
    // MAIN BRANCH
    // FEATURE BRANCH
    // feature login branch
    // stash demo
    // Pull Request demo
    // Main Commit
    // Rebase Demo 1
    // Rebase Demo 2
    // Interactive 1
    // Interactive 2
    // Interactive 3
}
