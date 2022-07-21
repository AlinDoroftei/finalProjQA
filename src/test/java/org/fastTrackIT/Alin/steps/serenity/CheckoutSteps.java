package org.fastTrackIT.Alin.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fastTrackIT.Alin.pages.CheckoutPage;

public class CheckoutSteps extends ScenarioSteps {
    private CheckoutPage checkoutPage;

    @Step
    public void setFirstName(String firstName){checkoutPage.typeFirstName(firstName);}

    @Step
    public void setLastName(String lastName){checkoutPage.typeLastName(lastName);}

    @Step
    public void dropdownCountry(){checkoutPage.selectCountry();}

    @Step
    public void setStreetAdress(String street){checkoutPage.typeStrName(street);}

    @Step
    public void setCity(String city){checkoutPage.typeCity(city);}

    @Step
    public void dropdownCounty(){checkoutPage.selectCounty();}

    @Step
    public void setPostcode(String zipCode){checkoutPage.typePostcode(zipCode);}

    @Step
    public void setPhoneNb(String phoneNb){checkoutPage.typePhoneNumber(phoneNb);}

    @Step
    public void setEmail(String email){checkoutPage.typeEmailAdress(email);}

    @Step
    public void clickPlaceOrder(){checkoutPage.clickPlaceOrder();}

    @Step
    public boolean checkConfirmationCheckout(String expectedMsg){
        return checkoutPage.checkoutConfirmationMsg(expectedMsg);
    }
    @Step
    public boolean invalidMandatoryField(String expectedMsg){
        return checkoutPage.checkMsgInvalidMandatoryField(expectedMsg);
    }

}
