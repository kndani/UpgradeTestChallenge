package com.page.wrapper;

import com.page.element.PageBasicInformation;
import com.page.element.PageCommonElements;
import com.util.Helper;

public class WrapperBasicInformation extends PageBasicInformation {

    public void typeInFirstNameField(String value){
        Helper.typeInField(firstNameField(), value);
    }

    public void typeInLastNameField(String value){
        Helper.typeInField(lastNameField(), value);
    }

    public void typeInHomeAddressField(String value){
        Helper.typeInField(homeAddressField(), value);
        Helper.waitForElementToBeVisible(autoCompleteDropDown());
        Helper.clickOnWebElement(autoCompleteOption(value));
    }

    public void typeInCityField(String value){
        Helper.typeInField(cityNameField(), value);
    }

    public void typeInStateField(String value){
        Helper.typeInField(stateNameField(), value);
    }

    public void typeInZipCodeField(String value){
        Helper.typeInField(zipCodeField(), value);
    }

    public void typeInDateOfBirthField(String value){
        Helper.typeInField(dateOfBirthField(), value);
    }

    public WrapperAnnualIncome clickOnContinueButton(){
        Helper.clickOnWebElement(continueButton());
        return new WrapperAnnualIncome();
    }

    public boolean isLoanAmountFieldValidationDisplayed(String validationMessage){
        return Helper.isTextPresent(PageCommonElements.findTextElement(validationMessage),validationMessage);
    }
}
