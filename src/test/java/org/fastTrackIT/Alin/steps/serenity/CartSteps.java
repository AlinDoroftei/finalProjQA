package org.fastTrackIT.Alin.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fastTrackIT.Alin.pages.CartPage;

public class CartSteps extends ScenarioSteps {

    private CartPage cartPage;

    @Step
    public String getCartProductName(){
       return cartPage.getCartProductName();
    }

    @Step
    public String getCartProductPrice(){
        return cartPage.getProductPrice();
    }

    @Step
    public void typeQuantity(String quantity){
        cartPage.insertQuantity(quantity);
    }

    @Step
    public void updateQuantity(){
        cartPage.updateProdQuantity();
    }

    @Step
    public String getCartTotal(){
        return cartPage.getCartTotalOfProduct();
    }

    @Step
    public String calculateCartTotal(String quantity){
        return cartPage.calculateCartTotal(quantity);
    }

    @Step
    public void addCouponCode(String couponCode){ cartPage.addCouponCode(couponCode);}

    @Step
    public void applyCoupon(){cartPage.applyCoupon();}

    @Step
    public boolean validateCouponApplied(){
        return cartPage.verifyCouponApplied();
    }

    @Step
    public void clickProceedCheckout(){cartPage.clickCheckoutButton();}
}
