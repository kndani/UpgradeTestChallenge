package com.test.testcases;

import com.object.Constant;
import com.page.wrapper.*;
import com.test.data.DataHandler;
import com.util.Helper;
import com.util.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_CheckYourRate extends TestBase {

    @Test(dataProvider = "LoanApplicationData", dataProviderClass = DataHandler.class)
    public void givenLoanRequirement_andProvidedBasicInfo_andIncomeDetails_whenUserClickCheckYourRateButton_thenShowLoanOffer(
            String LoanAmount, String purpose, String firstName, String lastName, String address, String dob, String indiAnnualIncome, String addAnnualIncome ){
        //Fill up loan requirements
        WrapperPersonalLoanAndCard personalLoanApplication = new WrapperPersonalLoanAndCard();
        personalLoanApplication.typeLoanAmountInField(LoanAmount);
        personalLoanApplication.selectLoanPurposeFromDropDown(purpose);
        WrapperBasicInformation basicInformation = personalLoanApplication.clickOnCheckYourRateButton();

        //Fill up basic information
        basicInformation.typeInFirstNameField(firstName);
        basicInformation.typeInLastNameField(lastName);
        basicInformation.typeInHomeAddressField(address);
        basicInformation.typeInDateOfBirthField(dob);
        WrapperAnnualIncome annualIncome = basicInformation.clickOnContinueButton();

        //Fill up annual income details
        annualIncome.typeInIndividualAnnualIncome(indiAnnualIncome);
        annualIncome.typeInAdditionalAnnualIncome(addAnnualIncome);
        WrapperUserCredential userCredentail = annualIncome.clickOnContinueButton();

        //Create account
        userCredentail.typeInEmailAddressField(Constant.USER_NAME);
        userCredentail.typeInPasswordField(Constant.PASSWORD);
        userCredentail.clickAgreementsCheckbox();
        WrapperOffer offer = userCredentail.clickOnCheckYourRateButton();

        //Get Offer Details
        offer.collectOfferDetails();
        offer.clickOnMenu();
        offer.clickOnSignOut();

        //Verification
        userCredentail.navigateToLoginPage();
        userCredentail.typeInEmailAddressField(Constant.USER_NAME);
        userCredentail.typeInPasswordField(Constant.PASSWORD);
        userCredentail.clickOnLoginButton();
        Assert.assertEquals(offer.getLoanAmount(), DataHandler.loanOfferData.get(Constant.LOAN_AMOUNT));
        Assert.assertEquals(offer.getMonthlyPayment(), DataHandler.loanOfferData.get(Constant.MONTHLY_PAYMENT));
        Assert.assertEquals(offer.getMonthTerm(), DataHandler.loanOfferData.get(Constant.MONTH_TERM));
        Assert.assertEquals(offer.getInterestRate(), DataHandler.loanOfferData.get(Constant.INTEREST_RATE));
        Assert.assertEquals(offer.getAPR(), DataHandler.loanOfferData.get(Constant.APR));
    }

    @Test(dataProvider = "LoanApplicationFiledValidation", dataProviderClass = DataHandler.class)
    public void givenLoanRequirementForm_andUserEnterIncorrectValue_whenUserSubmitForm_thenShowValidationMessage(
            String LoanAmount, String purpose, String expectedValMsg
    ){

        //Fill up loan requirements
        WrapperPersonalLoanAndCard personalLoanApplication = new WrapperPersonalLoanAndCard();
        personalLoanApplication.typeLoanAmountInField(LoanAmount);
        personalLoanApplication.selectLoanPurposeFromDropDown(purpose);
        personalLoanApplication.clickOnCheckYourRateButton();
        Assert.assertEquals(personalLoanApplication.isLoanAmountFieldValidationDisplayed(expectedValMsg), true);
    }

    @Test(dataProvider = "BasicInformationFieldValidation", dataProviderClass = DataHandler.class)
    public void givenBasicInformationForm_andUserEnterIncorrectValue_whenUserSubmitForm_thenShowValidationMessage(String LoanAmount, String purpose,
            String firstName, String lastName, String address, String dob, String expectedValMsg
    ){
        WrapperBasicInformation wrapperBasicInformation = new WrapperPersonalLoanAndCard().fillUpLoanRequirement(LoanAmount, purpose);
        wrapperBasicInformation.typeInFirstNameField(firstName);
        wrapperBasicInformation.typeInLastNameField(lastName);
        wrapperBasicInformation.typeInHomeAddressField(address);
        wrapperBasicInformation.typeInDateOfBirthField(dob);
        wrapperBasicInformation.clickOnContinueButton();
        Assert.assertEquals(wrapperBasicInformation.isLoanAmountFieldValidationDisplayed(expectedValMsg), true);
    }
}
