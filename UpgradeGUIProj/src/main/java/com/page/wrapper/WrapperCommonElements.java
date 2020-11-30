package com.page.wrapper;

import com.page.element.PageCommonElements;
import com.util.Helper;

public class WrapperCommonElements extends PageCommonElements {

    public static void waitForPageToLoad(){
        waitForLoaderToBeVisible();
        waitForLoaderToBeInvisible();
    }

    public static void waitForLoaderToBeInvisible(){
        Helper.waitForElementToBePresent(loaderIsHideBy());
        Helper.waitForSeconds(2);//extra seconds for loader to be visible
    }

    public static void waitForLoaderToBeVisible(){
        Helper.waitForElementToBePresent(loaderIsVisibleBy());
        Helper.waitForSeconds(2);//extra seconds for loader to be invisible
    }
}