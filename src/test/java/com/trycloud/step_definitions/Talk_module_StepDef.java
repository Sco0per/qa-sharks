package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.Talk_ModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Talk_module_StepDef {

    Talk_ModulePage talkModulePage = new Talk_ModulePage();

    //AC-1
    @When("user navigates and clicks on Talk Module icon")
    public void user_navigates_and_clicks_on_talk_module_icon() {
    //BrowserUtils.waitFor(5);
     talkModulePage.talkButton.click();
    }

    @And("user clicks the plus button and inters a {string}")
    public void userClicksThePlusButtonAndIntersA(String name) {
        talkModulePage.plusButton.click();
        talkModulePage.conversNameInput.sendKeys(name);
    }

    @Then("user checks a checkbox to allow guests to join")
    public void user_checks_a_checkbox_to_allow_guests_to_join() {
        talkModulePage.allowCheckbox.click();
    }

    @Then("user clicks to the Add participants button")
    public void user_clicks_to_the_add_participants_button() {
        talkModulePage.addParticButton.click();
    }

    @Then("user selects a participant from the list and clicks into Create conversation button")
    public void user_selects_a_participant_from_the_list_and_clicks_into_create_conversation_button() {
    talkModulePage.employeeSearchBtn.sendKeys("Employee10");
    talkModulePage.createConvercButton.click();
    }

    @Then("user clicks into Close button")
    public void user_clicks_into_close_button() {
        talkModulePage.closeButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should be able to see  {string} name newly created conversation list")
    public void userShouldBeAbleToSeeNameNewlyCreatedConversationList(String expectedName) {
        String actualEmployee=talkModulePage.firstConversationer.getText();
        Assert.assertEquals(expectedName,actualEmployee);

    }




    //AC-2
    @Then("user clicks into three dots of the newly create conversation")
    public void userClicksIntoThreeDotsOfTheNewlyCreateConversation() {
    talkModulePage.meatball.click();
    }
    @Then("user clicks to delete conversation and user clicks Yes button then verify if conversation had been deleted")
    public void userClicksToDeleteConversationAndUserClicksYesButtonThenVerifyIfConversationHadBeenDeleted() {
        String beforeDeleteName=talkModulePage.firstConversationer.getText();

        talkModulePage.deleteAction.click();

        talkModulePage.yesButton.click();

        BrowserUtils.sleep(3);

        String afterDeleteName=talkModulePage.firstConversationer.getText();

        Assert.assertFalse(afterDeleteName.contains(beforeDeleteName));
        //

    }

}
