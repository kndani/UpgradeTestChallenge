package com.util;

import java.util.HashMap;
import java.util.Map;

public class Helper {

    public static Map<String, String> getHeadersMa(String headersValue){
        Map<String, String> headersMap = new HashMap<String, String>();
        String headers[] = headersValue.split(",");
        for(String header:headers){
            headersMap.put(header.split("=")[0],header.split("=")[1]);
        }
        return headersMap;
    }
}
