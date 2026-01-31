package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class AppTypeMultipliers {

    enum APPTYPEEnum {
    
        ANDROID_MOBILE("android_mobile"),
        
        ANDROID_TABLET("android_tablet"),
        
        IPAD("ipad"),
        
        IPHONE("iphone"),
        
        WEB("web"),
        
        WEB_MOBILE("web_mobile")
    
        private final String value
    
        APPTYPEEnum(String value) {
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

    
    APPTYPEEnum APP_TYPE
}
