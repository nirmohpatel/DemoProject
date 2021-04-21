package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends Utils
{
    Utils utils;

    private String expectedHomePageText= "Home insurance";
    private String allCookies = "onetrust-accept-btn-handler";

    private By _welComeAdminMassage = By.linkText("Home insurance");
    private By _allCookies = By.id("onetrust-accept-btn-handler");
    private By _CoronaVirusMessage = By.xpath("//button[@class=\"sc-1fqak0r-3 jTIATE\"]");


    public void clickAcceptAllCookies()
    {
        utils = new Utils();
        utils.waitForElementToBeClickableId(allCookies,20);
        clickOnElement(_allCookies);
    }

    public void clickCoronavirusCustomerUpdate()
    {
        clickOnElement(_CoronaVirusMessage);
    }

    public void toVerifyIAmOnMorethanHomePage()
    {
        Assert.assertEquals(getTextFromElement(_welComeAdminMassage),expectedHomePageText);
    }
}
