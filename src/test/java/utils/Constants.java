package org.fasttrackit.utils;


import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Constants {

    public static final String USER_NAME = "alin.doroftei";
    public static final String USER_EMAIL = "alin.doroftei@yahoo.com";
    public static final String USER_PASS = "Alin.123!";

    public static final String ADMIN = "admin";
    public static final String ADMIN_PASS = "parola11";

    public static final String randomString() {
        String randomStr = RandomStringUtils.randomAlphabetic(5);
        return randomStr;
    }
    public static final Integer randomEmailAdressForRegister() {
        Random randomInt = new Random();
        int randomNb = randomInt.nextInt(1000);
        return randomNb;
    }
}
