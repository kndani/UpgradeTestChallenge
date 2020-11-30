package com.page.wrapper;

import com.page.element.PageAnnualIncome;
import com.util.Helper;
import org.openqa.selenium.Keys;

public class WrapperAnnualIncome extends PageAnnualIncome {

    public void typeInIndividualAnnualIncome(String value){
        Helper.typeInField(individualAnnualIncomeField(), value);
    }

    public void typeInAdditionalAnnualIncome(String value){
        Helper.typeInField(additionalAnnualIncomeField(), value + Keys.TAB);
    }

    public WrapperUserCredential clickOnContinueButton() {
        Helper.clickOnWebElement(continueButton());
        return new WrapperUserCredential();
    }
}
