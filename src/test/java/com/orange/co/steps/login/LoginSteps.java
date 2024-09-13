package com.orange.co.steps.login;

import com.orange.co.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps extends LoginPage {
    @Step("Escribo Usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);
    }

    @Step("ingreso contraseña")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("click en login")
    public void clickLogin(){
        btn_login.click();
    }

}



