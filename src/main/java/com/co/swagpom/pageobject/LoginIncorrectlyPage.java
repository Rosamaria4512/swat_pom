package com.co.swagpom.pageobject;

import io.appium.java_client.FindsByFluentSelector;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginIncorrectlyPage extends PageObject {
    By TXT_USER = By.xpath("//*[@id='user-name']");
    By TXT_PAASWORD = By.xpath("//*[@id='password']");
    By BTN_LOGIN = By.xpath("//*[@id='login-button']");

    public By getTXT_USER() {
        return TXT_USER;
    }

    public void setTXT_USER(By TXT_USER) {
        this.TXT_USER = TXT_USER;
    }

    public By getTXT_PAASWORD() {
        return TXT_PAASWORD;
    }

    public void setTXT_PAASWORD(By TXT_PAASWORD) {
        this.TXT_PAASWORD = TXT_PAASWORD;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public void setBTN_LOGIN(By BTN_LOGIN) {
        this.BTN_LOGIN = BTN_LOGIN;
    }


}
