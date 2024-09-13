package com.orange.co.steps.validations;

import com.orange.co.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Ingreso exitoso")
    public Boolean tittleIsVisible(){
        return lbl_dashboard.isDisplayed();
    }

}
