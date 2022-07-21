package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends BasePage {

    @FindBy(css = ".product-name a")
    private WebElementFacade cartProductName;

    @FindBy(css ="td.product-price .woocommerce-Price-amount")
    private WebElementFacade cartProductPrice;

    @FindBy(css =".product-subtotal .woocommerce-Price-amount")
    private WebElementFacade cartTotalOfProduct;

    @FindBy(css=".product-quantity .input-text")
    private WebElementFacade productQuantity;

    @FindBy(css = "[value=\"Update cart\"]")
    private WebElementFacade updateCartButton;

    @FindBy(id="coupon_code")
    private WebElementFacade couponField;

    @FindBy(css="[value='Apply coupon']")
    private WebElementFacade applyCouponButton;

    @FindBy(css=".order-total .woocommerce-Price-amount")
    private WebElementFacade finalCartTotal;

    @FindBy(css=".cart-subtotal .woocommerce-Price-amount")
    private WebElementFacade finalCartSubtotal;

    @FindBy(css=".checkout-button")
    private WebElementFacade checkoutButton;


    public String getCartProductName(){
        return cartProductName.getText();
    }

    public String getProductPrice(){
        return cartProductPrice.getText();
    }

    public String calculateCartTotal(String quantity){
        double price = finalPrice(cartProductPrice.getText());
        int productQuantity = Integer.parseInt(quantity);
        return appPrice(price * productQuantity);
    }

    public String getCartTotalOfProduct(){
        return cartTotalOfProduct.getText().split(" ")[0];
    }

    public void insertQuantity(String quantity){
        productQuantity.clear();
        productQuantity.sendKeys(quantity);
    }

    public void updateProdQuantity(){
        updateCartButton.click();
    }

    public void addCouponCode(String couponCode){
        typeInto(couponField, couponCode);
    }

    public void applyCoupon(){
        clickOn(applyCouponButton);
    }

    public double getCartTotal(){
        return finalPrice(finalCartTotal.getText());
    }

    public boolean verifyCouponApplied(){
        return finalPrice(finalCartSubtotal.getText())-10.00==finalPrice(finalCartTotal.getText());
    }

    public void clickCheckoutButton(){clickOn(checkoutButton);}
}
