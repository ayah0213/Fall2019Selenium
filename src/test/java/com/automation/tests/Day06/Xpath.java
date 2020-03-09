package com.automation.tests.Day06;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        BrowserUtils.wait(3);

        //value can be inside ' ' or " "
        // if you dont know the tag name , or want to ski tag name , use *
        // for example "//button[@onclick='button1()']"  means any tag name
        WebElement btn1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        btn1.click();

        WebElement result = driver.findElement(By.id("result"));
        System.out.println(result.getText());

        // click on button #2
        WebElement btn2 = driver.findElement(By.xpath("//button[@name='button2']"));


        BrowserUtils.wait(3);
        driver.quit();
    }
}
