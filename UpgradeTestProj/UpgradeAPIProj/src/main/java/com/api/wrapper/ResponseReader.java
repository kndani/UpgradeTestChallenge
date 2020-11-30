package com.api.wrapper;

import com.api.wrapper.SendRequest;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;

public class ResponseReader extends SendRequest {

    private static boolean attributeValueFound = false;
    private static String attributeValue = "Attribute not found";

    public static String traversJSONResponse(JSONObject jsonObject, String attributeName){
        Iterator<?> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = (String) keys.next();
            if(jsonObject.get(key) instanceof JSONArray){
                JSONArray jsonArray = ((JSONArray) jsonObject.get(key));
                for(int i=0;i<jsonArray.length();i++){
                    if (jsonArray.get(i) instanceof JSONObject) {
                        traversJSONResponse((JSONObject) jsonArray.get(i), attributeName);
                        if(attributeValueFound){
                            return attributeValue;
                        }
                    }
                }
            } else if(key.equals(attributeName)){
                attributeValueFound=true;
                attributeValue=(String) jsonObject.getString(key);
                return attributeValue;
            }
        }
        return attributeValue;
    }

    public static String getValueFromResponse(String attributeName){
        JSONObject jsonObject = new JSONObject(SendRequest.getResponse().getBody().asString());
        return traversJSONResponse(jsonObject, attributeName);
    }
}
