package com.page.element;

import com.object.DriverObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageCommonElements extends DriverObject {

    public final static String LOADER_IS_HIDDEN = "[class='sc-jSFkmK dLMIuA']";
    public final static String LOADER_IS_VISIBLE ="[class='sc-jSFkmK hNVbGr']";

    public static WebElement loaderIsHide(){
        return driver.findElement(By.cssSelector(LOADER_IS_HIDDEN));
    }

    public static WebElement loaderIsVisible(){
        return driver.findElement(By.cssSelector(LOADER_IS_VISIBLE));
    }

    public static By loaderIsHideBy(){
        return By.cssSelector(LOADER_IS_HIDDEN);
    }

    public static By loaderIsVisibleBy(){
        return By.cssSelector(LOADER_IS_VISIBLE);
    }

    public static WebElement findTextElement(String text){
        return driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]"));
    }
}