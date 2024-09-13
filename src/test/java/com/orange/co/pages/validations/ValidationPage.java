package com.orange.co.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ValidationPage extends PageObject {

    @FindBy(css = "h6.oxd-topbar-header-breadcrumb-module")
    protected WebElementFacade lbl_dashboard;


}
