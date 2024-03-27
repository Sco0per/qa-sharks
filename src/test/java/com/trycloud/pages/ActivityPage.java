package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ActivityPage {

    public ActivityPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[4]/a")
    public WebElement activityButton;
    @FindBy(xpath = "//*[@id='app-navigation']/ul/li")
    public List<WebElement> allActivityCategories;
    @FindBy(css = ".activitytime.has-tooltip.live-relative-timestamp")
    public List<WebElement> activityDateObjects;


    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[1]/a")
    public WebElement allActivitiesLink;

    @FindBy(xpath = "//*[@id=\"no_more_activities\"]")
    public WebElement noMoreEventsToLoad;

    public void clickOnAllActivities() {
        activityButton.click();
    }

    public boolean areAllActivitiesDisplayed() {

        return allActivitiesLink.isDisplayed();
    }

    public List<String> extractTimeStamps() {
        List<String> timestamps = new ArrayList<>();
        List<WebElement> timestampElements = activityButton.findElements(By.xpath("//*[@id=\"container\"]/div[1]/div[2]/div/span"));
        for (WebElement element : timestampElements) {
            timestamps.add(element.getText());
        }
        return timestamps;

        }
   /* public void isNoMoreEventsToLoadDisplayed() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement noMoreEventsLink = (WebElement) By.xpath("//*[@id=\"no_more_activities\"]");

    */



    }










