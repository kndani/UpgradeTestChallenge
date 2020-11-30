package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverObject {

    public static WebDriver driver;

    //This method will open browser
    public static void startBrowser(String browserName, String driverPath){
        if(driver == null){
            if (browserName.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver", driverPath);
                driver = new FirefoxDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }
}
