package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy (css=".single_add_to_cart_button")
    private WebElementFacade addToCartButton;

    @FindBy(css=".woocommerce-message")
    private WebElementFacade successCartMesage;

    @FindBy(css="p.price .woocommerce-Price-amount ")
    private WebElementFacade totalFinalPrice;

    @FindBy(css=".product_title")
    private WebElementFacade productName;

    @FindBy(css=".fa-shopping-cart")
    private WebElementFacade viewCartButton;


    public void clickAddToCartButton(){clickOn(addToCartButton);}

    public void verifySuccessMessage(String productName) {
        successCartMesage.containsText(productName+ " has been added to your cart.");
    }

    public String getProductPrice(){
        return totalFinalPrice.getText();
    }

    public String getProductName(){
        return productName.getText();
    }

    public void clickViewCartButton(){
        clickOn(viewCartButton);
    }
}
