package com.co.swagpom.stepsdefinitions;

import com.co.swagpom.models.DataLoginIncorrectly;
import com.co.swagpom.pageobject.LoginIncorrectlyPage;
import com.co.swagpom.steps.LoginIncorrectlyStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class LoginIncorrectlyStepDefinition {
    LoginIncorrectlyStep loginIncorrectlyStep;
    @When("^he user enter with incorrect credentials$")
    public void heUserEnterWithIncorrectCredentials(List<DataLoginIncorrectly>dataLoginIncorrectlyList) {
        loginIncorrectlyStep.enteruser(dataLoginIncorrectlyList.get(0).getUser());
        loginIncorrectlyStep.enterpassword(dataLoginIncorrectlyList.get(0).getPassword());
        loginIncorrectlyStep.clicklogin();

    }


    @Then("^he login wrong$")
    public void heLoginWrong() {

    }

}
