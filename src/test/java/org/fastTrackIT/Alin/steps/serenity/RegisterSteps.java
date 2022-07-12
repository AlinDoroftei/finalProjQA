package org.fastTrackIT.Alin.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fastTrackIT.Alin.pages.*;

public class RegisterSteps extends ScenarioSteps {

    private ProductPage productPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private SearchResultPage searchPage;
    private RegisterPage registerPage;

//    @Step
//    public void navigateToHomepage(){
//        homePage.open();
//    }
//
//    @Step
//    public void navigateToLoginPage(){homePage.clickLoginLink();}

    @Step
    public void setEmailAddress(String emailAddress){registerPage.setEmailAddress(emailAddress);}

    @Step
    public void setPassword(String password){registerPage.setPassword(password);}

    @Step
    public void setCredentialsToRegister(String emailAddress, String password){
        registerPage.setEmailAddress(emailAddress);
        registerPage.setPassword(password);
    }
    @Step
    public void clickRegisterButton(){registerPage.clickRegisterButton();}

    @Step
    public String checkMessage(){registerPage.checkMessage();
        return registerPage.checkMessage();
    }

    @Step
    public String checkErrorEmailMsg(){registerPage.CheckErrorEmailMsg();
    return registerPage.CheckErrorEmailMsg();
    }
}