package org.fastTrackIT.Alin.steps.serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fastTrackIT.Alin.pages.ProductPage;
import org.fastTrackIT.Alin.pages.HomePage;
import org.fastTrackIT.Alin.pages.LoginPage;
import org.fastTrackIT.Alin.pages.SearchResultPage;

public class LoginSteps extends ScenarioSteps {

    private ProductPage productPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private SearchResultPage searchPage;

    @Step
    public void navigateToHomepage(){homePage.open();}

    @Step
    public void navigateToLoginPage(){homePage.clickLoginLink();}

    @Step
    public void setCredentials(String user, String pass){
    loginPage.setUserField(user);
    loginPage.setPasswordField(pass);
    }

    @Step
    public void clickLogIn(){
        loginPage.clickLoginButtor();
    }

    @Step
    public void doLogin (String email, String password){
        navigateToHomepage();
        navigateToLoginPage();
        setCredentials(email, password);
        clickLogIn();
    }
}
