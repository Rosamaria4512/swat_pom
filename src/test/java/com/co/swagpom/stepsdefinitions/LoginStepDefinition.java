package com.co.swagpom.stepsdefinitions;

import com.co.swagpom.models.DataLogin;
import com.co.swagpom.pageobject.LoginPage;
import com.co.swagpom.steps.LoginStep;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;

import java.util.List;


public class LoginStepDefinition {
@Steps
   LoginStep loginStep;

    @Given("^he user entre the website$")
    public void heUserEntreTheWebsite() {
     loginStep.openPagen();

    }


    @When("^he user enter with credentials$")
    public void heUserEnterWithCredentials(List<DataLogin>dataLoginList) {
     loginStep.enteruser(dataLoginList.get(0).getUser());
     loginStep.enterpassword(dataLoginList.get(0).getPassword());
     loginStep.clicklogin();

    }

    @Then("^he could succesfully$")
    public void heCouldSuccesfully() {

    }


}
