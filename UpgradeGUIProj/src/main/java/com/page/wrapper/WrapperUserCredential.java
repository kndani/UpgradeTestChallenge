package com.page.wrapper;

import com.object.Constant;
import com.page.element.PageUserCredential;
import com.util.Helper;

public class WrapperUserCredential extends PageUserCredential {

    public void typeInEmailAddressField(String value){
        Helper.typeInField(emailAddressField(), value);
    }

    public void typeInPasswordField(String value){
        Helper.typeInField(passwordField(), value);
    }

    public void clickAgreementsCheckbox(){
        Helper.clickOnWebElement(agreementsCheckbox());
    }

    public WrapperOffer clickOnCheckYourRateButton(){
        Helper.clickOnWebElement(checkYourRateButton());
        return new WrapperOffer();
    }

    public void clickOnLoginButton(){
        Helper.clickOnWebElement(loginButton());
        WrapperCommonElements.waitForLoaderToBeInvisible();
    }

    public void navigateToLoginPage(){
        Helper.navigateToURL(Constant.LOGIN_URL);
    }
}
