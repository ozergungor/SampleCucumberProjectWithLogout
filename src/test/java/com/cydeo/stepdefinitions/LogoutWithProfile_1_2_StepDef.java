package com.cydeo.stepdefinitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutWithProfile_1_2_StepDef {

    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();
    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() {

        loginPage.loginAsDriver();
    }
    @When("User clicks username on the profile menu")
    public void user_clicks_username_on_the_profile_menu() {

        homePage.userProfileName.click();

    }
    @When("User clicks logout btn inside profile menu")
    public void user_clicks_logout_btn_inside_profile_menu() {

        homePage.logoutBtn.click();
    }
    @Then("User lands on the login page")
    public void user_lands_on_the_login_page() {

        loginPage.titleVerification("Login");

    }
}
