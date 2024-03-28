package com.trycloud.step_definitions;

import com.trycloud.pages.File_favoritesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class File_favorites_StepDef {
    File_favoritesPage favoritesPage = new File_favoritesPage();


    @Given("user is on the action menu from three dots")
    public void user_is_on_the_action_menu_from_three_dots() {
        BrowserUtils.waitFor(3);
        favoritesPage.filesBtn.click();
        BrowserUtils.waitFor(3);
        favoritesPage.allFilesNavIcon.click();
        favoritesPage.threeDot.click();
    }


    //AC-1
    @Then("user chooses a file to make it favorite")
    public void user_chooses_a_file_to_make_it_favorite() {

        favoritesPage.favoriteBtnInThreeDots.click();
    }

    @Then("user verifies that selected file is as favorite")
    public void user_verifies_that_selected_file_is_as_favorite() {
        favoritesPage.favoriteBtnNavIcon.click();

        // String beforeFavorite =
    }

    //AC-2
    @Then("user clicks on the Rename option")
    public void user_clicks_on_the_rename_option() {
        favoritesPage.renameBtn.click();
        BrowserUtils.waitFor(3);
    }

    @And("user types {string} to rename the file")
    public void userTypesToRenameTheFile(String filesName) {
        favoritesPage.renameBtnDetails.sendKeys(filesName + Keys.ENTER);
        BrowserUtils.waitFor(3);
    }

    @Then("user verifies that file has been renamed")
    public void user_verifies_that_file_has_been_renamed() {

    }


    //AC-3
    @Then("user click to Details option")
    public void user_click_to_details_option() {
        BrowserUtils.waitFor(3);
        favoritesPage.detailsBtn.click();
        BrowserUtils.waitFor(5);
    }

    @Then("user clicks to the Comments button")
    public void user_clicks_to_the_comments_button() {
        BrowserUtils.waitFor(3);
        favoritesPage.commentsBtn.click();
        BrowserUtils.waitFor(3);

    }

    @Then("user adds comments as {string}")
    public void userAddsCommentsAs(String comments) {
        favoritesPage.commentsInput.sendKeys(comments);
        BrowserUtils.waitFor(3);
        favoritesPage.commentSubmBtn.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user verifies if comments have been displayed")
    public void user_verifies_if_comments_have_been_displayed() {
        // String expectedText = ;

        // Assert.assertTrue(favoritesPage.postedCommts.isDisplayed());
    }



}
