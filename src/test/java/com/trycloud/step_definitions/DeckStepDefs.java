package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.DeckPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;

public class DeckStepDefs {
    DeckPage deckPage = new DeckPage();

    @When("user clicks {string} from dashboard")
    public void user_clicks_from_dashboard(String string) {
        BasePage.clickModule(string);
    }
    @Then("user click deck navigation button")
    public void user_click_deck_navigation_button() {
        BrowserUtils.waitForClickablility(deckPage.navigationButton, 5);
        deckPage.navigationButton.click();
    }
    @Then("user clicks Add board button")
    public void user_clicks_add_board_button() {
        deckPage.addBoardButton.click();
    }
    @Then("user enters {string} as the board name")
    public void user_enters_as_the_name(String boardName) {
        deckPage.addBoardNameInput.sendKeys(boardName + Keys.ENTER);

    }
    @Then("user sees {string} in all boards list")
    public void user_sees_board_in_all_boards_list(String boardName) {
        deckPage.verifyBoardExists(boardName);
    }


    @Then("user opens {string} board")
    public void user_opens_created_board(String boardName) {
        deckPage.openBoard(boardName);
    }
    @When("user click add list")
    public void user_click_add_list() {
        deckPage.addListDashboard.click();
    }
    @Then("user enters {string} as the list name")
    public void user_enters_as_the_list_name(String listName) {
        deckPage.addListNameInputDashboard.sendKeys(listName + Keys.ENTER);
    }

    @Then("user should see {string} under the board")
    public void user_should_see_new_list_under_the_board(String listName) {
        deckPage.verifyListExists(listName);
    }


    @When("user click add card to {string} and enters name {string}")
    public void user_click_add_card_and_enters_name(String listName, String cardName) {
        deckPage.addTaskToList(listName, cardName);
    }


    @When("user click three dots under the task {string} and click assign to me button")
    public void user_click_three_dots_under_the_task_and_click_assign_to_me_button(String taskName) {
        deckPage.assignTaskToMe(taskName);
    }


    @Then("clean up")
    public void clean_up() {

    }
}
