package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ComOrangehrmlive {


    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        ComOrangehrmlive obj1 = new ComOrangehrmlive();
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        System.out.println("1-URL opened.");
        System.out.println("2- Title of the page: " + driver.getTitle());
        System.out.println("3- Current URL: " + driver.getCurrentUrl());
        System.out.println("4- Page source: " + driver.getPageSource());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.className("orangehrm-login-forgot")).click();
        System.out.println("5- Forgot your password? link clicked.");
        System.out.println("Printing current URL: " + driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("Navigated back to the login page.");
        driver.navigate().refresh();
        System.out.println("Refreshed the page.");
        driver.findElement(By.name("username")).sendKeys("prime123@gmail.com");
        System.out.println("Email entered to email field.");
        driver.findElement(By.name("password")).sendKeys("prime123");
        driver.findElement(By.tagName("button")).click();
        System.out.println("user clicked on login button.");
        driver.quit();


    }
}
