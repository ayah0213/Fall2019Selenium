package com.automation.tests.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class JumpToAnotherWindow {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(5000);

        // every window has some id, this id called '"Window handle"
        // based on window handle, we can switch in between windows
        String windowHandle = driver.getWindowHandle();

        System.out.println(windowHandle);

        // getWindowHandles(); == returns id's of all currently opened window
        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println(windowHandles);

        // since we have all windows
        // and we know id of original window
        // we can say switch to something that is not equals to old window id
        for (String windowId:windowHandles) {
            if(!windowId.equals((windowHandle))){
                driver.switchTo().window(windowId);
            }

        }
        System.out.println("After switch :"+driver.getCurrentUrl());

        driver.close();
    }

    /**
     *
     * This method helps to switch in between windows based on page title
     * @param pageTitle
     * @param driver
     */
    public static void switchToWindowBasedOnTitle(String pageTitle, WebDriver driver){
        Set<String> windows = driver.getWindowHandles();
        for (String window: windows){
            driver.switchTo().window(window);
            if (driver.getTitle().equals(pageTitle)){
                break;
            }
        }
    }
}
