package com.page.element;

import com.object.DriverObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PageOffer extends DriverObject {

    private final static String LOAN_AMOUNT_LABEL="//span[@data-auto='userLoanAmount']";
    private final static String MONTHLY_PAYMENT_LABEL = "//span[@data-auto='defaultMonthlyPayment']";
    private final static String MONTH_TERM_LABEL = "//div[@data-auto='defaultLoanTerm']";
    private final static String INTEREST_RATE_LABEL = "//div[@data-auto='defaultLoanInterestRate']";
    private final static String APR_LABEL = "//div[@data-auto='defaultMoreInfoAPR']";
    private final static String MENU_LABEL = ".header-nav";
    private final static String SIGN_OUT_LINK="Sign Out";

    public WebElement loanAmountLabel(){
        return driver.findElement(By.xpath(LOAN_AMOUNT_LABEL));
    }

    public WebElement monthlyPaymentLabel(){
        return driver.findElement(By.xpath(MONTHLY_PAYMENT_LABEL));
    }

    public WebElement monthTermLabel(){
        return driver.findElement(By.xpath(MONTH_TERM_LABEL));
    }

    public WebElement interestRateLabel(){
        return driver.findElement(By.xpath(INTEREST_RATE_LABEL));
    }

    public WebElement aprLabel(){
        return driver.findElement(By.xpath(APR_LABEL));
    }

    public WebElement menuLabel(){
        return driver.findElement(By.cssSelector(MENU_LABEL));
    }

    public WebElement signOutLink(){
        return driver.findElement(By.linkText(SIGN_OUT_LINK));
    }
}
