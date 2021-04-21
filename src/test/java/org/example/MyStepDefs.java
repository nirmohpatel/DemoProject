package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MyStepDefs
{
    HomePage homePage = new  HomePage();

    @Given("^I am on Morethan Home Page$")
    public void i_am_on_Morethan_Home_Page()
    {
        homePage.clickAcceptAllCookies();
        homePage.clickCoronavirusCustomerUpdate();
        homePage.toVerifyIAmOnMorethanHomePage();

    }

    @When("^I click on Home$")
    public void i_click_on_Home()
    {
        System.out.println("I click on Home");
    }
}
