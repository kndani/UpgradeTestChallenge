package com.util;

import com.object.Constant;
import com.object.DriverObject;
import org.testng.annotations.*;

public class TestBase extends DriverObject {

    @BeforeMethod
    @Parameters({"driverPath"})
    public void beforeTest(String driverPath){
        startBrowser("firefox",driverPath);
        driver.get(Constant.DM_FUNNEL);
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

}
