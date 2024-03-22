package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class File_favoritesPage {
    public File_favoritesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesBtn;

    @FindBy(xpath ="//a[@class='nav-icon-files svg active']" )
    public WebElement allFilesBtn;

    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//a[@data-action='Favorite']")
    public WebElement favoriteBtn;

    @FindBy(xpath = "(//tbody/tr/td[@class='filename ui-draggable ui-draggable-handle'])[1]")
    public WebElement selectedAsFavorite;

    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li[@class=' action-rename-container']")
    public WebElement renameBtn;

    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li[@class=' action-details-container']")
    public WebElement detailsBtn;

    @FindBy(xpath = "//div//ul/li/a[@data-id='commentsTabView']")
    public WebElement commentsBtn;

    @FindBy(xpath = "//div//form[@class='newCommentForm']")
    public WebElement commentsInput;

    @FindBy(xpath = "//div//form//input[@type='submit']")
    public WebElement commentSubmBtn;



}
