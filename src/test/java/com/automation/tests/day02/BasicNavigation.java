package com.automation.tests.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        // to start selenium script we need:
        // setup webdriver (browser driver) and create webdriver object
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        // in Selenium everything starts from WebDriver interface
        // ChromeDriver extends RemoteDriver->>> implement WebDriver
        driver.get("http://google.com"); // to open a website

        Thread.sleep(4000); // for demo, wait 3 seconds
        // method that return page title
        //you can also see it as tab anme, in the browser
        String title = driver.getTitle(); // returns <title>Some title</title> test
        String expectedTitle ="Google";

        System.out.println("Title is " + title);
        if (expectedTitle.equals(title)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
         // must be at the end
        driver.close();// to close the browser
        // browser cants close itself


    }

}

