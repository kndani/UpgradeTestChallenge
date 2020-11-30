package com.test.data;

import org.testng.annotations.DataProvider;

import java.util.HashMap;
import java.util.Map;

public class DataHandler {

    Map<String, String> addHeader = new HashMap<String, String>();

    @DataProvider(name="ValidateCredential")
    public Object[][] getUserCredentials(){
        return new Object[][]{
                {
                    "{\"username\":\"coding.challenge.login@upgrade.com\",\"password\":\"On$3XcgsW#9q\"}",
                    "x-cf-source-id=coding-challenge,x-cf-corr-id=df1fa820-2f80-11eb-adc1-0242ac120002,Content-Type=application/json", 200,
                    "productType", "PERSONAL_LOAN"
                },
                {
                        "{\"username\":\"coding.challenge.login@upgrade.com\",\"password\":\"INVALIDPASSWORD\"}",
                        "x-cf-source-id=coding-challenge,x-cf-corr-id=df1fa820-2f80-11eb-adc1-0242ac120002,Content-Type=application/json", 401,
                        "codeName", "INVALID_CREDENTIALS"
                },
                {
                        "{\"username\":\"\",\"password\":\"On$3XcgsW#9q\"}",
                        "x-cf-source-id=coding-challenge,x-cf-corr-id=df1fa820-2f80-11eb-adc1-0242ac120002,Content-Type=application/json", 400,
                        "message", "Invalid request for object: loginRequest, fields [ { username:  } ], violations [ ]"
                },
                {
                        "{\"username\":\"\",\"password\":\"\"}",
                        "x-cf-source-id=coding-challenge,x-cf-corr-id=df1fa820-2f80-11eb-adc1-0242ac120002,Content-Type=application/json", 400,
                        "message", "Invalid request for object: loginRequest, fields [ { username:  } { password:  } ], violations [ ]"
                },
                {
                        "",
                        "x-cf-source-id=coding-challenge,x-cf-corr-id=df1fa820-2f80-11eb-adc1-0242ac120002,Content-Type=application/json", 500,
                        "message", "Unexpected server exception of type HttpMessageNotReadableException"
                },
                {
                        "{\"username\":\"coding.challenge.login@upgrade.com\",\"password\":\"On$3XcgsW#9q\"}",
                        "x-cf-source-id=coding-challenge,x-cf-corr-id=TestUUID,Content-Type=application/json", 500,
                        "error", "Internal Server Error"
                }
        };
    }
}
