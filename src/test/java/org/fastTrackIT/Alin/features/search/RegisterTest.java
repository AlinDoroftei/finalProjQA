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
        registerSteps.setEmailAddress("alin.doroftei"+randomNb+"yahoo.com");
        registerSteps.setPassword(Constants.USER_PASS);
        registerSteps.clickRegisterButton();
//        Assert.assertEquals("Please provide a valid email address.", registerSteps.checkErrorEmailMsg() );
    }

    @Test
    public void registerWithInvalidPass() {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        registerSteps.setEmailAddress("alin.doroftei"+randomNb+"@yahoo.com");
        registerSteps.setPassword("123456");
//        registerSteps.clickRegisterButton();        buton inactiv
//        Assert.assertEquals("alin.doroftei"+randomNb, registerSteps.checkMessage() );
    }
}
