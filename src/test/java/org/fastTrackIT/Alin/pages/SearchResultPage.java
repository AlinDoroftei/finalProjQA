package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultPage extends PageObject {

    @FindBy(css="#primary.content-area  .entry-title a")
    private List<WebElementFacade> productList;


    public boolean checkListForProduct(String productName){
        for (WebElementFacade element:productList){
            if (element.findElement(By.cssSelector(".entry-title a[href*=\"t-shirt-with-logo\"]")).getText().equalsIgnoreCase(productName)){
                return true;
            }
        } return false;
    }

    public void selectProductFromList(String product){
        for(WebElementFacade element:productList){
            if(element.getText().equalsIgnoreCase(product)){
                clickOn(element);
                break;
            }
        }
    }

}
