package com.automation.tests.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {

        // to start selenium script we need:
        // setup webdriver (browser driver) and create webdriver object
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        // in Selenium everything starts from WebDriver interface
        driver.get("http://google.com"); // to open a website
    }

}

