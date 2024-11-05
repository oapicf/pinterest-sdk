package org.openapitools.model;

import groovy.transform.Canonical

enum TargetingSpecAppType {

    ANDROID_MOBILE("android_mobile"),
    
    ANDROID_TABLET("android_tablet"),
    
    IPAD("ipad"),
    
    IPHONE("iphone"),
    
    WEB("web"),
    
    WEB_MOBILE("web_mobile")

    private final String value

    TargetingSpecAppType(String value) {
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
