package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class LoginPage extends PageObject {

//    @FindBy(css=".site-header-right-link")
//    private WebElementFacade signInLink;

    @FindBy(id = "username")
    private WebElementFacade userField;

    @FindBy(id="password")
    private WebElementFacade passField;

    @FindBy(css="[name='login']")
    private WebElementFacade loginButton;


//    public void clickLoginLink() {
//        clickOn(signInLink);
//    }

    public void setUserField(String user){
            typeInto(userField, user);
        }

    public void setPasswordField(String password) {
            typeInto(passField, password);
        }

    public void clickLoginButtor(){
        clickOn(loginButton);
    }
    }

