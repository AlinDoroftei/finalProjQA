package org.fastTrackIT.Alin.features.search;

import org.junit.Assert;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Test
    public void verifyCartProductName(){
        loginSteps.doLogin(org.fasttrackit.utils.Constants.USER_EMAIL, org.fasttrackit.utils.Constants.USER_PASS);
        searchSteps.doSearch("shirt");
        searchSteps.selectProductFromList("T-Shirt with Logo");
        productSteps.clickAddToCart();
        productSteps.verifySuccessMesage("T-Shirt with Logo");
        String productName = productSteps.getProductName();
        productSteps.clickViewCartButton();
        String cartProductName = cartSteps.getCartProductName();
        Assert.assertEquals(productName,cartProductName);
    }

    @Test
    public void verifyCartPrice(){
        loginSteps.doLogin(org.fasttrackit.utils.Constants.USER_EMAIL, org.fasttrackit.utils.Constants.USER_PASS);
        searchSteps.doSearch("shirt");
        searchSteps.selectProductFromList("T-Shirt with Logo");
        String productPrice = productSteps.getProductPrice();
        productSteps.clickAddToCart();
        productSteps.clickViewCartButton();
        String cartProductPrice = cartSteps.getCartProductPrice();
        Assert.assertEquals(productPrice,cartProductPrice);
    }

    @Test
    public void verifyCartAmount(){
        loginSteps.doLogin(org.fasttrackit.utils.Constants.USER_EMAIL, org.fasttrackit.utils.Constants.USER_PASS);
        searchSteps.doSearch("shirt");
        searchSteps.selectProductFromList("T-Shirt with Logo");
        productSteps.clickAddToCart();
        productSteps.clickViewCartButton();
        cartSteps.typeQuantity("5");
        cartSteps.updateQuantity();
        String calculatedTotal = cartSteps.calculateCartTotal("5");
        String total = cartSteps.getCartTotal();
        Assert.assertEquals(calculatedTotal,total);
    }



}