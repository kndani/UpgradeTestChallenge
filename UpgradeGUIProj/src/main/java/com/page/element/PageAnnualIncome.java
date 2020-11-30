package com.page.element;

import com.object.DriverObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageAnnualIncome extends DriverObject {

    private static final String INDIVIDUAL_ANNUAL_INCOME = "borrowerIncome";
    private static final String ADDITIONAL_ANNUAL_INCOME = "borrowerAdditionalIncome";
    private static final String CONTINUE_BUTTON = "//button[@data-auto='continuePersonalInfo']";
    private static final String CONTEXT_HELP ="//div[@data-context-help='true']";

    public WebElement individualAnnualIncomeField(){
       return driver.findElement(By.name(INDIVIDUAL_ANNUAL_INCOME));
    }

    public WebElement additionalAnnualIncomeField(){
        return driver.findElement(By.name(ADDITIONAL_ANNUAL_INCOME));
    }

    public WebElement continueButton(){
        return driver.findElement(By.xpath(CONTINUE_BUTTON));
    }

}
