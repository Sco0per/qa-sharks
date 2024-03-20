package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Talk_module_StepDef {
//from the Background of the loginStepDef, copied and past here

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
    }







   //AC-1
    @When("user navigates and clicks on Talk Module icon")
    public void user_navigates_and_clicks_on_talk_module_icon() {

    }
    @Then("talk module page opens")
    public void talk_module_page_opens() {

    }
    @When("user inters a participant and clicks the add button")
    public void user_inters_a_participant_and_clicks_the_add_button() {

    }
    @Then("conversation content pops-up with searched participant's name on it")
    public void conversation_content_pops_up_with_searched_participant_s_name_on_it() {

    }
    @Then("user checks a checkbox to allow guests to join")
    public void user_checks_a_checkbox_to_allow_guests_to_join() {

    }
    @Then("user clicks to the Add participants button")
    public void user_clicks_to_the_add_participants_button() {

    }
    @Then("all participants list pups-up")
    public void all_participants_list_pups_up() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user selects a participant from the list and clicks into Create conversation button")
    public void user_selects_a_participant_from_the_list_and_clicks_into_create_conversation_button() {

    }
    @Then("copy the conversation link option pops-up")
    public void copy_the_conversation_link_option_pops_up() {

    }
    @Then("user clicks into Close button")
    public void user_clicks_into_close_button() {

    }
    @Then("user can see newly created conversation on the list")
    public void user_can_see_newly_created_conversation_on_the_list() {

    }






//AC-2
    @Given("user navigates to newly created conversation and clicks meatball button")
    public void userNavigatesToNewlyCreatedConversationAndClicksMeatballButton() {
    }

    @Then("list of options drops down")
    public void listOfOptionsDropsDown() {
    }

    @Then("the Delete conversation option is visible")
    public void theDeleteConversationOptionIsVisible() {
    }

    @Then("user clicks to delete and verification of deletion is pops-up")
    public void userClicksToDeleteAndVerificationOfDeletionIsPopsUp() {
    }

    @Then("user clicks Yes button")
    public void userClicksYesButton() {
    }

    @Then("verify if conversation had been deleted")
    public void verifyIfConversationHadBeenDeleted() {
    }
}
