package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
