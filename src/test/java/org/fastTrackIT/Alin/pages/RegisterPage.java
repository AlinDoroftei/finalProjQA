package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webelements.RadioButtonGroup;

public class RegisterPage extends PageObject {

    @FindBy(css=".site-header-right-link")
    private WebElementFacade registerLink;

    @FindBy(id="reg_email")
    private WebElementFacade emailAddressField;

    @FindBy(id="reg_password")
    private WebElementFacade passwordField;

    @FindBy(css=".woocommerce-FormRow .woocommerce-Button")
    private WebElementFacade registerButton;

    @FindBy(css="div .woocommerce-MyAccount-content :nth-child(1) :nth-child(1)")
    private WebElementFacade helloMessage;

    @FindBy(css=".woocommerce-error>li")
    private WebElementFacade errorEmailMsg;

    public void clickLoginLink() {
        clickOn(registerLink);
    }

    public void setEmailAddress(String email){
        typeInto(emailAddressField, email);
    }

    public void setPassword (String password){
        typeInto(passwordField, password);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }

    public String checkMessage(){helloMessage.getText();
        return helloMessage.getText();
    }

    public String CheckErrorEmailMsg(){errorEmailMsg.getText();
        return errorEmailMsg.getText();
    }
}