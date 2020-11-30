package com.page.wrapper;

import com.page.element.PageCommonElements;
import com.page.element.PagePersonalLoanAndCard;
import com.util.Helper;

public class WrapperPersonalLoanAndCard extends PagePersonalLoanAndCard {

    public void selectLoanPurposeFromDropDown(String loanPurposeOption) {
        Helper.selectDropDownOptionByVisibleText(loanPurposeDropDown(), "Other");
    }

    public void typeLoanAmountInField(String value) {
        WrapperCommonElements.waitForLoaderToBeInvisible();
        Helper.typeInField(loanAmountField(), value);
    }

    public WrapperBasicInformation clickOnCheckYourRateButton() {
        Helper.clickOnWebElement(checkYourRateButton());
        return new WrapperBasicInformation();
    }

    public boolean isLoanAmountFieldValidationDisplayed(String validationMessage) {
        return Helper.isTextPresent(PageCommonElements.findTextElement(validationMessage), validationMessage);
    }

    public WrapperBasicInformation fillUpLoanRequirement(String loanAmount, String purpose) {
        typeLoanAmountInField(loanAmount);
        selectLoanPurposeFromDropDown(purpose);
        clickOnCheckYourRateButton();
        return new WrapperBasicInformation();
    }
}
