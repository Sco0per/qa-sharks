package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calender_Module_Page {

    public Calender_Module_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//li[@data-id='calendar'][1]")
    public static WebElement CalendarButton;

    @FindBy(xpath = "(//div[@class='trigger'])[2]")
    public static WebElement ViewMenu;

    @FindBy(xpath = "//li[@class='action active']")
    public static WebElement DayButton;

    @FindBy(xpath = "(//li[@class='action'])[5]")
    public static WebElement WeekButton;

    @FindBy(xpath = "(//li[@class='action'])[6]")
    public static WebElement MonthButton;



    @FindBy(xpath = "//button[@class='button primary new-event']")
    public static WebElement newEventButton;



    @FindBy(xpath = "(//input[@type='text'])[6]")
    public static WebElement eventTitle;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    public static WebElement startDate;


    @FindBy(xpath = "(//input[@type='text'])[9]")
    public static WebElement endDate;


    @FindBy(xpath = "//button[@class='primary']")
    public static WebElement saveButton;
}