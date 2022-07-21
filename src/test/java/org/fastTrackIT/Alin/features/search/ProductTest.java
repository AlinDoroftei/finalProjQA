package org.fastTrackIT.Alin.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class ProductTest extends BaseTest{

    @Test
    public void addProductToCart(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.doSearch("shirt");
        searchSteps.selectProductFromList("T-Shirt with Logo");
        productSteps.clickAddToCart();
        productSteps.verifySuccessMesage("T-Shirt with Logo");
    }

    @Test
    public void addProductToCartAsGuest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.doSearch("shirt");
        searchSteps.selectProductFromList("T-Shirt with Logo");
        productSteps.clickAddToCart();
        productSteps.verifySuccessMesage("T-Shirt with Logo");
    }
}
