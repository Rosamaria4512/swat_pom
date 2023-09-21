package com.co.swagpom.steps;

import com.co.swagpom.pageobject.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {

    LoginPage loginPage;

    @Step
    public void openPagen()
    {
        loginPage.open();

    }
    @Step
    public void enteruser(String name)
    {
        loginPage.getDriver().findElement(loginPage.getTXT_USER()).sendKeys(name);
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);
        }
    }
    @Step
    public void enterpassword(String password)
    {
        loginPage.getDriver().findElement(loginPage.getTXT_PAASWORD()).sendKeys(password);
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);
        }
    }

    @Step
    public void clicklogin()
    {
        loginPage.getDriver().findElement(loginPage.getBTN_LOGIN()).click();
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);
        }
    }
}
