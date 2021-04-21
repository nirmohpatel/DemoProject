package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils
{
    public static LoadProperty loadProperty = new LoadProperty();
    public static final String BrowserName = loadProperty.getProperty("BrowserName");

    public void setBrowser() {
        if (BrowserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src\\test\\resources\\BrowserDrivers\\chromedriver.exe");
            driver=new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver","BrowserDriver\\");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(loadProperty.getProperty("MorethanUrl"));

    }
    public void closeBrowser() {
        driver.close();}

}