package com.automation.tests.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(3000);


        // By.name("q") -->> name = "q"
        WebElement search = driver.findElement(By.name("q"));

        // once we found an element how to enter the text
        // to enter text,use search.sendKeys
        // how to press Enter after entering the text?
        // use Key.Enter
        // to simulate or perform keyboard click
        search.sendKeys("Java", Keys.ENTER);

        Thread.sleep(3000);

        // to see if <a> element, it calls link
        WebElement news = driver.findElement(By.linkText("News"));
        news.click();// to click on the element

        Thread.sleep(3000);

        driver.quit();
    }
}
