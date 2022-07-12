package org.fastTrackIT.Alin.steps.serenity;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fastTrackIT.Alin.pages.HomePage;
import org.fastTrackIT.Alin.pages.SearchResultPage;
import org.junit.Assert;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")

public class SearchSteps extends ScenarioSteps {
    private HomePage homePage;
    private SearchResultPage searchResultPage;


    @Step
    public void doSearch(String keyword){
        homePage.clickOnCartButton();
        homePage.clickOnSearchField(keyword);
        homePage.clickSearchIcon();
    }
    @Step
    public void verifyProductInResult(String productName){
        Assert.assertTrue(searchResultPage.checkListForProduct(productName));
    }

    @Step
    public void selectProductFromList(String product){
        searchResultPage.selectProductFromList(product);
    }

    @Step
    public void openProduct(String product){
        searchResultPage.selectProductFromList(product);
    }
}
