package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum SourcePlatformOptions {

    WEB("WEB"),
    
    MOBILE("MOBILE"),
    
    MOBILE_ANDROID("MOBILE_ANDROID"),
    
    MOBILE_IOS("MOBILE_IOS"),
    
    OFFLINE("OFFLINE"),
    
    PINTEREST_WEB("PINTEREST_WEB"),
    
    PINTEREST_ANDROID("PINTEREST_ANDROID"),
    
    PINTEREST_IOS("PINTEREST_IOS"),
    
    POINT_OF_SALE("POINT_OF_SALE")

    private final String value

    SourcePlatformOptions(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
