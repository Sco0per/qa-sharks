package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FilesPage extends BasePage {

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@data-id='trashbin']/a")
    public WebElement deletedFilesLink;


    @FindBy(linkText = "All files")
    public WebElement AllFilesLink;

    @FindBy(xpath = "(//table/tbody/tr)")
    public List<WebElement> rowAllFiles;

    @FindBy(id = "app-navigation-toggle")
    public WebElement hmbrgrButton;


    public List<String> getIDList (List<WebElement> list){

        List idList= new ArrayList();

        for (WebElement each : list) {
            idList.add(each.getAttribute("data-id"));

        }

        System.out.println("idList = " + idList);
        return idList;
    }


    public String getElementID(List<WebElement> list){
        List <String> listOfIDs= getIDList(list);
        String lastElementID= listOfIDs.get(0);
        //System.out.println("lastElementID = " + lastElementID);
        return lastElementID;
    }

}
