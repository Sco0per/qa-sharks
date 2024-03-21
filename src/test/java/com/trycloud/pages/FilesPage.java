package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage extends BasePage {

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@data-id='trashbin']/a")
    public WebElement deletedFilesLink;

    @FindBy(id = "app-navigation-toggle")
    public WebElement hmbrgrButton;
}
