package com.trycloud.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Talk_ModulePage extends BasePage {
    public Talk_ModulePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkButton;

    @FindBy(xpath = "//div[@class='wrapper']//button")
    public WebElement plusButton;

    @FindBy(xpath = "//input[@class='conversation-name']")
    public WebElement conversNameInput;

    @FindBy(xpath = "//label[@class='conversation-type__label']")
    public WebElement allowCheckbox;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement addParticButton;

    @FindBy(xpath = "//input[@placeholder='Search participants']")
    public WebElement employeeSearchBtn;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConvercButton;

    @FindBy(xpath = "//div[@class='icons-menu']/button")
    public WebElement closeButton;  //create it

    @FindBy(xpath =
            "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[1]")
    public WebElement meatball;

    @FindBy(xpath = "(//div[@class='open']/ul/li)[10]")   ///IT'S wrong locator
    // check on it
    public WebElement deleteAction;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement yesButton;

    @FindBy(xpath = "(//ul[@class='conversations']/li)[1]/a/div[2]/div[1]/span[1]")
    public WebElement firstConversationer;



}
