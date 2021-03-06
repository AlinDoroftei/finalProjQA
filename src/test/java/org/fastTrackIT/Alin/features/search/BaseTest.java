package org.fastTrackIT.Alin.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fastTrackIT.Alin.steps.serenity.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class BaseTest extends org.fasttrackit.utils.Constants {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected SearchSteps searchSteps;

    @Steps
    protected ProductSteps productSteps;

    @Steps
    protected CartSteps cartSteps;

    @Steps
    protected AdminLoginSteps loginAdminSteps;

    @Steps
    protected AdminCommerceSteps commerceAdminSteps;

    @Steps
    protected RegisterSteps registerSteps;

    @Steps
    protected CheckoutSteps checkoutSteps;


    @Before
    public void maximaze() {
        webDriver.manage().window().maximize();
    }
}
