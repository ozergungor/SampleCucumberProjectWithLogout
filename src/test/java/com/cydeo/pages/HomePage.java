package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.get(), this);
    }
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
