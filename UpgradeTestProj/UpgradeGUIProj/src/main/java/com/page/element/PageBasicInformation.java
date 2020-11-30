package com.page.element;

import com.object.DriverObject;
import com.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageBasicInformation extends DriverObject {

    private final static String FIRST_NAME_FILED ="//input[@data-auto='borrowerFirstName']";
    private final static String LAST_NAME_FIELD ="//input[@data-auto='borrowerLastName']";
    private final static String HOME_ADDRESS_FIELD = "//input[@data-auto='borrowerStreet']";
    private final static String CITY_NAME_FIELD ="//input[@data-auto='borrowerCity']";
    private final static String STATE_NAME_FIELD ="//input[@data-auto='borrowerState']";
    private final static String ZIP_CODE_FIELD ="//input[@data-auto='borrowerZipCode']";
    private final static String DATE_OF_BIRTH_FIELD ="//input[@data-auto='borrowerDateOfBirth']";
    private final static String CONTINUE_BUTTON ="//button[@data-auto='continuePersonalInfo']";
    private final static String AUTO_COMPLETE_DROP_DOWN ="//div[@class='geosuggest__suggests-wrapper']/ul";

    public static WebElement firstNameField(){
        return driver.findElement(By.xpath(FIRST_NAME_FILED));
    }

    public static WebElement lastNameField(){
        return driver.findElement(By.xpath(LAST_NAME_FIELD));
    }

    public static WebElement homeAddressField(){
        return driver.findElement(By.xpath(HOME_ADDRESS_FIELD));
    }

    public static WebElement cityNameField(){
        return driver.findElement(By.xpath(CITY_NAME_FIELD));
    }

    public static WebElement stateNameField(){
        return driver.findElement(By.xpath(STATE_NAME_FIELD));
    }

    public static WebElement zipCodeField(){
        return driver.findElement(By.xpath(ZIP_CODE_FIELD));
    }

    public static WebElement dateOfBirthField(){
        return driver.findElement(By.xpath(DATE_OF_BIRTH_FIELD));
    }

    public static WebElement continueButton(){
        return driver.findElement(By.xpath(CONTINUE_BUTTON));
    }

    public static WebElement autoCompleteDropDown(){
        return driver.findElement(By.xpath(AUTO_COMPLETE_DROP_DOWN));
    }

    public static WebElement autoCompleteOption(String optionText){
        return driver.findElement(By.xpath("//span[normalize-space(.) = '"+optionText+"']"));
    }

}
