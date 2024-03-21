package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static org.junit.Assert.assertTrue;

public class DeckPage {
    public DeckPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Add board']")
    public WebElement addBoardButton;

    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement addBoardNameInput;

    @FindBy(xpath = "//div[@id='stack-add']")
    public WebElement addListDashboard;

    @FindBy(xpath = "//div[@id='stack-add']//input[@placeholder='List name']")
    public WebElement addListNameInputDashboard;

    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    public WebElement navigationButton;

    public void openBoard(String boardName) {
        Driver.getDriver().findElement(By.xpath("//span[@title='"+boardName+"']")).click();
    }

    public void verifyListExists(String listName) {
        WebElement list = Driver.getDriver().findElement(By.xpath("//h3[contains(.,'"+listName+"')]"));
        BrowserUtils.waitForVisibility(list, 5);
        assertTrue(list.isDisplayed());
    }

    public void verifyBoardExists(String boardName) {
        assertTrue(Driver.getDriver().findElement(By.xpath("//span[contains(.,'"+boardName+"')]")).isDisplayed());
    }

    public void addTaskToList(String listName, String taskName) {
        Driver.getDriver().findElement(By.xpath("//h3[contains(.,'"+listName+"')]/following-sibling::button")).click();

        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Card name']")).sendKeys(taskName + Keys.ENTER);

        assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='"+taskName+"']")).isDisplayed());
    }

    public void assignTaskToMe(String taskName) {
        WebElement threeDotsButton = Driver.getDriver().findElement(By.xpath("//span[.='"+taskName+"']/../../..//div[@class='v-popover']"));
        threeDotsButton.click();

        Driver.getDriver().findElement(By.xpath("//span[.='Assign to me']")).click();

        threeDotsButton.click();

        assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='Unassign myself']")).isDisplayed());
    }

    public void cleanUp(String boardName) {
        Driver.getDriver().get("https://qa.trycloud.net/index.php/apps/deck/#/");
        navigationButton.click();
        Driver.getDriver().findElement(By.xpath("//span[@title='"+boardName+"']/../following-sibling::div")).click();
        Driver.getDriver().findElement(By.xpath("//span[.='Delete board']")).click();
        Driver.getDriver().findElement(By.xpath("//button[.='Delete']")).click();
    }
}
