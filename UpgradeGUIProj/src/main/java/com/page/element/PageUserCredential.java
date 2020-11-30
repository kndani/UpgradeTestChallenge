package com.page.element;

import com.object.DriverObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageUserCredential extends DriverObject {

    private final static String EMAIL_ADDRESS_FILED = "username";
    private final static String PASSWORD_FIELD = "password";
    private final static String AGREEMENTS_CHECKBOX= ".sc-xGAYn.sc-dWBSoC.cRGvbh.czwUhv";
    private final static String CHECK_YOUR_RATE_BUTTON = "//button[@data-auto='submitPersonalInfo']";
    private static final String LOGIN_BUTTON = "[class='sc-iJCRLp enDQXE']";

    public WebElement emailAddressField(){
        return driver.findElement(By.name(EMAIL_ADDRESS_FILED));
    }

    public WebElement passwordField(){
        return driver.findElement(By.name(PASSWORD_FIELD));
    }

    public WebElement agreementsCheckbox(){
        return driver.findElement(By.cssSelector(AGREEMENTS_CHECKBOX));
    }

    public WebElement checkYourRateButton(){
        return driver.findElement((By.xpath(CHECK_YOUR_RATE_BUTTON)));
    }

    public static WebElement loginButton(){
        return driver.findElement(By.cssSelector(LOGIN_BUTTON));
    }

}
