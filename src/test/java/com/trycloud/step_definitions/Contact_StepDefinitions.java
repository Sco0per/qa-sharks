package com.trycloud.step_definitions;

import com.trycloud.pages.ContactPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Contact_StepDefinitions {

    ContactPage contactPage = new ContactPage();
    @Given("User is on the contact module page")
    public void user_is_on_the_contact_module_page() {
        contactPage.goToContactPage();
    }
    @When("user clicks on New contact")
    public void user_clicks_on_new_contact() {

        contactPage.NewContactButton.click();
    }
    @Then("user types the name")
    public void user_types_the_name() {
        contactPage.NameInput.click();
        contactPage.NameInput.sendKeys("test1");
    }

    @Then("user should see the new contact name in the All contacts list")
    public void user_should_see_the_new_contact_in_the_all_contacts_list() {
        contactPage.AllcontactsButton.click();
        contactPage.AddedContact.isDisplayed();
    }



    @Given("a set of contacts in the All contacts list")
    public void a_set_of_contacts_in_the_all_contacts_list() {
        contactPage.goToContactPage();
        contactPage.AddContacts();
    }
    @When("user clicks on the All contacts button")
    public void user_clicks_on_the_all_contacts_button() {
        contactPage.AllcontactsButton.click();
    }
    @Then("user sees the whole list and the total number of contacts")
    public void user_sees_the_whole_list_and_the_total_number_of_contacts() {

        Assert.assertEquals(contactPage.contacts.size(), Integer.parseInt(contactPage.totalNumber.getText()));

    }




    @Given("a previously uploaded picture in the files option")
    public void a_previously_uploaded_picture_in_the_files_option() {
        contactPage.goToContactPage();
    }
    @When("user clicks on the contact whose picture they want to change")
    public void user_clicks_on_the_contact_whose_picture_they_want_to_change() {
        contactPage.AddedContact.click();
    }
    @When("user clicks on the Choose from file option")
    public void user_clicks_on_the_choose_from_file_option() {
        contactPage.uploadPictureButton.click();
        contactPage.chooseFromFileButton.click();
    }
    @When("user chooses the picture by clicking on it")
    public void user_chooses_the_picture_by_clicking_on_it() {
        contactPage.picture.click();
    }
    @When("user clicks on the choose button")
    public void user_clicks_on_the_choose_button() {
        contactPage.chooseButton.click();
    }




    @Given("user clicks on the desired contact to delete")
    public void user_clicks_on_the_desired_contact_to_delete() {
        contactPage.goToContactPage();
        contactPage.AddedContact.click();
    }
    @When("user clicks on the three dots option")
    public void user_clicks_on_the_three_dots_option() {
        contactPage.threeDots.click();
    }
    @When("user clicks on the Delete option")
    public void user_clicks_on_the_delete_option() {
    contactPage.deleteButton.click();
    }
    @Then("user should not see the contact in the list")
    public void user_should_not_see_the_contact_in_the_list()  {
        BrowserUtils.sleep(2);
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//*[contains(text(),'test1')]"));
    }

}
