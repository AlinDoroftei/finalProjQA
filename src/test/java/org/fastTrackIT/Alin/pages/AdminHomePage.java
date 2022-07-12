package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/wp-login.php")

public class AdminHomePage extends PageObject {

    @FindBy(id = "toplevel_page_woocommerce")
    private WebElementFacade wooCommerceButton;

    @FindBy(css = ".toplevel_page_woocommerce .wp-submenu :nth-child(3) [href]")
    private WebElementFacade couponsButton;


    public void openCouponsTab(){
        withAction().moveToElement(wooCommerceButton).perform();
        withAction().moveToElement(couponsButton).build();
        couponsButton.click();
    }

    public void clickCouponsButton(){
        clickOn(couponsButton);
    }
}