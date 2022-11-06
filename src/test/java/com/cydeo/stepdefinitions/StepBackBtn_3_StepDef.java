package com.cydeo.stepdefinitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.DriverManager;

public class StepBackBtn_3_StepDef {

    LoginPage loginPage = new LoginPage();

    @When("User clicks stepback btn")
    public void user_clicks_stepback_btn() {

        Driver.get().navigate().back();
    }
    @Then("User can not go to the home page again")
    public void user_can_not_go_to_the_home_page_again() {

        loginPage.titleVerification("Login");

    }

}
