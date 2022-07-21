package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade userField;

    @FindBy(id = "password")
    private WebElementFacade passField;

    @FindBy(css = "[name='login']")
    private WebElementFacade loginButton;

    @FindBy(css = ".woocommerce-MyAccount-content >:nth-child(1)")
    private WebElementFacade verifyLoginMsg;

    @FindBy(css =".woocommerce-error >li")
    private WebElementFacade checkInvalidUsername;

    @FindBy(css=".woocommerce-error ")
    private WebElementFacade checkInvalidPass;


    public void setUserField(String user) {
        typeInto(userField, user);
    }

    public void setPasswordField(String password) {
        typeInto(passField, password);
    }

    public void clickLoginButtor() {
        clickOn(loginButton);
    }

    public boolean verifyLoginMsg(String userName){
        return verifyLoginMsg.getText().contains("Hello " + userName);
    }

    public boolean checkMsgInvalidUser(){
        return checkInvalidUsername.getText().contains(("ERROR: Invalid username."));
    }

    public boolean checkMsgInvalidPass(String username){
        return checkInvalidPass.getText().contains(("ERROR: The password you entered for the email address "+ username+" is incorrect."));
    }
}