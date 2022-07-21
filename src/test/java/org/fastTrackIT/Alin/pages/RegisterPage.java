package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

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

    @FindBy(css=".woocommerce-password-strength")
    private WebElementFacade errorPassMsg;


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

    public boolean checkErrorEmailMsg(String expectedMsg){
        String actualMsg = errorEmailMsg.getText();
        return  actualMsg.equals(expectedMsg);
    }

    public boolean checkErrorPassMsg(String expectedPassMsg){
        String actualPassMsg = errorPassMsg.getText();
        return  actualPassMsg.equals(expectedPassMsg);
    }
}
