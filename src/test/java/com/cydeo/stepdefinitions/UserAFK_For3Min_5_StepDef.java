package com.cydeo.stepdefinitions;

import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.When;

public class UserAFK_For3Min_5_StepDef {


    @When("User is AFK for {int} min")
    public void user_is_afk_for_min(Integer minutes) {

        BrowserUtils.wait(minutes*60);

    }
}
