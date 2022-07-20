package org.fastTrackIT.Alin.features.search;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class SearchTest extends BaseTest{

    @Test
    public void  searchProductTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.doSearch("shirt");
        searchSteps.verifyProductInResult("T-Shirt with Logo");
        searchSteps.openProduct("T-Shirt with Logo");
        Assert.assertEquals("Title not the same!","T-Shirt with Logo", productSteps.getProductName());
    }
}
