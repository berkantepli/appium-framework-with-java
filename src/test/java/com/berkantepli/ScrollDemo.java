package com.berkantepli;

import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest {
    
    @Test
    public void ScrollDemoTest() throws Exception {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        
        //Method 1 -> when we know the exact text of the element we want to scroll to
        //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"WebView\"));"));
        
        //Method 2 -> no prior knowledge of the text of the element we want to scroll to
        scrollToEndAction();



        Thread.sleep(2000);
    }
    
}
