package com.page.element;

import com.object.DriverObject;
import com.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PagePersonalLoanAndCard extends DriverObject {
    private static final String LOAN_AMOUNT_FIELD = "desiredAmount";
    private static final String LOAN_PURPOSE_DROP_DOWN = "//select[@aria-label='Loan Purpose']";
    private static final String CHECK_YOUR_RATE_BUTTON = "//button[@data-auto='CheckYourRate']";
    private static final String LOAN_AMOUNT_FIELD_VAL_MES = "[class='sc-iwaifL bUpaVg']";

    public static WebElement loanAmountField(){
        return driver.findElement(By.name(LOAN_AMOUNT_FIELD));
    }

    public static WebElement loanPurposeDropDown(){
        return driver.findElement(By.xpath(LOAN_PURPOSE_DROP_DOWN));
    }

    public static WebElement checkYourRateButton(){
        return driver.findElement(By.xpath(CHECK_YOUR_RATE_BUTTON));
    }

}