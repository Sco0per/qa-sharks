package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    public DashboardPage() {

        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(xpath = "(//a[@class='active'])[1]")
    public WebElement hover;
    @FindBy(xpath = "//ul[@id='appmenu']/li/a/span")
    public List<WebElement> menuOptions;

    @FindBy(id = "settings")
    public WebElement settings;

    @FindBy(xpath = "(//nav[@id='expanddiv']//span)[1]")
    public WebElement verifyUsername;

    @FindBy(xpath = "//div[@class='footer']/a")
    public WebElement customizeButton;

    @FindBy(xpath = "//div[@class='modal__content']/ol/li")
    public List<WebElement> customizeOptions;

    @FindBy(xpath = "//div[@class='panel']")
    public List<WebElement> verifyCustomizeOptSelected;

    @FindBy(xpath = "//button[@class='action-item action-item--single header-close icon-close undefined undefined has-tooltip']")
    public WebElement closeButton;

    @FindBy(id = "status-status")
    public WebElement setStatusButton;

    @FindBy(xpath = "//div[@class='set-status-modal__online-status']/div")
    public List<WebElement> setStatusOptions;

    @FindBy(xpath = "//button[@href='#']")
    public WebElement verifySetStatus;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-online']")
    public WebElement onlineButton;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-away']")
    public WebElement awayButton;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-dnd']")
    public WebElement doNotDisturbButton;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-invisible']")
    public WebElement invisibleButton;


    public static void verifySetStatus(String status) {

        DashboardPage page = new DashboardPage();

        if (status.equalsIgnoreCase("Online")) {
            page.setStatusButton.click();
            page.onlineButton.click();
            BrowserUtils.sleep(3);
            page.closeButton.click();
            System.out.println("Current selected Status is =" + page.verifySetStatus.getText());
            BrowserUtils.sleep(3);
        } else if (status.equalsIgnoreCase("Do not disturb")) {
            page.setStatusButton.click();
            page.doNotDisturbButton.click();
            BrowserUtils.sleep(3);
            page.closeButton.click();
            BrowserUtils.sleep(3);
            System.out.println("Current selected Status is =" + page.verifySetStatus.getText());

        } else if (status.equalsIgnoreCase("Away")) {
            page.setStatusButton.click();
            page.awayButton.click();
            BrowserUtils.sleep(3);
            page.closeButton.click();
            BrowserUtils.sleep(3);
            System.out.println("Current selected Status is=" + page.verifySetStatus.getText());
        } else if (status.equalsIgnoreCase("Invisible")) {
            page.setStatusButton.click();
            page.invisibleButton.click();
            BrowserUtils.sleep(3);
            page.closeButton.click();
            BrowserUtils.sleep(3);
            System.out.println("Current selected Status is =" + page.verifySetStatus.getText());


        }
    }

}
