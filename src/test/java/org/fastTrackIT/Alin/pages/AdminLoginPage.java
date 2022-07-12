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

    @FindBy(css="welcome-panel-content")
    private WebElementFacade welcomeMessage;


    public void setUserField(String user) {
        typeInto(userField, user);
    }

    public void setPassField(String password) {
        typeInto(passField, password);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public boolean checkWelcomeMessage(){welcomeMessage.getText();
    return Boolean.parseBoolean(welcomeMessage.getText());
    }
}

