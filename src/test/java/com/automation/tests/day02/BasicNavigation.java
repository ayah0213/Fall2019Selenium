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
        driver.manage().window().maximize(); // to maximize the screen of browser

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
// go to another website within the same window
        driver.navigate().to("http://amazon.com");

        Thread.sleep(4000); // for demo, wait 3 seconds

        if (driver.getTitle().toLowerCase().contains("amazon")){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }

        //come back to google
        driver.navigate().back();

        //checking if page title is equals to GOogle
        // .getTitle()- returns page title
        verifyEquals(driver.getTitle(), "Google");

        // move forward in the browser history
        // again should go back to amazon
        driver.navigate().forward();
        System.out.println("Title: "+ driver.getTitle());
        // driver.getTitle() returns page title of the page that is curently opened


        System.out.println("URL: "+ driver.getCurrentUrl());
        // driver.getCurrentURL = get the URL

        Thread.sleep(4000); // for demo, wait 3 seconds
         // must be at the end



        driver.navigate().refresh();// to reload the web page

        driver.close();// to close the browser
        // browser cants close itself


    }

    // checks if 2 strings are the same . If yes prints TEST PASSED, otherwise TESt FAILED
    public static void verifyEquals(String arg1, String args2){
        if(arg1.equals(args2)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
    }
}

