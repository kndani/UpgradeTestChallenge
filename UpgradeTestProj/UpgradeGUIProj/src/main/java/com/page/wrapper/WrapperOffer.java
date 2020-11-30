package com.page.wrapper;

import com.object.Constant;
import com.page.element.PageOffer;
import com.test.data.DataHandler;
import com.util.Helper;

public class WrapperOffer extends PageOffer {

    public String getLoanAmount(){
        return Helper.getTextFromElement(loanAmountLabel());
    }

    public String getMonthlyPayment(){
        return Helper.getTextFromElement(monthlyPaymentLabel());
    }

    public String getMonthTerm(){
        return Helper.getTextFromElement(monthTermLabel());
    }

    public String getInterestRate(){
        return Helper.getTextFromElement(interestRateLabel());
    }

    public String getAPR(){
        return Helper.getTextFromElement(aprLabel());
    }

    public void clickOnMenu(){
        Helper.clickOnWebElement(menuLabel());
    }

    public void clickOnSignOut(){
        Helper.clickOnWebElement(signOutLink());
    }

    public void collectOfferDetails(){
        WrapperCommonElements.waitForPageToLoad();
        DataHandler.loanOfferData.put(Constant.LOAN_AMOUNT, getLoanAmount());
        DataHandler.loanOfferData.put(Constant.MONTHLY_PAYMENT, getMonthlyPayment());
        DataHandler.loanOfferData.put(Constant.MONTH_TERM, getMonthTerm());
        DataHandler.loanOfferData.put(Constant.INTEREST_RATE, getInterestRate());
        DataHandler.loanOfferData.put(Constant.APR, getAPR());

        System.out.println("Data collection successfully completed");
    }
}
