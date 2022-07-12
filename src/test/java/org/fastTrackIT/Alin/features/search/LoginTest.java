package org.fastTrackIT.Alin.features.search;
import org.fasttrackit.utils.Constants;
import org.junit.Test;


public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredential(){
    loginSteps.navigateToHomepage();
    loginSteps.navigateToLoginPage();
    loginSteps.setCredentials(Constants.USER_EMAIL,Constants.USER_PASS);
    loginSteps.clickLogIn();
    }


    @Test
    public void loginWithInvalidEmail(){
    loginSteps.navigateToHomepage();
    loginSteps.navigateToLoginPage();
    loginSteps.setCredentials("alin.doroftei.yahoo.com",Constants.USER_PASS);
    loginSteps.clickLogIn();
    }


    @Test
    public void loginWithInvalidPass(){
    loginSteps.navigateToHomepage();
    loginSteps.navigateToLoginPage();
    loginSteps.setCredentials(Constants.USER_EMAIL,"123456");
    loginSteps.clickLogIn();
    }

}
