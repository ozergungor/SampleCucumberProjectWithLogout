package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en_lol.WEN;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    //---locators----------------
    @FindBy(id = "prependedInput")
    public WebElement usernameField;
    @FindBy(id = "prependedInput2")
    public WebElement passwordField;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPasswordLink;

    //---methods-----------------
    public void clickForgotPassword(){

        forgotPasswordLink.click();
    }

    public void goLoginPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    public void loginAsDriver() {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsSalesManager() {
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsStoreManager() {
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }


    public void loginAsUserType(String userType) {

        String password = "";
        String username = "";

        if (userType.equalsIgnoreCase("driver")) {
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        } else if (userType.equalsIgnoreCase("sales manager")) {
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        } else if (userType.equalsIgnoreCase("store manager")) {
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }


    public void loginWithCredentials(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    public String getPageTitle() {
        return Driver.get().getTitle();
    }

    public void titleVerification(String expectedURLTitle) {

        Assert.assertEquals(expectedURLTitle, Driver.get().getTitle());

    }

}

