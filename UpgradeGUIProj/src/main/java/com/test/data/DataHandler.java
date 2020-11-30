package com.test.data;

import org.testng.annotations.DataProvider;

import java.util.HashMap;
import java.util.Map;

public class DataHandler {

    public static Map<String, String> loanOfferData = new HashMap<String, String>();

    @DataProvider(name = "LoanApplicationData")
    public Object[][] setLoanApplicationData() {
        return new Object[][]
                {
                        {"2000", "Other", "Jenny", "Smith", "1801 Hwy 78 E, Jasper, AL, USA", "01/11/1990", "150000", "10000"}
                };
    }

    @DataProvider(name = "LoanApplicationFiledValidation")
    public Object[][] setLoanApplicationValidationMessageData() {
        return new Object[][]
                {
                        {"", "Other", "This field is required"},
                        {"100", "Other", "Please enter loan amount between $1,000 and $50,000."}
                };
    }

    @DataProvider(name = "BasicInformationFieldValidation")
    public Object[][] setBasicInformationValidationMessageData() {
        return new Object[][]
                {
                        {"2000","Other","", "Smith", "1801 Hwy 78 E, Jasper, AL, USA", "01/01/1995", "This field is required"},
                        {"2000","Other","John", "", "1801 Hwy 78 E, Jasper, AL, USA", "01/01/1995", "This field is required"},
                        {"2000","Other","John", "Smith", "1801 Hwy 78 E, Jasper, AL, USA", "01/01/2010", "You must be at least 18 years old."},
                };
    }
}

