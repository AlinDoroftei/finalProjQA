package org.fastTrackIT.Alin.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Assert;
import org.junit.Test;
import utils.*;

public class LoginAdminTest extends BaseTest{
    @Test
    public void loginWithValidCredentials(){
        loginAdminSteps.navigateToAdminPage();
        loginAdminSteps.setCredentials(Constants.ADMIN, Constants.ADMIN_PASS);
        loginAdminSteps.clickLogIn();
        Assert.assertTrue("Login error!",loginAdminSteps.welcomeText());
    }

    @Test
    public void loginWithInvalidEmail(){
        loginAdminSteps.navigateToAdminPage();
        loginAdminSteps.setCredentials("alin.doro", Constants.ADMIN_PASS);
        loginAdminSteps.clickLogIn();
        Assert.assertTrue("Invalid error message is not displayed!", loginAdminSteps.invalidUsername());
    }

    @Test
    public void loginWithInvalidPass(){
        loginAdminSteps.navigateToAdminPage();
        loginAdminSteps.setCredentials(Constants.ADMIN,"123456");
        loginAdminSteps.clickLogIn();
        Assert.assertTrue("Invalid error message is not displayed!", loginAdminSteps.invalidPass(Constants.ADMIN));
    }

}
