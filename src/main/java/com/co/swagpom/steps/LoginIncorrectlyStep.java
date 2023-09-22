package com.co.swagpom.steps;

import com.co.swagpom.pageobject.LoginIncorrectlyPage;
import net.thucydides.core.annotations.Step;


public class LoginIncorrectlyStep {
    LoginIncorrectlyPage loginIncorrectlyPage;

    @Step
    public void enteruser(String name)
    {
        loginIncorrectlyPage.getDriver().findElement(loginIncorrectlyPage.getTXT_USER()).sendKeys(name);

    }
    @Step
    public void enterpassword(String password)
    {
        loginIncorrectlyPage.getDriver().findElement(loginIncorrectlyPage.getTXT_PAASWORD()).sendKeys(password);

    }

    @Step
    public void clicklogin()
    {
        loginIncorrectlyPage.getDriver().findElement(loginIncorrectlyPage.getBTN_LOGIN()).click();

        System.out.println("Login Incorrecto ");
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);
        }
    }


}
