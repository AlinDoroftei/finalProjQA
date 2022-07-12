package org.fastTrackIT.Alin.pages;

import net.serenitybdd.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;

import java.text.DecimalFormat;
import java.util.Random;

public class BasePage extends PageObject {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public String appPrice(double price) {
        return String.valueOf(df.format(price));
    }

    public double finalPrice(String price) {
        return Double.parseDouble(price.split(" ")[0].replace(",", "."));
    }

    public String randomString() {
        String randomStr = RandomStringUtils.randomAlphabetic(4);
        return randomStr;
    }

    public Integer randomEmailAdressForRegister() {
        Random randomInt = new Random();
        int randomNb = randomInt.nextInt(3);
        return randomNb;
    }
}


