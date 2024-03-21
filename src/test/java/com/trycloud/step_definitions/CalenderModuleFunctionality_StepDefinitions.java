package com.trycloud.step_definitions;

import com.google.common.base.Verify;
import com.trycloud.pages.Calender_Module_Page;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalenderModuleFunctionality_StepDefinitions {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    LoginPage loginPage = new LoginPage();
    Calender_Module_Page Calender_module_page = new Calender_Module_Page();

    @Given("User is on Main page")
    public void user_is_on_web_table_app_login_page() {
        Driver.getDriver().get("http://qa2.trycloud.net/index.php/login");
        loginPage.login("User1", "Userpass123");
    }


    @When("User clicks the Calender button")
    public void userClicksTheCalenderButton() {

        Calender_Module_Page.CalendarButton.click();


    }

    @And("User clicks the view menu")
    public void userClicksTheViewMenu() {
        Calender_Module_Page.ViewMenu.click();
    }


    @And("User selects daily view")
    public void userSelectsDailyView() {
        Calender_Module_Page.DayButton.click();
    }




    @Then("User click Calender selections button")
    public void userClickCalenderSelectionsButton() {
        Calender_Module_Page.CalendarButton.click();
    }





    @When("User clicks New Event  button")
    public void userClicksNewEventButton() {
        Calender_Module_Page.newEventButton.click();
    }

    @And("User enters Event title")
    public void userEntersEventTitle() {
        BrowserUtils.waitFor(1);
        Calender_Module_Page.eventTitle.click();
        BrowserUtils.waitFor(1);
        Calender_Module_Page.eventTitle.sendKeys("Daniel get's a SDET job!!!");
    }


    @And("User enters Ending date")
    public void userEntersEndingDate() {
        Calender_Module_Page.endDate.clear();
        BrowserUtils.waitFor(1);
        Calender_Module_Page.endDate.sendKeys("17/20/2024");
    }




    @And("User clicks Save button")
    public void userClicksSaveButton() {
        Calender_Module_Page.saveButton.click();
    }

    @Then("user  see's a new event saved under the Calender module")
   public void userSeeSANewEventSavedUnderTheCalenderModule() {
    }

    @And("User enters Starting date")
    public void userEntersStaringDate() {
        Calender_Module_Page.startDate.clear();
        BrowserUtils.waitFor(1);
        Calender_Module_Page.startDate.sendKeys("17/20/2024");
    }

    @Then("User see's {string} in the title")
    public void userSeesInTheTitle(String expectedTitle) {
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }


    @And("User selects monthly view")
    public void userSelectsMonthlyView() {
        Calender_Module_Page.ViewMenu.click();
        Calender_Module_Page.MonthButton.click();
    }


    @Then("User see's {string} in title")
    public void userSeeSInTitle(String expectedTitle) {
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    @Then("User  should see's {string}  in title")
    public void userShouldSeeSInTitle(String expectedTitle) {
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @And("User selects Week view")
    public void userSelectsWeekView() {

        Calender_Module_Page.ViewMenu.click();
        BrowserUtils.waitFor(5);
        Calender_Module_Page.WeekButton.click();
    }

    @Then("user should see a new event saved under the Calender module")
    public void userShouldSeeANewEventSavedUnderTheCalenderModule() {
    }
}
