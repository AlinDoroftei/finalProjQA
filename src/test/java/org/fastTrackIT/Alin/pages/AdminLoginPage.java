package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/wp-login.php")

public class AdminLoginPage extends PageObject {

    @FindBy(id="user_login")
    private WebElementFacade userField;

    @FindBy(id = "user_pass")
    private WebElementFacade passField;

    @FindBy(id="wp-submit")
    private WebElementFacade loginButton;

    @FindBy(css=".welcome-panel-content")
    private WebElementFacade welcomeMessage;

    @FindBy(id="login_error")
    private WebElementFacade invalidUsername;

    @FindBy(id="login_error")
    private WebElementFacade invalidPass;


    public void setUserField(String user) {
        typeInto(userField, user);
    }

    public void setPassField(String password) {
        typeInto(passField, password);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public boolean checkWelcomeMessage(){
        return welcomeMessage.getText().contains("Welcome to WordPress!");
    }

    public boolean checkInvalidUsernameLogin(){
        return invalidUsername.getText().contains("ERROR"+": Invalid username");
    }
    public boolean checkInvalidPassLogin(String adminUsername){
        return invalidPass.getText().contains("ERROR"+": The password you entered for the username "+adminUsername+" is incorrect. ");
    }

}

