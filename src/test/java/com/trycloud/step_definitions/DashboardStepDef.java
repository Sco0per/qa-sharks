package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DashboardStepDef {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    LoginPage login = new LoginPage();

    DashboardPage modules = new DashboardPage(); // Dashboard page object created for store web element and methods

    @Given("as a user i should be able to login with valid credentials")
    public void as_a_user_i_should_be_able_to_login_with_valid_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login.userName.sendKeys(ConfigurationReader.getProperty("username"));

        wait.until(ExpectedConditions.elementToBeClickable(login.submit));
        login.password.sendKeys(ConfigurationReader.getProperty("password"));
        login.submit.click();
    }

    @Then("user click customize button and sees the username on the dashboard  as {string}")
    public void userClickCustomizeButtonAndSeesTheUsernameOnTheDashboardAs(String expectedUsername) {

        modules.settings.click(); // user click the customize button

        String actualUsername = modules.verifyUsername.getText();


        Assert.assertEquals("Username verification is failed", expectedUsername, actualUsername);
    }

    @Then("user able to see below list on the dashboard modules")
    public void user_able_to_see_below_list_on_the_dashboard_modules(List<String> expectedModules) {

        List<String> actualModules = new ArrayList<>(); // created empty string for store modules

        Actions actions = new Actions(Driver.getDriver()); // modules are visible by hovering the mouse over the element

        actions.moveToElement(modules.hover).perform();

        wait.until(ExpectedConditions.visibilityOf(modules.hover));


        for (WebElement eachMenu : modules.menuOptions) {
            actualModules.add(eachMenu.getText());
        }


        Assert.assertEquals("Module verification is failed", expectedModules, actualModules);
    }


    @When("user click customize button")
    public void user_click_customize_button() {

        modules.customizeButton.click();
    }

    @And("user sees below widget list on the customize section")
    public void user_sees_below_widget_list_on_the_customize_section(List<String> expectedCustomize) {
        List<String> actualCustomize = new ArrayList<>();
        for (WebElement eachOption : modules.customizeOptions) {
            actualCustomize.add(eachOption.getText());

        }

        for (String each : actualCustomize) {
            Assert.assertTrue("Customize section verification is failed ", expectedCustomize.contains(each));
        }
    }

    @Then("user able to select any of the widgets")
    public void userAbleToSelectAnyOfTheWidgets() {
        for (WebElement eachCustomize : modules.customizeOptions) {


            if (eachCustomize.getText().equals("Status")) {
                continue;
            }
            BrowserUtils.sleep(3);
            eachCustomize.click();
        }

        modules.closeButton.click();

        for (WebElement eachOptions : modules.verifyCustomizeOptSelected) {

            System.out.println("Selected Options=  " + eachOptions.getText().substring(0, 15));
        }

        BrowserUtils.sleep(3);
    }


    @When("user click set status button")
    public void user_click_set_status_button() {
        modules.setStatusButton.click();
    }

    @When("user able to see below list on the set status")
    public void user_able_to_see_below_list_on_the_set_status(List<String> expectedMenu) {
        List<String> actualSetMenu = new ArrayList<>();

        for (WebElement each : modules.setStatusOptions) {
            actualSetMenu.add(each.getText());
        }
        System.out.println("expectedMenu = " + expectedMenu);

        System.out.println("actualMenu = " + actualSetMenu);

        modules.closeButton.click();

    }

    @Then("select any of the Status options in the below list")
    public void select_any_of_the_status_options_in_the_below_list(List<String> expectedOpt) {
        for (String eachOpt : expectedOpt) {  // using ready method which has been created in the dashboard page

            DashboardPage.verifySetStatus(eachOpt);
        }
    }


}
