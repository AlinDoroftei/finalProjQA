package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdminCommercePage extends PageObject {

    @FindBy(css=".page-title-action")
    private WebElementFacade addCoupon;

    @FindBy(id="title")
    private WebElementFacade couponID;

    @FindBy(id="woocommerce-coupon-description")
    private WebElementFacade descriptionCoupon;

    @FindBy(css="#normal-sortables .toggle-indicator")
    private WebElementFacade couponData;

    @FindBy(css="#woocommerce-coupon-data .handlediv")
    private WebElementFacade dropDownButton;

    @FindBy(css="#discount_type [value=\"fixed_cart\"]")
    private WebElementFacade discountCouponType;

    @FindBy(id="coupon_amount")
    private WebElementFacade couponAmount;

    @FindBy(id="free_shipping")
    private WebElementFacade freeShipping;

    @FindBy(id="expiry_date")
    private WebElementFacade couponExpiryDate;

    @FindBy(id="publish")
    private WebElementFacade createCoupon;

    @FindBy(id="wp-admin-bar-my-account")
    private WebElementFacade topNavUser;

    @FindBy(id="wp-admin-bar-logout")
    private WebElementFacade userLogout;


    public void clickAddCoupon(){clickOn(addCoupon);}

    public void typeCouponCode(String couponCode){typeInto(couponID, couponCode);}

    public void typeDescriptionCoupon(String description){typeInto(descriptionCoupon, description);}

    public void clickCouponData(){
        if(dropDownButton.getAttribute("aria-expanded")=="false"){
            clickOn(couponData);
        }
    }

    public void clickDiscountCouponType(){clickOn(discountCouponType);}

    public void clickCouponAmount(String discount){typeInto(couponAmount, discount);}

    public void clickFreeShipping(){clickOn(freeShipping);}

    public void clickCouponExpiryDate(String date){typeInto(couponExpiryDate,date);}

    public void clickCreateCoupon(){clickOn(createCoupon);}

    public void doLogout() {
        withAction().moveToElement(topNavUser).perform();
        withAction().moveToElement(userLogout).build();
        userLogout.click();
    }

}
