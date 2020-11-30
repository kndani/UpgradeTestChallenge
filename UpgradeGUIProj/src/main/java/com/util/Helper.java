package com.util;

import com.object.DriverObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
    public static WebDriverWait wait;

    public static void selectDropDownOptionByVisibleText(WebElement webElement, String optionByVisibleText) {
        initWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        Select select = new Select(webElement);
        select.selectByVisibleText(optionByVisibleText);
    }

    public static void typeInField(WebElement webElement, String value) {
        initWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(value);
    }

    public static void clickOnWebElement(WebElement webElement) {
        initWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }

    public static void waitForElementToBeVisible(WebElement webElement) {
      initWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
    }

    public static String getTextFromElement(WebElement webElement) {
        return webElement.getText();
    }


    public static void waitForElementToBePresent(By by) {
        initWebDriverWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static boolean isTextPresent(WebElement webElement, String text){
        return initWebDriverWait().until(ExpectedConditions.textToBePresentInElement(webElement,text));
    }

    public static void navigateToURL(String url){
        DriverObject.driver.navigate().to(url);
    }

    public static void waitForSeconds(int timeInSeconds){
        try{
            while(timeInSeconds >0){
                Thread.sleep(1000);
                timeInSeconds--;
            }
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
    }

    public static WebDriverWait initWebDriverWait() {
        if (wait == null) {
            wait = new WebDriverWait(DriverObject.driver, 30);
        }
        return wait;
    }
}
