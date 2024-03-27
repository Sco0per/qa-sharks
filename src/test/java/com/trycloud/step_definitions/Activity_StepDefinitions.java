package com.trycloud.step_definitions;

import com.trycloud.pages.ActivityPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_StepDefinitions {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    ActivityPage activityPage = new ActivityPage();
    LoginPage loginPage = new LoginPage();

    @Given("user is on Activity module page")
    public void user_is_on_activity_module_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        activityPage.clickOnAllActivities();


    }

    @Then("user clicks on All activities")
    public void user_clicks_on_all_activities() {
        activityPage.clickOnAllActivities();

    }


    @Then("user can see all listed items displayed")
    public void user_can_see_all_listed_items_displayed() {
        Assert.assertTrue(activityPage.areAllActivitiesDisplayed());
    }

    @Given("user stays on Activity page")
    public void userStaysOnActivityPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        activityPage.clickOnAllActivities();
    }

    @Then("can see all listed activity items displayed on the page")
    public void can_see_all_listed_activity_items_displayed_on_the_page() {
        Assert.assertTrue(activityPage.areAllActivitiesDisplayed());

    }

    @Then("user can see extract timestamps associated with each activity item")
    public void user_can_see_extract_timestamps_associated_with_each_activity_item() {
        activityPage.extractTimeStamps();

    }


    @Given("user is located on Activity page")
    public void userIsLocatedOnActivityPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        activityPage.clickOnAllActivities();
    }

    /* @Then("user scrolls to the end of all activities")
     public void user_scrolls_to_the_end_of_all_activities() {
         WebElement noMoreEventsLink = (WebElement) By.xpath("//*[@id=\"no_more_activities\"]");

         JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver());
         BrowserUtils.sleep(3);
         js.executeScript("arguments[0].scrollIntoView(true)", noMoreEventsLink);
         BrowserUtils.sleep(3);

     */
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Then("user scrolls to the end of all activities")
    public void user_scrolls_to_the_end_of_all_activities() {
        Driver.getDriver().findElement(By.xpath("//span[@class='has-tooltip']")).click();
        while (!(Boolean) js.executeScript("return document.documentElement.scrollHeight <= document.documentElement.scrollTop + window.innerHeight")) {
            js.executeScript("window.scrollTo(0, document.documentElement.scrollHeight)");
            // Ждем некоторое время после прокрутки, чтобы контент успел загрузиться
            try {
                Thread.sleep(1000); // Пауза в 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /* Assert.assertTrue("No more events to load message is not displayed at the end of the page", activityPage.noMoreEventsToLoad.isDisplayed());

             */


        }
    }

    @And("user sees no more events load message")
    public void userSeesNoMoreEventsLoadMessage() {
        Assert.assertTrue("No more events to load message is not displayed at the end of the page", activityPage.noMoreEventsToLoad.isDisplayed());
    }


}


