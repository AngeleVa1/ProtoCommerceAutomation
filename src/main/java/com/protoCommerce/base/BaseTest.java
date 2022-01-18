package com.protoCommerce.base;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    DesiredCapabilities dc;

    @BeforeTest
    public void setUP() throws IOException {

        String browser = "chrome";
        String getUrl = "https://rahulshettyacademy.com/angularpractice/";
        String nodeUrl = "http://192.168.1.93:4444";

        dc = new DesiredCapabilities();
        dc.setPlatform(Platform.WINDOWS);
        dc.setBrowserName(browser);
        driver = new RemoteWebDriver(new URL(nodeUrl), dc);
        driver.get(getUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    @AfterTest
    public void afterTest() {
    //    driver.close();
    }

}

