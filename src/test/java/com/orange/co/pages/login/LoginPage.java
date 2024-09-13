package com.orange.co.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(name = "username")
    protected WebElementFacade txt_username;

    @FindBy(name = "password")
    protected WebElementFacade txt_password;

    @FindBy(css = "button.orangehrm-login-button")
    protected WebElementFacade btn_login;



}
