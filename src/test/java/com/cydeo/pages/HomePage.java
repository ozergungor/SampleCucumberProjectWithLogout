package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//a[@href='javascript: void(0);']")
    public WebElement userProfileName;

    @FindBy(className = "oro-subtitle")
    private WebElement pageSubtitle;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutBtn;

    public String getSubtitle(){
        return pageSubtitle.getText();
    }
}
