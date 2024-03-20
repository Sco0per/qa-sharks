package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Talk_ModulePage {
    public Talk_ModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@class='app-navigation-search__input']")
    public WebElement conversInputPlaceholder;

    @FindBy(xpath = "//button[@class='toggle has-tooltip']")
    public WebElement addButton;

    @FindBy(xpath = "//div[@class='new-group-conversation__content']")
    public WebElement conversContent;

    @FindBy(xpath = "//input[@class='conversation-name']")
    public WebElement conversNameInput;



    @FindBy(xpath = "//label[@class='conversation-type__label']")
    public WebElement allowCheckbox;


    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement addParticButton;

    @FindBy(xpath = "//div[@class='modal-container']")
    public WebElement employeeList;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConvercButton;

    @FindBy(xpath = "")
    public WebElement closeButton;



}
