package org.fastTrackIT.Alin.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fastTrackIT.Alin.pages.ProductPage;
import org.fastTrackIT.Alin.pages.SearchResultPage;

public class ProductSteps extends ScenarioSteps {

    private ProductPage productPage;

    private SearchResultPage searchResultPage;

   @Step
    public void clickAddToCart(){
       productPage.clickAddToCartButton();
   }

   @Step
    public void verifySuccessMesage(String productName){
       productPage.verifySuccessMessage(productName);
   }

   @Step
    public String getProductPrice(){
      return productPage.getProductPrice();
   }

   @Step
    public String getProductName(){
      return productPage.getProductName();
   }

   @Step
    public void clickViewCartButton(){
       productPage.clickViewCartButton();
   }
}
