package com.cydeo.stepdefinitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.When;

import java.sql.DriverManager;

public class CloseTheTab_4_StepDef {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @When("User opens a new tab and logs in")
    public void userOpensANewTabAndLogsIn() {

        loginPage.goLoginPage();
        System.out.println("User is on login page");

    }
    @When("User closes all tabs")
    public void user_closes_all_tabs() {

        Driver.closeDriver();
        System.out.println("All tabs are closed");
    }
    @When("User opens a new login page again")
    public void user_opens_a_new_login_page_again() {
        loginPage.goLoginPage();
    }
}
