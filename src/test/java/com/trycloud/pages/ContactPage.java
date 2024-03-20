package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactPage {

    LoginPage lp = new LoginPage();

    public ContactPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@aria-label='Contacts'])[1]")
    public WebElement contactButton;

    public void goToContactPage(){
        lp.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));

        contactButton.click();
    }

    @FindBy(id = "new-contact-button")
    public WebElement NewContactButton;
    @FindBy(id = "contact-fullname")
    public WebElement NameInput;

    @FindBy(xpath = "//span[@title='All contacts']/..")
    public WebElement AllcontactsButton;

    @FindBy(xpath = "//*[contains(text(),'test1')]")
    public WebElement AddedContact;


    public void AddContacts(){
        for (int i = 2; i < 5; i++) {
            NewContactButton.click();
            NameInput.click();
            NameInput.sendKeys("test"+i);
            BrowserUtils.sleep(1);
        }

    }

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> contacts;

    @FindBy(xpath = "(//div[@class='app-navigation-entry__counter'])[1]")
    public WebElement totalNumber;

    @FindBy(xpath = "(//button[@aria-label='Actions'])[6]")
    public WebElement uploadPictureButton;
    @FindBy(xpath = "//span[.='Choose from Files']/..")
    public WebElement chooseFromFileButton;

    @FindBy(xpath = "//tbody/tr[@data-entryname='Test.png']")
    public WebElement picture;

    @FindBy(xpath = "//button[.='Choose']")
    public WebElement chooseButton;
    @FindBy(xpath = "//div[@class='action-item header-menu']//button")
    public WebElement threeDots;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[6]")
    public WebElement deleteButton;

}
