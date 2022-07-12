package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class AdminCouponsPage extends BasePage{

    @FindBy(css="tbody tr td a.row-title")
    private List<WebElementFacade> couponsList;

    public boolean checkListForCoupon(String couponsCode){
        for (WebElementFacade element:couponsList){
            if (element.getText().equalsIgnoreCase(couponsCode)){
                return true;
            }
        } return false;
    }

}
