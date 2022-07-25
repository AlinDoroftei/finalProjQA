package org.fastTrackIT.Alin.features.search;

import org.fastTrackIT.Alin.pages.BasePage;
import org.junit.Assert;
import org.junit.Test;

public class FullCheckOutTest extends BaseTest {
    String random = org.fasttrackit.utils.Constants.randomString();

    @Test
    public void fullTest() {
        loginAdminSteps.navigateToAdminPage();
        loginAdminSteps.doLogin(org.fasttrackit.utils.Constants.ADMIN, org.fasttrackit.utils.Constants.ADMIN_PASS);
        loginAdminSteps.couponTab();
        commerceAdminSteps.addCoupon();
        commerceAdminSteps.couponCode(random);
        commerceAdminSteps.descriptionCoupon("This is a TEST Coupon! ");
        commerceAdminSteps.couponData();
        commerceAdminSteps.discountType();
        commerceAdminSteps.couponAmount("10");
        commerceAdminSteps.freeShipping();
        commerceAdminSteps.expiryDate("2023-02-02");
        commerceAdminSteps.createCoupon();
        commerceAdminSteps.goCouponPage();
        Assert.assertTrue("Coupon not found!", commerceAdminSteps.validateCouponsCreated(random));
        commerceAdminSteps.doLogout();
        loginSteps.doLogin(org.fasttrackit.utils.Constants.USER_EMAIL, org.fasttrackit.utils.Constants.USER_PASS);
        searchSteps.doSearch("shirt");
        searchSteps.selectProductFromList("T-Shirt with Logo");
        productSteps.clickAddToCart();
        productSteps.verifySuccessMesage("T-Shirt with Logo");
        String productName = productSteps.getProductName();
        productSteps.clickViewCartButton();
        String cartProductName = cartSteps.getCartProductName();
        Assert.assertEquals(productName, cartProductName);
        cartSteps.addCouponCode(random);
        cartSteps.applyCoupon();
        cartSteps.validateCouponApplied();
        cartSteps.clickProceedCheckout();
//        checkoutSteps.setFirstName("Alin");
//        checkoutSteps.setLastName("Doroftei");
//        checkoutSteps.dropdownCountry();
//        checkoutSteps.setStreetAdress("Avram Iancu");
//        checkoutSteps.setCity("Floresti");
//        checkoutSteps.dropdownCounty();
//        checkoutSteps.setPostcode("407280");
//        checkoutSteps.setPhoneNb("0700123456");
        checkoutSteps.clickPlaceOrder();


    }
}
