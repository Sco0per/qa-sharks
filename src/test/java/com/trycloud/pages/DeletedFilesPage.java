package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DeletedFilesPage extends BasePage {



    public DeletedFilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id=\"modified\"]/span[2]")
    //@FindBy(xpath = "//span[2][@class='sort-indicator icon-triangle-n']")
    public WebElement headerDeleted;

    @FindBy(xpath = "//td[3]/span")
    public List<WebElement> dateColumn;

    @FindBy(xpath = "div[@class='tooltip-inner']")
    public WebElement dateTag;

    @FindBy(xpath = " //div[@id=\"controls\"]/div[1]/div[2]/a")
    public WebElement trashBinIcon;


    public  List<String> getDate(List<WebElement> dateColumn){

        System.out.println(dateColumn);
        List<String> dateTimeList= new ArrayList<>();

        for (WebElement each : dateColumn) {
           dateTimeList.add(each.getAttribute("data-original-title"));

        }

        return dateTimeList;
    }

}
