package com.test.testcases;

import com.objects.Constant;
import com.api.wrapper.ResponseReader;
import com.api.wrapper.SendRequest;
import com.test.data.DataHandler;
import com.util.Helper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_VerifyLoginCredential {

    @Test(dataProvider="ValidateCredential", dataProviderClass = DataHandler.class)
    public void givenUserCredential_whenUserRequestLogin_thenCheckIfUserIsAuthorizedOrUnAuthorized(String requestBody, String headers, int statusCode,
                                                     String expectedValueAttribute ,String expectedValue) {
        SendRequest.setBaseURI(Constant.baseURI);
        SendRequest.setEndPath(Constant.endPath);
        SendRequest.setBody(requestBody);
        SendRequest.setHeader(Helper.getHeadersMa(headers));
        SendRequest.sendPostRequest();
        Response response = SendRequest.getResponse();
        Assert.assertEquals(statusCode, response.getStatusCode());
        Assert.assertEquals(ResponseReader.getValueFromResponse(expectedValueAttribute),expectedValue);
    }
}