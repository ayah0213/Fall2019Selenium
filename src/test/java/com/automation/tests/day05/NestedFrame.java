package com.automation.tests.day05;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/nested_frames");
        BrowserUtils.wait(3);
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        WebElement content = driver.findElement(By.id("content")); // content inside a child frame
        System.out.println(content.getText());

        driver.switchTo().parentFrame();// go to the top frame
        driver.switchTo().frame("frame-right"); // switch to the right frame

        WebElement body = driver.findElement(By.tagName("body"));
        System.out.println(body.getText());

        driver.quit();

    }
}
