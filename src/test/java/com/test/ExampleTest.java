package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class ExampleTest {

    @Test
 void loginTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // 1. Open page
        driver.get("file:///D:\\codes\\static\\index.html");

        // 2. Find elements
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement button = driver.findElement(By.id("loginBtn"));

        // 3. Perform actions
        username.sendKeys("admin");
        password.sendKeys("1234");
        button.click();

        Thread.sleep(2000); // wait for result

        // 4. Validate result
        WebElement result = driver.findElement(By.id("result"));
        String text = result.getText();

        System.out.println("Result: " + text);

        // 5. Assertion (important)
        assert text.equals("Login Success");

        driver.quit();
    }
}