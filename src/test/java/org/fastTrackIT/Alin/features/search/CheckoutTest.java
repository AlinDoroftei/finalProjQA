package org.fastTrackIT.Alin.features.search;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.junit.Test;

public class CheckoutTest extends BaseTest{


    @Test
    public void checkoutTestAsGuest(){
        loginSteps.navigateToHomepage();
        searchSteps.doSearch("shirt");
        searchSteps.selectProductFromList("T-Shirt with Logo");
        productSteps.clickAddToCart();
        productSteps.clickViewCartButton();
        cartSteps.clickProceedCheckout();
        checkoutSteps.setFirstName("Alin");
        checkoutSteps.setLastName("Doroftei");
        checkoutSteps.dropdownCountry();
        checkoutSteps.setStreetAdress("Avram Iancu");
        checkoutSteps.setCity("Floresti");
        checkoutSteps.dropdownCounty();
        checkoutSteps.setPostcode("407280");
        checkoutSteps.setPhoneNb("0700123456");
        checkoutSteps.setEmail("alin.doroftei@gmail.com");
        checkoutSteps.clickPlaceOrder();
        Assert.assertTrue("Error message is  not displayed", checkoutSteps.checkConfirmationCheckout("Thank you. Your order has been received.") );
    }

    @Test
    public void checkoutTest(){
        loginSteps.doLogin(org.fasttrackit.utils.Constants.USER_EMAIL, org.fasttrackit.utils.Constants.USER_PASS);
        loginSteps.navigateToHomepage();
        searchSteps.doSearch("shirt");
        searchSteps.selectProductFromList("T-Shirt with Logo");
        productSteps.clickAddToCart();
        productSteps.clickViewCartButton();
        cartSteps.clickProceedCheckout();
        checkoutSteps.clickPlaceOrder();
        Assert.assertTrue("Error message is  not displayed", checkoutSteps.checkConfirmationCheckout("Thank you. Your order has been received.") );

    }
}
