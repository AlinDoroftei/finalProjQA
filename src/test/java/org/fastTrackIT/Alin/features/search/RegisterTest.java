package org.fastTrackIT.Alin.features.search;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class RegisterTest extends BaseTest{
    Integer randomNb = org.fasttrackit.utils.Constants.randomEmailAdressForRegister();
    @Test
    public void registerWithValidCredentials() {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        registerSteps.setEmailAddress("alin.doroftei"+randomNb+"@yahoo.com");
        registerSteps.setPassword(Constants.USER_PASS);
        registerSteps.clickRegisterButton();
        Assert.assertEquals("alin.doroftei"+randomNb, registerSteps.checkMessage() );
    }

    @Test
    public void registerWithInvalidEmail() {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        registerSteps.setEmailAddress("alin.doroftei"+randomNb+"@yahoocom");
        registerSteps.setPassword(Constants.USER_PASS);
        registerSteps.clickRegisterButton();
        Assert.assertTrue("Error message is  not displayed", registerSteps.checkErrorEmailMsg("Error: Please provide a valid email address.") );
    }

    @Test
    public void registerWithInvalidPass() {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        registerSteps.setEmailAddress("alin.doroftei"+randomNb+"@yahoo.com");
        registerSteps.setPassword("123456");
        Assert.assertTrue("Error message is not displayed", registerSteps.checkErrorPassMsg("Very weak - Please enter a stronger password."));
    }
}
