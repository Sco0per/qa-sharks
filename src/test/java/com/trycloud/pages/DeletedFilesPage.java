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

public class DeletedFilesPage extends FilesPage  {



    public DeletedFilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//table/thead/tr[1]/th[3]//span[@class='sort-indicator icon-triangle-s']")
    public WebElement headerDeleted;

    @FindBy(xpath = "//td[3]/span")
    public List<WebElement> dateColumn;

    @FindBy(xpath = "(//table/tbody/tr[1]/td[2]//span[@class='icon icon-more'])[2]")
    public WebElement threeDot;

//    @FindBy(xpath = "(//table/tbody/tr[1]/td[2]//span[@class='icon icon-delete'])[2]")
//    public WebElement deletePermanentlySign;
    @FindBy(css = "#fileList > tr.mouseOver > td.filename > div > ul > li.action-delete-container > a")
    public WebElement deletePermanentlySign;

    @FindBy(xpath = "(//table/tbody/tr)")
    public List<WebElement> row;

    @FindBy(css = "#fileList > tr:nth-child(1) > td.filename > a > span.fileactions > a.action.action-restore.permanent > span.icon.icon-history")
    public WebElement restoreLink;





    public  List<String> getDate(List<WebElement> dateColumn){

        System.out.println(dateColumn);
        List<String> dateTimeList= new ArrayList<>();

        for (WebElement each : dateColumn) {
           dateTimeList.add(each.getAttribute("data-original-title"));

        }

        return dateTimeList;
    }








}
