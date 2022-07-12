package org.fastTrackIT.Alin.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;
import utils.*;

public class LoginAdminTest extends BaseTest{
    @Test
    public void loginWithValidCredentials(){
        loginAdminSteps.navigateToAdminPage();
        loginAdminSteps.setCredentials(Constants.ADMIN, Constants.ADMIN_PASS);
        loginAdminSteps.clickLogIn();
    }

    @Test
    public void loginWithInvalidEmail(){
        loginAdminSteps.navigateToAdminPage();
        loginAdminSteps.setCredentials("alin.doro", Constants.ADMIN_PASS);
        loginAdminSteps.clickLogIn();
    }

    @Test
    public void loginWithInvalidPass(){
        loginAdminSteps.navigateToAdminPage();
        loginAdminSteps.setCredentials(Constants.ADMIN,"123456");
        loginAdminSteps.clickLogIn();
    }

}
