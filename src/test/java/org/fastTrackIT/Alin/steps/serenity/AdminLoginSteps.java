package org.fastTrackIT.Alin.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fastTrackIT.Alin.pages.AdminHomePage;
import org.fastTrackIT.Alin.pages.AdminCommercePage;
import org.fastTrackIT.Alin.pages.AdminLoginPage;

public class AdminLoginSteps extends ScenarioSteps {
    private AdminHomePage adminHomePage;
    private AdminLoginPage adminLoginPage;
    private AdminCommercePage adminCommercePage;

    @Step
    public void navigateToAdminPage(){
        adminHomePage.open();}

    @Step
    public void setCredentials(String user, String pass){
        adminLoginPage.setUserField(user);
        adminLoginPage.setPassField(pass);
    }
    @Step
    public void clickLogIn(){
        adminLoginPage.clickLoginButton();
    }

    @Step
    public void doLogin (String user, String password){
        navigateToAdminPage();
        setCredentials(user, password);
        clickLogIn();
    }

    @Step
    public void couponTab(){
        adminHomePage.openCouponsTab();
    }

    @Step
    public boolean welcomeText(){
        return adminLoginPage.checkWelcomeMessage();
    }

    @Step
    public boolean invalidUsername(){
        return adminLoginPage.checkInvalidUsernameLogin();
    }
    @Step
    public boolean invalidPass(String adminUsername){
        return adminLoginPage.checkInvalidPassLogin(adminUsername);
    }
}
