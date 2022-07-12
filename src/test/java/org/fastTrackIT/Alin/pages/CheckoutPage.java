package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")

public class CheckoutPage extends PageObject {

    @FindBy(id = "billing_first_name")
    private WebElementFacade setFirstName;

    @FindBy(id = "billing_last_name")
    private WebElementFacade setLastName;

    @FindBy(id = "billing_country")
    private WebElementFacade dropdownCountry;

    @FindBy(css = ".form-row> #billing_address_1")
    private WebElementFacade setStrName;

    @FindBy(id = "billing_city")
    private WebElementFacade setCityName;

    @FindBy(css = "#billing_state_field #billing_state")
    private WebElementFacade dropdownCounty;

    @FindBy(css = "#billing_postcode_field #billing_postcode")
    private WebElementFacade setPostcode;

    @FindBy(id = "billing_phone")
    private WebElementFacade setPhoneNumber;

    @FindBy(id = "billing_email")
    private WebElementFacade typeEmail;

    @FindBy(id = "place_order")
    private WebElementFacade placeOrder;

    @FindBy(css = "p.woocommerce-notice")
    private WebElementFacade checkConfirmationOrder;


    public void typeFirstName(String firstName) {
        typeInto(setFirstName, firstName);
    }

    public void typeLastName(String lastName) {
        typeInto(setLastName, lastName);
    }

    public void selectCountry() {
        selectFromDropdown(dropdownCountry, "Romania");
    }

    public void typeStrName(String streetName) {
        typeInto(setStrName, streetName);
    }

    public void typeCity(String city) {
        typeInto(setCityName, city);
    }

    public void selectCounty() {
        selectFromDropdown(dropdownCounty, "Cluj");
    }

    public void typePostcode(String zipCode) {
        typeInto(setPostcode, zipCode);
    }

    public void typePhoneNumber(String phoneNB) {
        typeInto(setPhoneNumber, phoneNB);
    }

    public void typeEmailAdress(String email) {
        typeInto(typeEmail, email);
    }

    public void clickPlaceOrder() {
        clickOn(placeOrder);
    }


}

