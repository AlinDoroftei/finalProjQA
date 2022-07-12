package org.fastTrackIT.Alin.features.search;

import org.fastTrackIT.Alin.pages.BasePage;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class CreateCouponTest extends BaseTest{
    String random = org.fasttrackit.utils.Constants.randomString();


    @Test
    public void createDiscountCoupon(){
        loginAdminSteps.navigateToAdminPage();
        loginAdminSteps.doLogin(Constants.ADMIN,Constants.ADMIN_PASS);
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
        Assert.assertTrue("Coupon not found!",commerceAdminSteps.validateCouponsCreated(random));

    }

}
