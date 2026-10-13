package com.berkantepli;

import java.io.File;
import java.net.URI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BrowserBaseTest {

    protected AndroidDriver driver;
    protected AppiumDriverLocalService service;

    @BeforeClass
    public void ConfigureAppium() throws Exception {
        service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");

        // ChromeDriver konumu
        options.setCapability(
                "appium:chromedriverExecutable",
                "/Users/berkantepli/Desktop/Appium_demo/chromedriver-mac-arm64/chromedriver");
        options.setCapability("browserName", "Chrome");

        driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

    }

    public Double getFormattedAmount(String amount) {
        Double price = Double.parseDouble(amount.substring(1));
        return price;
    }

    @AfterClass
    public void tearDown() {
        // Code to stop the Appium server and clean up resources
        driver.quit();
        service.stop();
    }
}
