package org.fastTrackIT.Alin.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fastTrackIT.Alin.pages.AdminCouponsPage;
import org.fastTrackIT.Alin.pages.AdminHomePage;
import org.fastTrackIT.Alin.pages.AdminCommercePage;
import org.junit.Assert;

public class AdminCommerceSteps extends ScenarioSteps {
    private AdminHomePage adminHomePage;
    private AdminCommercePage adminCommercePage;
    private AdminCouponsPage adminCouponsPage;

    @Step
    public void addCoupon(){
        adminCommercePage.clickAddCoupon();}

    @Step
    public void couponCode(String code){
        adminCommercePage.typeCouponCode(code);}

    @Step
    public void descriptionCoupon(String description){
        adminCommercePage.typeDescriptionCoupon(description);}

    @Step
    public void couponData(){
        adminCommercePage.clickCouponData();}

    @Step
    public void discountType(){
        adminCommercePage.clickDiscountCouponType();}

    @Step
    public void couponAmount(String discount){
        adminCommercePage.clickCouponAmount(discount);}

    @Step
    public void freeShipping(){
        adminCommercePage.clickFreeShipping();}

    @Step
    public void expiryDate(String date){
        adminCommercePage.clickCouponExpiryDate(date);}

    @Step
    public void createCoupon(){
        adminCommercePage.clickCreateCoupon();}

    @Step
    public boolean validateCouponsCreated(String couponsCode){
        return adminCouponsPage.checkListForCoupon(couponsCode);
    }

    @Step
    public void goCouponPage(){
        adminHomePage.clickCouponsButton();
    }

    @Step
    public void doLogout(){adminCommercePage.doLogout();}

    }

