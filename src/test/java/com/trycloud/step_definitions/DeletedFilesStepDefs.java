package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.DeletedFilesPage;
import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeletedFilesStepDefs extends BasePage {
    FilesPage filesPage = new FilesPage();
    DeletedFilesPage deletedFilesPage = new DeletedFilesPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user is already on Files page")
    public void user_is_already_on_files_page() {
        clickModule("files");
    }


    @Given("user clicks to Deleted files button")
    public void userClicksToDeletedFilesButton() {
        filesPage.hmbrgrButton.click();
        BrowserUtils.waitForVisibility(filesPage.deletedFilesLink, 5);

        filesPage.deletedFilesLink.click();

    }

    @When("user clicks to Deleted button")
    public void user_clicks_to_deleted_button() {
        deletedFilesPage.headerDeleted.click();


    }

    @Then("user sees all the deleted files ordered by newest to oldest or vice versa")
    public void userSeesAllTheDeletedFilesOrderedByNewestToOldestOrViceVersa() {
        List<String> actualList = deletedFilesPage.getDate(deletedFilesPage.dateColumn);
        List<String> sortedList = new ArrayList<>(actualList);
        Collections.sort(sortedList);

        List<String> reversedSortedList = new ArrayList<>(sortedList);
        Collections.reverse(sortedList);

        System.out.println("actualList = " + actualList);
        System.out.println("sortedList = " + sortedList);
        System.out.println("reversedSortedList = " + reversedSortedList);

        Assert.assertTrue(actualList.equals(sortedList) || actualList.equals(reversedSortedList));


    }


    @When("user clicks three dots icon in the file's line")
    public void userClicksThreeDotsIconInTheFileSLine() {

        deletedFilesPage.threeDot.click();

    }

    @And("user clicks Delete permanently sign")
    public void userClicksDeletePermanentlySign() {


    }

    @Then("user sees the deleted file permanently deleted")
    public void userSeesTheDeletedFilePermanentlyDeleted() {
        List<String> filesListBeforePermanentDelete = deletedFilesPage.getIDList(deletedFilesPage.row);

        deletedFilesPage.deletePermanentlySign.click();
        BrowserUtils.waitFor(2);

        List<String> filesListAfterPermanentDelete = deletedFilesPage.getIDList(deletedFilesPage.row);

        Assert.assertTrue(!filesListAfterPermanentDelete.equals(filesListBeforePermanentDelete));
    }


    @When("user clicks Restore icon in the file's line")
    public void user_clicks_restore_icon_in_the_file_s_line() {

    }

    @Then("user sees the file is under the All Files tab")
    public void user_sees_the_file_is_under_the_all_files_tab() {
        String deletedFileIDBeforeRestore = deletedFilesPage.getElementID(deletedFilesPage.row);
        deletedFilesPage.restoreLink.click();
        filesPage.hmbrgrButton.click();
        deletedFilesPage.AllFilesLink.click();
BrowserUtils.waitFor(3);
        List<String> listOfAllFiles= filesPage.getIDList(filesPage.rowAllFiles);

        Assert.assertTrue(listOfAllFiles.contains(deletedFileIDBeforeRestore));



    }


}
