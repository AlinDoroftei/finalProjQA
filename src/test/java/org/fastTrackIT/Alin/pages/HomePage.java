package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css=".site-header-right-link")
    private WebElementFacade signInLink;

    @FindBy (css=".search-btn")
    private WebElementFacade cartButton;

    @FindBy(css="[name=s]")
    private WebElementFacade searchField;

    @FindBy(css=".search-block :nth-child(2)")
    private WebElementFacade enterSearchButton;



    public void clickLoginLink(){
        clickOn(signInLink);
    }

    public void clickOnCartButton(){clickOn(cartButton);}

    public void clickOnSearchField(String keyword){
        typeInto(searchField, keyword);}

    public void clickSearchIcon(){clickOn(enterSearchButton);}




}
