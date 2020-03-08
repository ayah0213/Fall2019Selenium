package com.automation.tests.day05;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RegistrationForm {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/registration_form");
        BrowserUtils.wait(3);

        // enter first name
        driver.findElement(By.name("firstname")).sendKeys("Ayjeren");
        driver.findElement(By.name("lastnaem")).sendKeys("Nurjanova");
        driver.findElement(By.name("username")).sendKeys("ayahnoor");
        driver.findElement(By.name("email")).sendKeys("ayanoor@yahik.com");
        driver.findElement(By.name("password")).sendKeys("strongpassword");
        driver.findElement(By.name("phone")).sendKeys("212-232-2323");

        List<WebElement> genders = driver.findElements(By.name("gender"));
        // select gender
        genders.get(1).click();// select male, for ex.

        driver.findElement(By.name("birthday")).sendKeys("01/02/95");
        driver.findElement(By.name("inlineCheckbox2")).click(); // select JAva

        BrowserUtils.wait(4);

        driver.findElement(By.id("wooden_spoon")).click(); // click on submitt button
        BrowserUtils.wait(2);

        driver.quit();
    }
}
