package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage
{
    WebDriverWait wait;

    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }


    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }


    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }


    public void waitForElementToBeClickablePd (String id){
        wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));

    }
    public void waitForElementToBeClickableId (String Id, int timing){
        wait = new WebDriverWait(driver,timing);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(Id)));

    }

}
