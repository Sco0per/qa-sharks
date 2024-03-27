package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class File_favoritesPage extends FilesPage{
    public File_favoritesPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesBtn;

    @FindBy(xpath ="//a[@class='nav-icon-files svg active']" )
    public WebElement allFilesNavIcon;

    @FindBy(xpath = "(//table/tbody/tr[1]/td[2]//span[@class='icon icon-more'])[1]")
    public WebElement threeDot;  //nail's2 mine 1

    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//a[@data-action='Favorite']")
    public WebElement favoriteBtnInThreeDots;

    @FindBy(xpath = "(//tbody/tr/td[@class='filename ui-draggable ui-draggable-handle'])[1]")
    public WebElement selectedAsFavorite;

    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoriteBtnNavIcon;

    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li[@class=' action-rename-container']")
    public WebElement renameBtn;

    @FindBy(xpath = "//tbody/tr//td/span[@class='modified live-relative-timestamp']")
    public WebElement renameBtnDetails;

    @FindBy(xpath = "//div/ul//li/a[@data-action='Details']")
    public WebElement detailsBtn;

    @FindBy(xpath = "(//div/nav/ul/li[@class='app-sidebar-tabs__tab'])[2]")
    public WebElement commentsBtn;

    @FindBy(xpath = "//div//form/div[@class='message']")
    public WebElement commentsInput;

    @FindBy(xpath = "//div//form//input[@type='submit']")
    public WebElement commentSubmBtn;

    @FindBy(xpath = "(//div//ul[@class='comments']/li//div[@class='message'])[1]")
    public WebElement postedCommts;



}
